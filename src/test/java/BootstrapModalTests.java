import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.BootstrapModalPage;
import pages.SimpleFormPage;

// Define a test class named BootstrapModalTests that extends BasePage
public class BootstrapModalTests extends BasePage {

    // Instance variable for BootstrapModalPage
    private BootstrapModalPage bootstrapModalPage;

    // BeforeMethod: Set up the test environment
    @BeforeMethod
    public void setUp() {
        // Call the setUp method in the parent class (BasePage)
        super.setUp();
        // Initialize BootstrapModalPage with the shared driver
        bootstrapModalPage = new BootstrapModalPage(driver);
    }

    // Test: Click on Launch Single Modal, get text, and verify the content
    @Test
    public void clickOnLaunchSingleModalAndGetText() {
        // Click on the Bootstrap Modals link
        bootstrapModalPage.clickOnBootstrapModals();
        // Click on the Launch Modal button
        bootstrapModalPage.clickOnLaunchModalButton();

        // Check the text of the modal body
        String actualResult = bootstrapModalPage.checkTheTextOfTheBody();

        // Verify the expected content in the modal body text
        Assert.assertTrue(actualResult.contains("This is the place where " +
                "the content for the modal dialog displays"));

        // Click on the Save Changes button in the modal
        bootstrapModalPage.clickOnSaveChangesButton();
    }
}
