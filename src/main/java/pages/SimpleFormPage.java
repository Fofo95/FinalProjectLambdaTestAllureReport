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

    @FindBy(id = "user-message")
    private WebElement textField;

    @FindBy(id = "showInput")
    private WebElement getCheckedValueButton;

    @FindBy(id = "sum1")
    private WebElement twoInputFieldsEnterA;

    @FindBy(id = "sum2")
    private WebElement twoInputFieldsEnterB;

    @FindBy(xpath = "//*[@id='gettotal']/button")
    private WebElement getValuesButton;

    public void clickOnGetCheckedValue() {
        getCheckedValueButton.click();
    }

    public void enterTextInTextField(String text) {
        textField.sendKeys(text);
    }

    public void enterValueInA(String valueA) {
        twoInputFieldsEnterA.sendKeys(valueA);
    }

    public void enterValueInB(String valueB) {
        twoInputFieldsEnterB.sendKeys(valueB);
    }

    public void clickOnGetValuesButton() {
        getValuesButton.click();
    }
}
