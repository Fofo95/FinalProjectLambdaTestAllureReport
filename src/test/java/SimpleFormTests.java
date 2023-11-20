import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.SimpleFormPage;

public class SimpleFormTests extends BasePage {
    private SimpleFormPage simpleFormPage;
    private final By simpleFormDemoLink = By.linkText("Simple Form Demo"); // Define the constant locator
    @BeforeMethod
    public void setUp() {
        super.setUp();
        simpleFormPage = new SimpleFormPage(driver);
    }
    @Test ()
    public void enterMessageAndClickGetCheckedValue() {
        driver.findElement(simpleFormDemoLink).click(); // Use the constant locator
        simpleFormPage.enterTextInTextField("Test");
        simpleFormPage.clickOnGetCheckedValueButton();

        String actualResult = driver.findElement(By.id("message")).getText();
        System.out.println(actualResult);
        Assert.assertTrue(actualResult.contains("Test"));
    }

    // adaugati 3 teste pentru Two Input Fields


    @Test()
    public void enterTwoInputsAndClickOnGetSum() {
        driver.findElement(simpleFormDemoLink).click();
        simpleFormPage.enterValueInA("1");
        simpleFormPage.enterValueInB("3");
        simpleFormPage.clickOnGetValuesButtonAlternative();

        String actualResult = driver.findElement(By.cssSelector("#addmessage")).getText();
        Assert.assertTrue(actualResult.contains("4"));
    }
}
