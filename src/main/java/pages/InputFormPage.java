package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InputFormPage extends BasePage {
    public InputFormPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
    @FindBy(id = "name")
    private WebElement nameField;
    public void enterTextInTextFieldName(String name) {
        nameField.sendKeys(name);
    }
    @FindBy(id = "inputEmail4")
    private WebElement emailField;
    public void enterTextInTextFieldEmail(String email) {
        emailField.sendKeys(email);
    }

    @FindBy(id = "inputPassword4")
    private WebElement passwordField;
    public void enterTextInTextFieldPassword(String pass) {
        passwordField.sendKeys(pass);
    }

    @FindBy(id = "company")
    private WebElement companyField;
    public void enterTextInTextFieldCompany(String comp) {
        companyField.sendKeys(comp);
    }

    @FindBy(id = "websitename")
    private WebElement websiteField;

    public void enterTextInTextFieldWebsite(String web) {
        websiteField.sendKeys(web);
    }

    @FindBy(css = "option[value=RO]")
    private WebElement countryDropdownField;
    public void selectTextInTextFieldCountry() {
        countryDropdownField.click();
    }

    @FindBy(id = "inputCity")
    private WebElement cityField;

    public void enterTextInTextFieldCity(String city) {
        cityField.sendKeys(city);
    }

    @FindBy(id = "inputAddress1")
    private WebElement address1Field;

    public void enterTextInTextFieldAddress1(String address1) {
        address1Field.sendKeys(address1);
    }

    @FindBy(id = "inputAddress2")
    private WebElement address2Field;
    public void enterTextInTextFieldAddress2(String address2) {
        address2Field.sendKeys(address2);
    }

    @FindBy(id = "inputState")
    private WebElement stateField;
    public void enterTextInTextFieldState(String state) {
        stateField.sendKeys(state);
    }

    @FindBy(id = "inputZip")
    private WebElement zipField;
    public void enterTextInTextFieldZip(String zip) {
        zipField.sendKeys(zip);
    }

    @FindBy(css = ".mt-20 > button[type=submit]")
    private WebElement submitButton;

    public void clickOnSubmit()
    {
        submitButton.click();
    }


}
