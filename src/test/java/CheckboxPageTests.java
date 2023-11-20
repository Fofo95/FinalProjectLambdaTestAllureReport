
import org.openqa.selenium.*;
import org.testng.*;
import org.testng.annotations.*;
import pages.BasePage;
import pages.CheckboxPage;

public class CheckboxPageTests extends BasePage{
    private CheckboxPage checkboxPage;

    @BeforeMethod
    public void setUp(){
        super.setUp();
        checkboxPage = new CheckboxPage(driver);
    }

    @Test()
    public void clickOnTheSingleCheckboxCheckmark(){
        driver.findElement(By.linkText("Checkbox Demo")).click();
        checkboxPage.clickOnSingleCheckbox();

        String actualResult = driver.findElement(By.cssSelector("#txtAge")).getText();
        Assert.assertTrue(actualResult.contains("Checked"));
        checkboxPage.clickOnSingleCheckbox();

        String actualResult2 = driver.findElement(By.cssSelector("#txtAge")).getText();
        Assert.assertFalse(actualResult2.contains("Checked"));
    }

    @Test
    public void clickOnTheCheckAllButton(){
        driver.findElement(By.linkText("Checkbox Demo")).click();
        checkboxPage.clickOnTheCheckAllButton();

        String actualResult = driver.findElement(By.cssSelector("input[value=\"Uncheck All\"]")).getAccessibleName();
        System.out.println(actualResult);
        Assert.assertTrue(actualResult.contains("Uncheck All"));
    }
}
