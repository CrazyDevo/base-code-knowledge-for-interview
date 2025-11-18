package selenium_review.week01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class S01_SetupBrowser {


    @Test
    public void testSetupBrowser() {
      //  WebDriver driver = new ChromeDriver();
        WebDriver driver=new FirefoxDriver();
        driver.manage().window().maximize();


        driver.close();

    }
}
