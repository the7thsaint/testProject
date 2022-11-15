package org.example;

import org.example.page.locationOnPage;
import org.example.page.mainPage;
import org.example.page.pageData;
import org.example.page.webDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class GoogleSearchTest {
    @Test
    public void clickAndSearch() {
        System.setProperty(webDriver.chromeDriver, webDriver.locationDriver);
        WebDriver driver = new ChromeDriver();
        driver.get(mainPage.url);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement inputString = driver.findElement(By.xpath(locationOnPage.elementLocator));
        inputString.click();
        inputString.sendKeys(pageData.sendText);
        String text = inputString.getAttribute(locationOnPage.pageAttribute);
        System.out.println(text);
        driver.close();
    }

    @Test
    public void whoIsPutin(){
        System.setProperty(webDriver.chromeDriver, webDriver.locationDriver);
        WebDriver driver = new ChromeDriver();
        driver.get(mainPage.url);
        WebElement searchString = driver.findElement(By.xpath(locationOnPage.elementLocator));
        searchString.click();
        searchString.sendKeys(pageData.sendWhoIsPutinText);
        WebElement buttonClick = driver.findElement(By.xpath(locationOnPage.searchButton));
        buttonClick.click();
        ArrayList<String> putinSearch = new ArrayList<String>();
        putinSearch.add("Путин, Владимир Владимирович - Википедия");
        putinSearch.add("Биография ∙ Владимир Путин");
        putinSearch.add("Путин Владимир Владимирович - Kremlin.Ru");
        putinSearch.add("Владимир Путин - Фонд Росконгресс");
        putinSearch.add("Путин Владимир Владимирович - фото, цитаты, биография");
        System.out.println(putinSearch);
        //div[@class='yuRUbf']/a/h3[@class='LC20lb MBeuO DKV0Md']


    }

}
