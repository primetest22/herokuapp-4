package login.com.herokuapp.internet_the.pages;

import login.com.herokuapp.internet_the.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {

    By secureText = By.xpath("//div[@class='example']//h2");
    By userNameField = By.xpath("//input[@id='username']");
    By passwordField = By.id("password");
    By loginButton = By.xpath("//i[contains(text(),'Login')]");
    By UserErrorMessage = By.xpath("//div[@class='flash error']");
    By UserPasswordMessage = By.xpath("//div[@class='flash error']");

    public String verifyUserErrorMessage(){
        return getTextFromElement(UserErrorMessage);
    }

    public String verifyPasswordErrorMessage(){
        return getTextFromElement(UserPasswordMessage);
    }


    public String getSecureText() {
        return getTextFromElement(secureText);
    }

    public void enterUsarName(String userName) {
        sendTextToElement(userNameField,userName);
    }

    public void enterPassword(String password) {
        sendTextToElement(passwordField, password);
    }

    public void clickOnLoginButton() {
        clickOnElement(loginButton);
    }




}
