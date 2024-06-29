package Task20;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Datepicker extends MainChrome{

    @Test
    public void Data()
    {
        // Navigate to the URL
        chromeDriver.get("https://jqueryui.com/datepicker/");
        // Maximize the browser window
        chromeDriver.manage().window().maximize();

        // Switch to the iframe containing the datePicker
        chromeDriver.switchTo().frame(chromeDriver.findElement(By.className("demo-frame")));

        //click dateInput field

        WebElement dateInput = chromeDriver.findElement(By.xpath("//input[@id='datepicker']"));
        dateInput.click();

        // Click the button to navigate to the next month

        WebElement nextMonth = chromeDriver.findElement(By.cssSelector(".ui-datepicker-next"));
        nextMonth.click();

        // Select the date "22" from the datePicker
        WebElement dateToSelect =chromeDriver.findElement(By.xpath("//a[text()='22']"));
        dateToSelect.click();

        // Get the selected date value and print it to the console
        String selectedDate = dateInput.getAttribute("value");
        System.out.println("Selected date: " + selectedDate);

        // Close the browser window and quit the WebDriver instance
        // chromeDriver.quit();
    }
}