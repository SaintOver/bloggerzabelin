import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import javax.xml.soap.Text;

public class blogger
{
    @Test
    public void login()
    {
        System.setProperty("webdriver.chrome.driver", "./lib/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get ("http://localhost:7980/blogger");
        WebElement loginbuton = driver.findElement(By.linkText("Log In"));
        loginbuton.click();
        WebElement usernameinput = driver.findElement(By.id("j_username"));
        usernameinput.clear();
        usernameinput.sendKeys("admin");
        WebElement passwordinput = driver.findElement(By.id("j_password"));
        passwordinput.clear();
        passwordinput.sendKeys("admin");
        WebElement logincheck = driver.findElement(By.className("ui-button-text"));
        String text = logincheck.getText();
        System.out.println(text);
        if (text=="Login");
        logincheck.click();
        //driver.close();

    }


}
