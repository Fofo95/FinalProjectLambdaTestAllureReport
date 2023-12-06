package pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

// Define a class named BasePage
public class BasePage {

    // Declare a shared WebDriver variable for all instances
    public static WebDriver driver;

    // Set the default URL for the web application
    private String BASE_URL = "https://www.lambdatest.com/selenium-playground/";

    // Default constructor with no code
    public BasePage() {
        // Default constructor
    }

    // Constructor that accepts a WebDriver instance and sets it as the shared driver
    public BasePage(WebDriver driver) {
        BasePage.driver = driver;
    }

    // Annotation: Run this method before each test method
    @BeforeMethod
    // Set up the WebDriver for testing
    public void setUp() {
        // Use WebDriverManager to set up the Firefox driver
        WebDriverManager.firefoxdriver().setup();
        // Set up Firefox options
        FirefoxOptions options = new FirefoxOptions();
        // Create a new FirefoxDriver with the specified options
        driver = new FirefoxDriver(options);
        // Maximize the browser window
        driver.manage().window().maximize();
        // Open the specified base URL
        driver.get(BASE_URL);
    }

    // Annotation: Run this method after each test method
    @AfterMethod
    // Tear down the WebDriver after the test is completed
    public void tearDown() {
        // Check if the driver is not null
        if (driver != null) {
            // Quit (close) the WebDriver
            driver.quit();
        }
    }
}

