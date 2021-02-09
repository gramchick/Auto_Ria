import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_Hramma {
    private WebDriver driver;




    @Before
    public void set() {
    driver = new ChromeDriver();
    driver.get("https://music.i.ua/");
    driver.manage().window().maximize();
        }



    @After
    public void clean() {
        driver.quit();
    }



    @Test
    public void Music_i_ua() throws Throwable {

        driver.findElement(By.xpath("//a[contains(text(),'Вход')]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"FloatLogin\"]/div/div/form/fieldset/p[1]/input")).sendKeys("gramchick");
        driver.findElement(By.xpath("//*[@id=\"FloatLogin\"]/div/div/form/fieldset/p[2]/input")).sendKeys("QATest");
        driver.findElement(By.xpath("//body/div[@id='FloatLogin']/div[1]/div[1]/form[1]/input[6]")).click();
        Thread.sleep(3000);
        WebElement New_Mail = driver.findElement(By.xpath("//*[@id=\"newMail\"]/a"));
        Assert.assertTrue(New_Mail.isDisplayed());

        driver.findElement(By.xpath("/html/body/div[1]/div[6]/div/div[1]/div[2]/div/div[2]/div[3]/span/form/input[3]")).sendKeys("Muse - Uprising");
        driver.findElement(By.xpath("/html/body/div[1]/div[6]/div/div[1]/div[2]/div/div[2]/div[3]/span/form/input[7]")).click();
        Thread.sleep(3000);
        WebElement Search_Results = driver.findElement(By.xpath("//h2[contains(text(),'Muse - Uprising')]"));
        Assert.assertTrue(Search_Results.isDisplayed());

        driver.findElement(By.xpath("//tbody/tr[2]/td[3]/a[1]")).click();
        driver.findElement(By.xpath("/html/body/div[1]/div[6]/div[2]/div/div[2]/div[1]/a/span")).click();
        Thread.sleep(20000);
        }

}
