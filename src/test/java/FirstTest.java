import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {
    private WebDriver driver;

    @Before
    public void SetUp(){
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        driver = new ChromeDriver();
    }

    @Test
    public void openGoogle() {
        System.out.println("Step1:Check that google.com website was opened");
        driver.get("https://www.google.com/");
    }

    @Test
    public void checkWebUrl(){
        System.out.println("Step1:Check that google.com website was opened");
        driver.get("https://www.google.com/");
        System.out.println("Step2:Check that correct url was opened");
        Assert.assertTrue(driver.getCurrentUrl().contains("google.com"));
    }

    @After
    public void tearDown () {
        if (driver != null)
            driver.quit();
    }


}

