package selenium_review.week02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestExamples {



    @Test

    public void test1(){


        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://practice.cydeo.com/registration_form");


        //locate your element
        By h2Locator = By.tagName("h2");

        //find your element
        WebElement element = driver.findElement(h2Locator);


        //interact with it
        System.out.println(element.getText());


        driver.close();

    }

    @Test

    public void test2(){


        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://practice.cydeo.com/registration_form");
        By locator=getLocator("male");

        WebElement element = driver.findElement(locator);

        element.click();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {

        }

        Assert.assertTrue(element.isSelected());
        driver.close();

    }

    private By getLocator(String value) {

      return   By.xpath("//input[@value='"+value+"']");
    }





}
