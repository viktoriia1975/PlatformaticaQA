import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import runner.BaseTest;

public class GroupBreakingBad extends BaseTest {
    @Test
    public void nataliaVats() throws InterruptedException {

        WebDriver driver = getDriver();
        driver.get("https://www.aerotek.com/en/");

        WebElement button = driver.findElement(By.xpath("(//button[contains(text(), 'SEARCH')])[2]"));
        button.click();
        Thread.sleep(3000);

        WebElement input = driver.findElement(By.xpath("//input[contains(@class, 'ph-a11y-location-box')]"));
        Assert.assertEquals(input.getAttribute("placeholder"), "Enter City, State or Zip");
    }

    @Test
    public void alexeySemenov() throws  InterruptedException{

        WebDriver browser = getDriver();
        browser.get("https://www.jizo.com");

        WebElement inputSearch = browser.findElement(By.xpath("//input[@id='searchCity']"));
        inputSearch.sendKeys("Rus");

        Thread.sleep(3000);

        WebElement menuElement = browser.findElement(By.xpath("//*[@id='CityList']/div[1]/div[2]/h4"));
        Assert.assertEquals(menuElement.getText().toLowerCase(), "russia");

    }
}
