package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JQueryDropdownPage  extends BasePage {
    public JQueryDropdownPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = ".select2-dropdown > .select2-search > .select2-search__field")
    private WebElement dropdownSearchField;
    @FindBy(css = "div:nth-child(1) > div.py-20.px-10 > span")
    private WebElement openDropdown;
    @FindBy(css = "#select2-country-results > li:nth-child(1)")
    private WebElement selectTheCountry;
    public void selectCountryUsingDropdownSearchField(String country) {
        openDropdown.click();
        dropdownSearchField.sendKeys(country);
        selectTheCountry.click();
    }

    @FindBy(css = ".select2-results__options > li:nth-child(4)")
    private WebElement DenmarkCountry;
    public void selectDenmarkCountry() {
        openDropdown.click();
        DenmarkCountry.click();
    }
}
