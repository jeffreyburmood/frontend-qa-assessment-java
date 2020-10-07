package com.saucedemo;
import com.saucedemo.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;


public class AssessmentTest extends BaseTest {

    /*
   From this URL: https://www.seleniumeasy.com/test/basic-first-form-demo.html
        1. Set the value of id user-message to "QA assessment trial #1"
        2. Click 'Show Message'
        3. Assert that "Your Message" matches "QA assessment trial #1"
*/
    @Test(enabled=true)
    public void shoudHaveCorrectMessage() {
        driver.get("https://www.seleniumeasy.com/test/basic-first-form-demo.html");

        WebDriverWait stdWait = new WebDriverWait(driver, 10, 5);
        stdWait.until(ExpectedConditions.titleContains("Simple Form"));

        driver.findElement(By.id("user-message")).sendKeys("QA assessment trial #1");
        driver.findElement(By.xpath("//*[@id='get-input']/button")).click();

        String responseMsg = driver.findElement(By.id("display")).getText();
        Assert.assertEquals(responseMsg, "QA assessment trial #1");
    }


    /*
    From this URL: https://www.seleniumeasy.com/test/basic-first-form-demo.html.
     Your next test should:
        1. Interact with the menu on the left of the page and click "Input Forms"
        2. On the sub-menu, click "Checkbox Demo"
        3. Under "Multiple Checkbox Demo" there are 2 bugs with the multiple checkbox component
        and it is up to you to figure out what it is and write a test that fails at least 1/2 conditions
        4. Hint: read the bulletpoints to help you find the bug(s)
*/
    @Test(enabled=true)
    public void checkboxTest() {
        driver.get("https://www.seleniumeasy.com/test/basic-first-form-demo.html");

        WebDriverWait stdWait = new WebDriverWait(driver, 10, 5);
        stdWait.until(ExpectedConditions.titleContains("Simple Form"));

        //driver.findElement(By.xpath("//*[@id='treemenu']/li/a")).click(); //expand list of examples
        driver.findElement(By.xpath("//*[@id='treemenu']/li/ul/li[1]/a")).click(); //expand input forms
        driver.findElement(By.xpath("//*[@id='treemenu']/li/ul/li[1]/ul/li[2]/a")).click(); //load checkbox demo page

        //stdWait.until(ExpectedConditions.titleContains("Checkbox demo"));
        stdWait.until(ExpectedConditions.elementToBeClickable(By.id("check1")));
        WebElement checkButton = driver.findElement(By.id("check1"));
        WebElement isChecked = driver.findElement(By.id("isChkd"));
        checkButton.click();
        boolean checked = driver.findElement(By.xpath("//*[@id='easycont']/div/div[2]/div[2]/div[2]/div[4]/label/input")).isSelected();
        System.out.println("checked value = " + checked);
    }

    @Test(enabled=false)
    public void multiCheckBoxTest() {

    }

    /*
    In real life we wouldn't waste precious seconds to mouse nav, sorry to make you do that.
    The next test is working with selectors but it would be far too easy to use native selects.
    My final test for you is to work with jquery selects.
        1. From this URL: https://www.seleniumeasy.com/test/jquery-dropdown-search-demo.html
        2. Under the country select Japan & assert the field value is Japan
        3. Under the multi select select Delaware & Vermont & assert the field values
        4. Under US Outlying Territories assert that Guam & United States Minor Outlying Islands are disabled
*/
    @Test(enabled=false)
    public void selectJapanTest(){

    }
    @Test(enabled=false)
    public void multiSelectDelewareAndVermont() {

    }
    @Test(enabled=false)
    public void validateDisabledValuesSelect() {

    }
}
