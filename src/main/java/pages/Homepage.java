package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Utility;

import static testbase.WebTestBase.driver;

public class Homepage {

    @FindBy(xpath = "//a[@class-'user-controls_ul_li_a']")
    WebElement loginBtn;

    @FindBy(xpath = "//a[@class='newsletter_']")
    WebElement secondAdvertised;

    public  Homepage(WebDriver driver){
        PageFactory.initElements(driver, this);}

        public void loginclick(){
        loginBtn.click();
    }
    public void closedFristAdvertised(){
        Utility.waitUntilElementToBeClick(driver,frist);
    }
}
