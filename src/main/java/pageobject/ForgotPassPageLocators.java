package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgotPassPageLocators {
    public ForgotPassPageLocators(WebDriver driver) {
        this.driver = driver;
    }
    private final WebDriver driver;

    // Локатор кнопки войти
    private final By forgotPassLoginButton = By.xpath(".//a[@class = 'Auth_link__1fOlj']");

    public void clickForgotPassLoginButton() {
        driver.findElement(forgotPassLoginButton).click();

    }
}
