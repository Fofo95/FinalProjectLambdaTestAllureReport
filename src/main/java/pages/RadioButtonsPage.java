package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RadioButtonsPage extends BasePage {

    public RadioButtonsPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(linkText = "Radio Buttons Demo")
    private WebElement radioButtonsDemoLink;

    @FindBy(xpath = "/html/body/div[1]/div/section[2]/div/div/div/div[1]/div/label[1]/input")
    private WebElement maleRadio;

    @FindBy(xpath = "//*[@id=\"__next\"]/div/section[2]/div/div/div/div[1]/div/label[2]/input")
    private WebElement femaleRadio;

    @FindBy(id = "buttoncheck")
    private WebElement getValueButton;

    @FindBy(xpath = "/html/body/div[1]/div/section[2]/div/div/div/div[1]/div/p[2]")
    private WebElement selectedMaleMessage;

    @FindBy(xpath = "//*[@id=\"__next\"]/div/section[2]/div/div/div/div[1]/div/p[2]")
    private WebElement selectedFemaleMessage;

    @FindBy(xpath = "/html/body/div[1]/div/section[2]/div/div/div/div[2]/div/div/div/div[1]/label/input")
    private WebElement checkbox1;

    @FindBy(xpath = "/html/body/div[1]/div/section[2]/div/div/div/div[2]/div/div/div/div[2]/label/input")
    private WebElement checkbox2;

    @FindBy(xpath = "/html/body/div[1]/div/section[2]/div/div/div/div[2]/div/div/div/div[3]/label/input")
    private WebElement checkbox3;

    @FindBy(xpath = "/html/body/div[1]/div/section[2]/div/div/div/div[3]/div/div/div[1]/div[1]/label[1]/input")
    private WebElement maleGender;

    @FindBy(xpath = "/html/body/div[1]/div/section[2]/div/div/div/div[3]/div/div/div[1]/div[1]/label[2]/input")
    private WebElement femaleGender;

    @FindBy(xpath = "/html/body/div[1]/div/section[2]/div/div/div/div[3]/div/div/div[1]/div[1]/label[3]/input")
    private WebElement otherGender;

    @FindBy(xpath = "/html/body/div[1]/div/section[2]/div/div/div/div[3]/div/div/div[1]/div[2]/label[1]/input")
    private WebElement age0to5;

    @FindBy(xpath = "/html/body/div[1]/div/section[2]/div/div/div/div[3]/div/div/div[1]/div[2]/label[2]/input")
    private WebElement age5to15;

    @FindBy(xpath = "/html/body/div[1]/div/section[2]/div/div/div/div[3]/div/div/div[1]/div[2]/label[3]/input")
    private WebElement age15to50;

    @FindBy(xpath = "/html/body/div[1]/div/section[2]/div/div/div/div[3]/div/div/div[1]/button")
    private WebElement getValue2Button;

    @FindBy(xpath = "/html/body/div[1]/div/section[2]/div/div/div/div[3]/div/div/div[2]/p[1]/span")
    private WebElement checkMessageMale;

    @FindBy(xpath = "/html/body/div[1]/div/section[2]/div/div/div/div[3]/div/div/div[2]/p[1]/span")
    private WebElement checkMessageFemale;

    @FindBy(xpath = "/html/body/div[1]/div/section[2]/div/div/div/div[3]/div/div/div[2]/p[1]/span")
    private WebElement checkMessageOther;

    @FindBy(xpath = "/html/body/div[1]/div/section[2]/div/div/div/div[3]/div/div/div[2]/p[2]/span")
    private WebElement checkMessage0to5;

    @FindBy(xpath = "/html/body/div[1]/div/section[2]/div/div/div/div[3]/div/div/div[2]/p[2]/span")
    private WebElement checkMessage5to15;

    @FindBy(xpath = "/html/body/div[1]/div/section[2]/div/div/div/div[3]/div/div/div[2]/p[2]/span")
    private WebElement checkMessage15to50;

    public void clickOnRadioButtonsDemo() {
        radioButtonsDemoLink.click();
    }

    public void selectMaleRadio() {
        maleRadio.click();
    }

    public void selectFemaleRadio() {
        femaleRadio.click();
    }

    public void checkGetValue() {
        getValueButton.click();
    }

    public String getSelectedMaleMessage() {
        return selectedMaleMessage.getText();
    }

    public String getSelectedFemaleMessage() {
        return selectedFemaleMessage.getText();
    }

    public void selectCheckbox1() {
        checkbox1.click();
    }

    public void selectCheckbox2() {
        checkbox2.click();
    }

    public void selectCheckbox3() {
        checkbox3.click();
    }

    public void selectMaleGender() {
        maleGender.click();
    }

    public void selectFemaleGender() {
        femaleGender.click();
    }

    public void selectOtherGender() {
        otherGender.click();
    }

    public void select0to5() {
        age0to5.click();
    }

    public void select5to15() {
        age5to15.click();
    }

    public void select15to50() {
        age15to50.click();
    }

    public void selectGetValue2() {
        getValue2Button.click();
    }

    public String getCheckMessageMale() {
        return checkMessageMale.getText();
    }

    public String getCheckMessageFemale() {
        return checkMessageFemale.getText();
    }

    public String getCheckMessageOther() {
        return checkMessageOther.getText();
    }

    public String getCheckMessage0to5() {
        return checkMessage0to5.getText();
    }

    public String getCheckMessage5to15() {
        return checkMessage5to15.getText();
    }

    public String getCheckMessage15to50() {
        return checkMessage15to50.getText();
    }
}
