package lesson_10;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PaySectionSteps {
    private final PaySection paySection;
    private final WebDriverWait wait;

    public PaySectionSteps(PaySection paySection, WebDriverWait wait) {
        this.paySection = paySection;
        this.wait = wait;
    }

    public PaySectionSteps fillPhoneInput(String text) {
        paySection.getPhoneInput().clear();
        paySection.getPhoneInput().sendKeys(text);
        return this;
    }

    public PaySectionSteps fillSumInput(String text) {
        paySection.getSumInput().clear();
        paySection.getSumInput().sendKeys(text);
        return this;
    }

    public PaySectionSteps fillEmailInput(String text) {
        paySection.getEmailInput().clear();
        paySection.getEmailInput().sendKeys(text);
        return this;
    }

    public PaySectionSteps clickPayButton() {
        paySection.getPayButton().click();
        return this;
    }

    public PaySectionSteps clickSelectButton() {
        paySection.getSelectButton().click();
        return this;
    }

    public PaySectionSteps selectOption(String visibleText) {
        List<WebElement> options = paySection.getSelectList();
        for (WebElement option : options) {
            if (option.getText().contains(visibleText)) {
                wait.until(ExpectedConditions.elementToBeClickable(option)).click();
                break;
            }
        }
        return this;
    }
}