import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.InputFormPage;

public class InputFormTests extends BasePage {
    private InputFormPage inputFormPage;
    private final By InputFormDemoLink = By.linkText("Input Form Submit");

    @BeforeMethod
    public void setUp() {
        super.setUp();
        inputFormPage = new InputFormPage(driver);
    }

    /*@Test
    public void FirstTestOfThePageInputFromSubmit(){
        driver.findElement(InputFormDemoLink).click();
        inputFormPage.enterTextInTextFieldName("Florin");
        inputFormPage.enterTextInTextFieldEmail("test@test.com");
        inputFormPage.enterTextInTextFieldPassword("Test1234");
        inputFormPage.enterTextInTextFieldCompany("FastTrackIt");
        inputFormPage.enterTextInTextFieldWebsite("www.google.ro");
        inputFormPage.selectTextInTextFieldCountry();
        inputFormPage.enterTextInTextFieldCity("Cluj Napoca");
        inputFormPage.enterTextInTextFieldAddress1("Address 1");
        inputFormPage.enterTextInTextFieldAddress2("Test");
        inputFormPage.enterTextInTextFieldState("RO");
        inputFormPage.enterTextInTextFieldZip("400500");


        inputFormPage.clickOnSubmit();
        String actualResult = driver.findElement(By.cssSelector(".mt-20 > button[type=submit]")).getAttribute("innerText");
        System.out.println(actualResult);
        Assert.assertTrue(actualResult.contains("Thanks for contacting us, we will get back to you shortly."));
    }*/

    @Description("Fill all the field with valid data and click on the submit button")
    @Test
    public void FirstTestOfThePageInputFromSubmit2(){
        driver.findElement(InputFormDemoLink).click();
        inputFormPage.enterTextInTextFieldName("Florin");
        inputFormPage.enterTextInTextFieldEmail("test@test.com");
        inputFormPage.enterTextInTextFieldPassword("Test1234");
        inputFormPage.enterTextInTextFieldCompany("FastTrackIt");
        inputFormPage.enterTextInTextFieldWebsite("www.google.ro");
        inputFormPage.selectTextInTextFieldCountry();
        inputFormPage.enterTextInTextFieldCity("Cluj Napoca");
        inputFormPage.enterTextInTextFieldAddress1("Address 1");
        inputFormPage.enterTextInTextFieldAddress2("Test");
        inputFormPage.enterTextInTextFieldState("RO");
        inputFormPage.enterTextInTextFieldZip("400500");


        inputFormPage.clickOnSubmit();
        String actualResultForButton = driver.findElement(By.cssSelector(".mt-20 > button[type=submit]")).getAttribute("innerText");
        System.out.println(actualResultForButton);
        Assert.assertEquals(actualResultForButton, "Submit");
        String actualResultForSuccessfulFormValidation = driver.findElement(By.cssSelector(".mt-20 > .success-msg")).getText();
        System.out.println(actualResultForSuccessfulFormValidation);
        Assert.assertEquals(actualResultForSuccessfulFormValidation, "Thanks for contacting us, we will get back to you shortly.");
    }
}
