package Task20;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.Wait;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import java.time.Duration;

public class Guvi extends MainChrome {

    @Test
    public  void signin()
    {
        chromeDriver.get("https://www.guvi.in/");

        // Locate the signup button on the top right corner of the page
        WebElement signupButton = chromeDriver.findElement(By.xpath("//a[contains(text(),'Sign up')]"));

        // Click the signup button
        signupButton.click();


        //locate Xpath
        WebElement username = chromeDriver.findElement(By.xpath("//input[@id='name']"));
        WebElement email = chromeDriver.findElement(By.xpath("//input[@id='email']"));
        WebElement password = chromeDriver.findElement(By.xpath("//input[@id='password']"));
        WebElement mobile = chromeDriver.findElement(By.xpath("//input[@id='mobileNumber']"));
        WebElement signup = chromeDriver.findElement(By.xpath("//a[@id='signup-btn']"));
        username.sendKeys("Suriya");
        email.sendKeys("suriya123@test.com");
        password.sendKeys("Test@1234");
        mobile.sendKeys("0123456789");
        signup.click();

        String title = "GUVI | Sign Up";
        if(chromeDriver.getTitle().equals(title)) {
            System.out.println("User register successfully");
        }
        else {
            System.out.println("User register failed");
        }

    }
    //login
    @Test
    public void login() {

        //load url
        chromeDriver.get("https://www.guvi.in");

        //click login
        WebElement login = chromeDriver.findElement(By.xpath("//a[@href=\"/sign-in/\"]"));
        login.click();


        //locate Xpath
        WebElement emailLogin = chromeDriver.findElement(By.xpath("//input[@id='email']"));
        WebElement passwordLogin = chromeDriver.findElement(By.xpath("//input[@id='password']"));
        WebElement submit = chromeDriver.findElement(By.xpath("//a[@id='login-btn']"));
        emailLogin.sendKeys("test123@test.com");
        passwordLogin.sendKeys("Test@1234");
        submit.click();

        String titleLogin = "GUVI | Login";
        if(chromeDriver.getTitle().equals(titleLogin)) {
            System.out.println("User login successfully");
        }
        else {
            System.out.println("User login failed");
        }


    }



}
