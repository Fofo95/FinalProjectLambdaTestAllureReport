import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.BootstrapModalPage;
import pages.SimpleFormPage;

public class BootstrapModalTests extends BasePage {
    private BootstrapModalPage bootstrapModalPage;
    @BeforeMethod
    public void setUp() {
        super.setUp();
        bootstrapModalPage = new BootstrapModalPage(driver);
    }

    @Test
    public void clickOnLaunchSingleModalAndGetText(){
        bootstrapModalPage.clickOnBootstrapModals();
        bootstrapModalPage.clickOnLaunchModalButton();
        bootstrapModalPage.checkTheTextOfTheBody();

        String actualResult = bootstrapModalPage.checkTheTextOfTheBody();
        Assert.assertTrue(actualResult.contains("This is the place where " +
                "the content for the modal dialog displays"));
        bootstrapModalPage.clickOnSaveChangesButton();
    }
}
