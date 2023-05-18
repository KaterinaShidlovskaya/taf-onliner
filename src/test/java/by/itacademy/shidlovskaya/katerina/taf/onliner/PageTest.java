package by.itacademy.shidlovskaya.katerina.taf.onliner;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageTest {
    ChromeDriver driver;

    @Test
    public void testLoginForm() {
        driver = new ChromeDriver();
        driver.get("https://www.onliner.by/");
        Page page = new Page();
        WebElement buttonEnterElement = driver.findElement(By.xpath(page.buttonLoginXpath));
        buttonEnterElement.click();

        WebElement inputLoginElement = driver.findElement(By.xpath(page.inputLoginXpath));
        inputLoginElement.sendKeys("Sam");

        WebElement inputPasswordElement = driver.findElement(By.xpath(page.inputPasswordXpath));
        inputPasswordElement.sendKeys("12345");

        WebElement buttonSubmitElement = driver.findElement(By.xpath(page.buttonSubmitXpath));
        buttonSubmitElement.click();

        driver.quit();
        driver=null;
    }
}
