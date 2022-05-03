package login.com.herokuapp.internet_the.testsuit;

import login.com.herokuapp.internet_the.pages.HomePage;
import login.com.herokuapp.internet_the.pages.LoginPage;
import login.com.herokuapp.internet_the.testbase.TestBase;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends TestBase {


    LoginPage loginPage = new LoginPage();

    @Test
    public void verifyUserShouldNavigateToLoginPage() {
        //enter valid value
        loginPage.enterUsarName("tomsmith");
        loginPage.enterPassword("SuperSecretPassword!");
        loginPage.clickOnLoginButton();
        //validate message
        String expectedMessage = "Secure Area";
        String actualMessage = loginPage.getSecureText();

        Assert.assertEquals(expectedMessage, actualMessage, "Secure text not displayed");

    }

    @Test
    public void verifyTheUsernameErrorMessage() {
        //enter invalid username and validate error message
        loginPage.enterUsarName("tomsmith1");
        loginPage.enterPassword("SuperSecretPassword!");
        loginPage.clickOnLoginButton();

        String expectedDisplay = "Your username is invalid!";
        String actualDisplay = loginPage.verifyUserErrorMessage().substring(0, 25);

        Assert.assertEquals(actualDisplay, expectedDisplay, "error message not displayed");

    }

    @Test
    public void verifyThePasswordErrorMessage() {
        //enter invalid password and validate error
        loginPage.enterUsarName("tomsmith");
        loginPage.enterPassword("SuperSecretPassword!1");
        loginPage.clickOnLoginButton();

        String expectedDisplay = "Your password is invalid!";
        String actualDisplay = loginPage.verifyPasswordErrorMessage().substring(0, 25);

        Assert.assertEquals(actualDisplay, expectedDisplay, "error message not displayed");

    }

}
