package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;l

public class Loginpage {

    @FindBy(id = "userName")
    WebElement userNameTextBox;

    @FindBy(id = "password")
    WebElement passwordTextBox;

    @FindBy(id = "login")
    WebElement loginBtn;

    public  Loginpage(WebDriver driver){
        PageFactory.initElements(driver, this);}

    public void login(String userName, String password) {
        userNameTextBox.sendKeys(userName);
        passwordTextBox.sendKeys(password);
        loginBtn.click();

    }
    }

