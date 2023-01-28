package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.Homepage;
import pages.Loginpage;
import pages.MyAccountPage;
import testbase.WebTestBase;

public class LoginTest extends WebTestBase {
    Homepage homePage;
    Loginpage loginPage;
    MyAccountPage myAccountPage;

    public LoginTest(){
        super();
    }

    @BeforeMethod
    public void beforeMethod(){
        initialization();
        homePage = new Homepage(driver);
        loginPage = new Loginpage(driver);
        myAccountPage = new MyAccountPage(driver);
    }
    @Test
    public void verifyLoginWithValidCredential() {
        SoftAssert softAssert = new SoftAssert();
        homePage.loginclick();
        loginPage.login(prop.getProperty("userName"), prop.getProperty("password"));
        softAssert.assertEquals(myAccountPage.getTextOfMyAccountPage(),"MY ACCOUNT",  "MY ACCOUNT text should be match" );
        softAssert.assertAll();
    }
   @AfterMethod
   public void afterMethod(){
        driver.close();
   }


}
