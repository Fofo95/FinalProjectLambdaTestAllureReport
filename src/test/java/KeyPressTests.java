import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.KeyPressPage;

public class KeyPressTests extends BasePage {
    private KeyPressPage keyPressPage;
    private static final By KEY_PRESS_LINK_TEXT = By.linkText("Key Press"); // Define the constant locator

    @BeforeMethod
    public void setUp() {
        super.setUp();
        keyPressPage = new KeyPressPage(driver);
    }
    @Description("Write a letter and check the result")
    @Test
    public void writeALetterAndCheckTheResult(){
        driver.findElement(KEY_PRESS_LINK_TEXT).click();
        keyPressPage.typeInTheTextField("T");

        String actualResult = driver.findElement(By.id("result")).getText();
        Assert.assertEquals(actualResult, "You entered: T");
    }






    @Description ("Write an integer and check the result")
    @Test
    public void writeAnIntegerAndCheckTheResult(){
        driver.findElement(KEY_PRESS_LINK_TEXT).click();
        keyPressPage.typeInTheTextField("1");

        String actualResult = driver.findElement(By.id("result")).getText();
        Assert.assertTrue(actualResult.contains("1"));
    }
    @Description ("Write a special character and check the result")
    @Test
    public void writeSpecialCharacterAndCheckTheResult(){
        driver.findElement(KEY_PRESS_LINK_TEXT).click();
        keyPressPage.typeInTheTextField("{");

        String actualResult = driver.findElement(By.id("result")).getText();
        System.out.println(actualResult);
        Assert.assertEquals(actualResult, "You entered: OPEN_BRACKET");
    }

    @Description ("Type SHIFT and check the result")
    @Test
    public void typeShiftAndCheckTheResult(){
        driver.findElement(KEY_PRESS_LINK_TEXT).click();
        keyPressPage.typeInShiftKey();

        String actualResult = driver.findElement(By.id("result")).getText();
        System.out.println(actualResult);
        Assert.assertEquals(actualResult, "You entered: SHIFT");
    }
    @Description ("Type ALT character and check the result")
    @Test
    public void typeAltAndCheckTheResult(){
        driver.findElement(KEY_PRESS_LINK_TEXT).click();
        keyPressPage.typeInALTKey();

        String actualResult = driver.findElement(By.id("result")).getText();
        System.out.println(actualResult);
        Assert.assertEquals(actualResult, "You entered: ALT");
    }
    @Description ("Type % character and check the result")
    @Test
    public void typePercentageArrowUpAndCheckTheResult(){
        driver.findElement(KEY_PRESS_LINK_TEXT).click();
        keyPressPage.typeInArrowUpKey();

        String actualResult = driver.findElement(By.id("result")).getText();
        System.out.println(actualResult);
        Assert.assertEquals(actualResult, "You entered: UP");
    }
}
