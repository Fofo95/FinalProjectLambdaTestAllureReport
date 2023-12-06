package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

// Define a class named BootstrapModalPage that extends BasePage
public class BootstrapModalPage extends BasePage {

    // Constructor that initializes the page using the provided WebDriver
    public BootstrapModalPage(WebDriver driver) {
        super(driver);
        // Initialize page elements using PageFactory
        PageFactory.initElements(driver, this);
    }

    // Element: Bootstrap Modals link
    @FindBy(linkText = "Bootstrap Modals")
    private WebElement bootstrapModals;

    // Method: Click on the Bootstrap Modals link
    public void clickOnBootstrapModals() {
        bootstrapModals.click();
    }

    // Element: Launch Modal button
    @FindBy(css = "[data-target=\"#myModal\"]")
    private WebElement launchModalButton;

    // Method: Click on the Launch Modal button
    public void clickOnLaunchModalButton() {
        launchModalButton.click();
    }

    // Element: Body text of the modal
    @FindBy(css = "#myModal > .modal-dialog >.modal-content > .modal-body > p")
    private WebElement bodyText;

    // Method: Get the text of the modal body
    public String checkTheTextOfTheBody() {
        return bodyText.getText();
    }

    // Element: Save Changes button in the modal
    @FindBy(css = "#myModal > .modal-dialog >.modal-content > .modal-footer > .btn-dark")
    private WebElement saveChangesButton;

    // Method: Click on the Save Changes button
    public void clickOnSaveChangesButton() {
        saveChangesButton.click();
    }
}