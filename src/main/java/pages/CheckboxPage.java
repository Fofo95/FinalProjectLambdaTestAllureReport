package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckboxPage extends BasePage {

    //=====================================================
    public CheckboxPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
    //=====================================================
    @FindBy(id = "isAgeSelected")
    private WebElement singleCheckbox;

    public void clickOnSingleCheckbox() {
        singleCheckbox.click();
    }
    @FindBy(xpath = "/html/body/div[1]/div/section[2]/div/div/div/div[2]/div[2]/div[1]/input")
    private WebElement firstCheckboxOption;

    @FindBy(xpath = "/html/body/div[1]/div/section[2]/div/div/div/div[2]/div[2]/div[2]/input")
    private WebElement secondCheckboxOption;

    @FindBy(xpath = "/html/body/div[1]/div/section[2]/div/div/div/div[2]/div[2]/div[3]/input")
    private WebElement thirdCheckboxOption;

    @FindBy(xpath = "/html/body/div[1]/div/section[2]/div/div/div/div[2]/div[2]/div[4]/input")
    private WebElement forthCheckboxOption;

    @FindBy(id = "box")
    private WebElement checkAllOption;



    public void clickOnTheFirstCheckboxOption() {
        firstCheckboxOption.click();
    }

    public void clickOnTheSecondCheckboxOption() {
        secondCheckboxOption.click();
    }

    public void clickOnTheThirdCheckboxOption() {
        thirdCheckboxOption.click();
    }

    public void clickOnTheForthCheckboxOption() {
        forthCheckboxOption.click();
    }

    public void clickOnTheCheckAllButton() {
        checkAllOption.click();
    }
}
