package lesson_10;

import org.junit.jupiter.api.*;
import org.openqa.selenium.WebElement;
import static org.junit.jupiter.api.Assertions.*;

public class PaySectionTest extends LoadTest {
    private PaySection paySection;
    private PaymentFrame paymentFrame;
    private PaySectionSteps steps;
    private final String item1 = "Услуги связи";
    private final String item2 = "Домашний интернет";
    private final String item3 = "Рассрочка";
    private final String item4 = "Задолженность";

    @BeforeEach
    void setUp() {
        paySection = new PaySection(driver, wait);
        paymentFrame = new PaymentFrame(driver, wait);
        steps = new PaySectionSteps(paySection);
    }

    @Test
    void testBlockTitle() {
        String actual = paySection.getBlockTitle().getText()
            .replace("\n", " ")
            .replaceAll("\\s+", " ")
            .trim();
        assertEquals("Онлайн пополнение без комиссии", actual, "The title does not match the expectation");
    }

    @Test
    void testLogos() {
        assertFalse(paySection.getLogos().isEmpty());
    }

    @Test
    void testLink() {
        paySection.getLink().click();
        assertTrue(driver.getCurrentUrl().contains("https://www.mts.by/help/poryadok-oplaty-i-bezopasnost-internet-platezhey/"),
            "The link does not lead to the expected URL");
    }

    @Test 
    void testPlaceholder1() {
        steps.clickSelectButton()
             .selectOption(item1)
             .click();
        assertEquals(item1, paySection.getSelectSpan().getText(),
            "The selected option does not match the expected value: " + item1);
        assertEquals("Номер телефона", paySection.getPhoneInput().getAttribute("placeholder"),
            "Incorrect placeholder for phone input");
        assertEquals("Сумма", paySection.getSumInput().getAttribute("placeholder"),
            "Incorrect placeholder for sum input");
        assertEquals("E-mail для отправки чека", paySection.getEmailInput().getAttribute("placeholder"),
            "Incorrect placeholder for email input");
    }

    @Test
    void testPlaceholder2() {
        steps.clickSelectButton()
             .selectOption(item2)
             .click();
        assertEquals(item2, paySection.getSelectSpan().getText(),
            "The selected option does not match the expected value: " + item2);
        assertEquals("Номер абонента", paySection.getPhoneInternetInput().getAttribute("placeholder"),
            "Incorrect placeholder for phone input");
        assertEquals("Сумма", paySection.getSumInternetInput().getAttribute("placeholder"),
            "Incorrect placeholder for sum input");
        assertEquals("E-mail для отправки чека", paySection.getEmailInternetInput().getAttribute("placeholder"),
            "Incorrect placeholder for email input");
    }

    @Test
    void testPlaceholder3() {
        steps.clickSelectButton()
             .selectOption(item3)
             .click();
        assertEquals(item3, paySection.getSelectSpan().getText(),
            "The selected option does not match the expected value: " + item3);
        assertEquals("Номер счета на 44", paySection.getScoreInstalmentInput().getAttribute("placeholder"),
            "Incorrect placeholder for phone input");
        assertEquals("Сумма", paySection.getSumInstalmentInput().getAttribute("placeholder"),
            "Incorrect placeholder for sum input");
        assertEquals("E-mail для отправки чека", paySection.getEmailInstalmentInput().getAttribute("placeholder"),
            "Incorrect placeholder for email input");
    }

    @Test
    void testPlaceholder4() {
        steps.clickSelectButton()
             .selectOption(item4)
             .click();
        assertEquals(item4, paySection.getSelectSpan().getText(),
            "The selected option does not match the expected value: " + item4);
        assertEquals("Номер счета на 2073", paySection.getScopeArrearsButton().getAttribute("placeholder"),
            "Incorrect placeholder for phone input");
        assertEquals("Сумма", paySection.getSumArrearsInput().getAttribute("placeholder"),
            "Incorrect placeholder for sum input");
        assertEquals("E-mail для отправки чека", paySection.getEmailArrearsInput().getAttribute("placeholder"),
            "Incorrect placeholder for email input");
    }

    @Test
    void testForm() {
        String phone = "297777777";
        String sum = "125";
        String email = "gmail@gmail.com";
        steps.fillPhoneInput(phone)
             .fillSumInput(sum)
             .fillEmailInput(email)
             .clickPayButton();
        WebElement paymentForm = paySection.getPaymentForm();
        driver.switchTo().frame(paymentForm);
        assertEquals("125.00 BYN", paymentFrame.getPaymentSum().getText(),
            "The payment sum does not match the expected value");
        assertEquals("Оплата: Услуги связи Номер:375297777777", paymentFrame.getPaymentInfo().getText(),
            "The payment info does not match the expected value");
        assertEquals("Номер карты", paymentFrame.getCCNumberPlaceholder().getText(),
            "Incorrect placeholder for card number input");
        assertEquals("Срок действия", paymentFrame.getCardDatePlaceholder().getText(),
            "Incorrect placeholder for card date");
        assertEquals("CVC", paymentFrame.getCardCVCPlaceholder().getText(),
            "Incorrect placeholder for CVC-code");
        assertEquals("Имя и фамилия на карте", paymentFrame.getCardHolderPlaceholder().getText(),
            "Incorrect placeholder for card owner name");
        assertFalse(paymentFrame.getCardTypeIcons().isEmpty());
        assertEquals("Оплатить 125.00 BYN", paymentFrame.getCardSubmitButton().getText(),
            "The submit button have incorrect sum");
    }
}