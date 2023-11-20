package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SimpleFormPage extends BasePage {

    //====================================================
    public SimpleFormPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
    //=====================================================

    @FindBy(css = "input[placeholder='Please enter your Message']")
    private WebElement textField;

    public void enterTextInTextField(String text) {
        textField.sendKeys(text);
    }
    @FindBy(id = "showInput")
    private WebElement getCheckedValueButton;

    public void clickOnGetCheckedValueButton(){
        getCheckedValueButton.click();
    }
    @FindBy(id = "message")
    private WebElement checkMessage;
    public void checkYourMessage(){
        checkMessage.getText();
    }

    @FindBy(id = "sum1")
    private WebElement twoInputFieldsEnterA;
    public void enterValueInA(String valueA) {
        twoInputFieldsEnterA.sendKeys(valueA);
    }

    @FindBy(id = "sum2")
    private WebElement twoInputFieldsEnterB;
    public void enterValueInB(String valueB) {
        twoInputFieldsEnterB.sendKeys(valueB);
    }

    @FindBy(xpath = "//*[@id='gettotal']/button")
    private WebElement getValuesButton;
    public void clickOnGetValuesButton() {
        getValuesButton.click();
    }

    @FindBy(css = "#gettotal > button")
    private WebElement getValuesButtonAlternative;
    public void clickOnGetValuesButtonAlternative() {
        getValuesButtonAlternative.click();
    }
}
