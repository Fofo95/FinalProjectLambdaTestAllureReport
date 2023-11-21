package pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BasePage {
    public static WebDriver driver;
    private String BASE_URL = "https://www.lambdatest.com/selenium-playground/";

    public BasePage() {
        // Default constructor
    }

    public BasePage(WebDriver driver) {
        BasePage.driver = driver;
    }

    @BeforeMethod
    public void setUp() {
        if (System.getenv("GITHUB_ACTIONS") != null && System.getenv("GITHUB_ACTIONS").equalsIgnoreCase("true")) {
            // Set up WebDriver for headless mode on GitHub Actions
            WebDriverManager.firefoxdriver().setup();
            FirefoxOptions options = new FirefoxOptions();
            options.addArguments("--headless");
            driver = new FirefoxDriver(options);
        } else {
            // Set up WebDriver for non-headless mode
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }

        driver.manage().window().maximize();
        driver.get(BASE_URL);
    }


    @AfterMethod //folosim @AfterMethod daca vrem
    // sa inchidem browserul dupa fiecare test case in parte
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}


