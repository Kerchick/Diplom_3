package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class ProfilePageLocators {
    public ProfilePageLocators(WebDriver driver) {
        this.driver = driver;
    }
    private final WebDriver driver;

    // Локатор кнопки выход в профиле
    private final By logoutButton = By.xpath("//div/main/div/nav/ul/li[3]/button");
    private final By accountText = By.xpath("//div/main/div/nav/p");

    public void clickLogoutButton() {
        driver.findElement(logoutButton).click();
    }

    public void findAccountText() {
        new WebDriverWait(driver, 5).until(ExpectedConditions.presenceOfElementLocated(accountText));
    }
}
