package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BootstrapModalPage extends BasePage{
    //====================================================
    public BootstrapModalPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
    //=====================================================

    @FindBy(linkText = "Bootstrap Modals")
    private WebElement bootstrapModals;

    public void clickOnBootstrapModals() {
        bootstrapModals.click();
    }

    @FindBy(css = "[data-target=\"#myModal\"]")
    private WebElement launchModalButton;

    public void clickOnLaunchModalButton() {
        launchModalButton.click();
    }

    @FindBy(css = "#myModal > .modal-dialog >.modal-content > .modal-body > p")
    private WebElement bodyText;

    public String checkTheTextOfTheBody(){
        return bodyText.getText();
    }

    @FindBy(css = "#myModal > .modal-dialog >.modal-content > .modal-footer > .btn-dark")
    private WebElement saveChangesButton;

    public void clickOnSaveChangesButton(){
        saveChangesButton.click();
    }

}
