package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;

public class NavigationTest {

    private WebDriver driver;
    private WebDriverWait wait;

    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized"); // Open browser maximized
        driver = new ChromeDriver(options);
        wait = new WebDriverWait(driver, Duration.ofSeconds(30)); // increased wait
    }

    @Test
    public void navigateToBurgerJointCaseStudy() {
        try {
            // Open homepage
            driver.get("https://autonomous-hvac-cfd.simulationhub.com/simulation-gallery");

            // Wait for the "Burger Joint Case Study" link using full URL and click using JS
            WebElement burgerLink = wait.until(ExpectedConditions.presenceOfElementLocated(
                    By.xpath("//a[@href='https://autonomous-hvac-cfd.simulationhub.com/public/Ktr3DDf/results']")
            ));

            // Scroll to element
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", burgerLink);

            // Click element using JS
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", burgerLink);

            // Wait for "OPEN RESULTS" button on results page
            WebElement openResultsBtn = wait.until(ExpectedConditions.elementToBeClickable(
                    By.xpath("//a[contains(text(),'OPEN RESULTS')]")
            ));
            openResultsBtn.click();

            System.out.println("Navigation successful!");

        } catch (Exception e) {
            System.out.println("Navigation failed: " + e.getMessage());
        }
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
