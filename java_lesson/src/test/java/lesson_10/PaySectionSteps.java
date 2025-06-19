package lesson_10;

import java.util.List;
import org.openqa.selenium.WebElement;

public class PaySectionSteps {
    private final PaySection paySection;

    public PaySectionSteps(PaySection paySection) {
        this.paySection = paySection;
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

    public WebElement selectOption(String visibleText) {
        List<WebElement> options = paySection.getSelectList();
        for (WebElement option : options) {
            if (option.getText().contains(visibleText)) {
                return option;
            }
        }
        return null;
    }
}