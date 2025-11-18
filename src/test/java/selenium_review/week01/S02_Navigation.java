package selenium_review.week01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class S02_Navigation {


    @Test
    public void testNavigation() {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://practice.cydeo.com");
        driver.navigate().to("https://practice.cydeo.com/abtest");

        driver.navigate().back();
        driver.navigate().refresh();
        driver.navigate().forward();

        driver.close();

    }
}
