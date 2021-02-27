package com.studentapp.cucumber.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

@RunWith(SerenityRunner.class)

public class Auto_Ria {
    @Managed
    WebDriver driver;


    @Test

    @Step
    @Given("^User goes to Auto_Ria site$")
    public void user_goes_to_Auto_Ria_site() throws Throwable {
        driver.get("https://auto.ria.com/uk/");
        this.driver.manage().window().maximize();
    }
    @Step
    @Given("^User clicks on Advanced Search button$")
    public void user_clicks_on_Advanced_Search_button() throws Throwable {
        driver.findElement(By.xpath("//span[contains(text(),'Розширений пошук')]")).click();
    }

    @Step
    @When("^User starts a search used cars with certain search criterias$")
    public void user_starts_a_search_used_cars_with_certain_search_criterias() throws Throwable {
            driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div/form/div[1]/div[1]/div/label[2]")).click();
            Thread.sleep(500);
            driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div/form/div[1]/div[2]/label/span")).click();
            Thread.sleep(500);
            driver.findElement(By.xpath("//span[contains(text(),'Держ. номер')]")).click();
            Thread.sleep(500);
            driver.findElement(By.xpath("//label[contains(text(),'Унiверсал')]")).click();
            Thread.sleep(500);
            driver.findElement(By.xpath("//label[contains(text(),'Седан')]")).click();
            Thread.sleep(500);
            driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div/form/div[3]/div/label")).click();
            Thread.sleep(500);
            driver.findElement(By.xpath("//label[contains(text(),'Ліфтбек')]")).click();
            Thread.sleep(500);
            driver.findElement(By.xpath("//select[@id='at_country']")).sendKeys("Чехія");
            Thread.sleep(500);
            driver.findElement(By.xpath("//*[@id=\"autocomplete-brand-0\"]/label")).click();
            Thread.sleep(500);
            driver.findElement(By.xpath("//a[contains(text(),'Skoda')]")).click();
            Thread.sleep(500);
            driver.findElement(By.xpath("//*[@id=\"autocomplete-model-0\"]/label")).click();
            Thread.sleep(500);
            driver.findElement(By.xpath("//a[contains(text(),'Octavia A5')]")).click();
            Thread.sleep(500);
            driver.findElement(By.xpath("//select[@id='at_year-from']")).click();
            Thread.sleep(500);
            driver.findElement(By.xpath("//*[@id=\"at_year-from\"]/option[17]")).click();
            Thread.sleep(500);
            driver.findElement(By.xpath("//select[@id='at_year-to']")).click();
            Thread.sleep(500);
            driver.findElement(By.xpath("//*[@id=\"at_year-to\"]/option[7]")).click();
            Thread.sleep(500);
            driver.findElement(By.xpath("//input[@id='at_price-from']")).sendKeys("7000");
            Thread.sleep(500);
            driver.findElement(By.xpath("//input[@id='at_price-to']")).sendKeys("10000");
            Thread.sleep(500);
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(0,800)");
            Thread.sleep(500);
            driver.findElement(By.xpath("//label[contains(text(),'Можливий торг')]")).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath("//label[contains(text(),'Південна Україна')]")).click();
            Thread.sleep(1000);
            js.executeScript("window.scrollBy(0,200)");
            driver.findElement(By.xpath("//body/div[@id='app']/div[2]/div[1]/form[1]/section[4]/div[1]/div[1]/select[1]")).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div/form/section[4]/div[1]/div/select/option[2]")).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"at-technical-condition\"]/span")).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"at-technical-condition\"]/label[2]/span")).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"at-paintwork\"]/span")).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"at-paintwork\"]/label[2]/span")).click();
            Thread.sleep(1000);
            js.executeScript("window.scrollBy(0,1000)");
            Thread.sleep(1000);

            driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div/form/section[5]/div[1]/div/div/label[1]")).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath("//label[contains(text(),'Дизель')]")).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div/form/section[5]/div[1]/div/div/label[3]")).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath("//label[contains(text(),'Автомат')]")).click();
            Thread.sleep(1000);
            js.executeScript("window.scrollBy(0,600)");
            Thread.sleep(1000);
            driver.findElement(By.xpath("//label[contains(text(),'Від дешевих до дорогих')]")).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath("//body/div[@id='app']/div[2]/div[1]/form[1]/div[6]/div[1]/div[1]/button[1]")).click();
            Thread.sleep(5000);
    }

    @Step
    @Then("^User opens a car's page$")
    public void user_opens_a_car_s_page() throws Throwable {
        driver.findElement(By.xpath("//span[contains(text(),'Skoda Octavia A5')]")).click();
        Thread.sleep(1000);
        WebElement propositions=driver.findElement(By.xpath("//a[contains(text(),'Octavia A5')]"));
        Assert.assertTrue(propositions.isDisplayed());


    }


}
