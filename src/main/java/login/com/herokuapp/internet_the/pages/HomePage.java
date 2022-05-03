package login.com.herokuapp.internet_the.pages;


import login.com.herokuapp.internet_the.utility.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {

       By loginLink = By.linkText("Log in");
       By registerLink = By.linkText("Register");

       public void clickOnLoginLink(){

           clickOnElement(loginLink);

       }
       public void registerLink(){

           clickOnElement(registerLink);
       }





}
