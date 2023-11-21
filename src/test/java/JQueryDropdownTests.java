import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.InputFormPage;
import pages.JQueryDropdownPage;

public class JQueryDropdownTests extends BasePage {
    private JQueryDropdownPage jQueryDropdownPage;
    private final By JQUERY_DROPDOWN_LINK = By.linkText("JQuery Select dropdown");

    @BeforeMethod
    public void setUp() {
        super.setUp();
        jQueryDropdownPage = new JQueryDropdownPage(driver);
    }

    @Test
    public void SelectACountryUsingTheSearchField(){
        driver.findElement(JQUERY_DROPDOWN_LINK).click();
        jQueryDropdownPage.selectCountryUsingDropdownSearchField("Netherlands");

        String actualResult = driver.findElement(By.cssSelector("[title|=\"Netherlands\"]")).getText();
        Assert.assertEquals(actualResult, "Netherlands");
    }

    @Test
    public void SelectDenmarkCountry(){
        driver.findElement(JQUERY_DROPDOWN_LINK).click();
        jQueryDropdownPage.selectDenmarkCountry();

        String actualResult = driver.findElement(By.cssSelector("[title|=\"Denmark\"]")).getText();
        Assert.assertEquals(actualResult, "Denmark");


    }
}
