
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

    @Test
    public void clickOnTheSingleCheckboxCheckmark() throws InterruptedException{
        driver.findElement(By.linkText("Checkbox Demo")).click();
        checkboxPage.clickOnSingleCheckbox();

        String actualResult = driver.findElement(By.cssSelector("#txtAge")).getText();
        Assert.assertTrue(actualResult.contains("Checked"));
    }
}
