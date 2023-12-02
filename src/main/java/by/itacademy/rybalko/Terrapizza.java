package by.itacademy.rybalko;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Terrapizza {

    private String clickButtonCoocie = "/html/body/div[6]/div/button";
    private String clickButtonPizza = "/html/body/div[3]/div[2]/div/div/div/div/div/ul/li[10]/a";
    private String clickButtonInBusket = "/html/body/div[3]/div[1]/div/div/div[3]/div/div[1]/div/div/div/div[18]/div/div[3]/div[3]/div[2]/div[2]/button";
    private String clickButtonBar = "/html/body/div[3]/div[1]/div/div/div[1]/div/div/div/ul/li[16]/a";
    private String clickButtonCharryInBusket = "//*[@id=\"menu-card-2221\"]/div[3]/div[3]/div/div[2]/button";
    private String clickButtonBusket = "/html/body/div[2]/div[1]/div[3]/div[2]/div[1]/div[1]";
    private String getTextPizzaName = "//*[@id=\"basket-el-0\"]/div[2]/div[1]/div[1]";
    private String getTextCharryDrink = "//*[@id=\"basket-el-1\"]/div[2]/div[1]/div[1]";

    WebDriver driver;

    public Terrapizza(WebDriver driver) {
        this.driver = driver;
    }

    public void clickButtonCoocie() {
        driver.findElement(By.xpath(clickButtonCoocie)).click();
    }

    public void clickButtonPizza() {
        driver.findElement(By.xpath(clickButtonPizza)).click();
    }

    public void clickButtonInBusket() {
        driver.findElement(By.xpath(clickButtonInBusket)).click();
    }

    public void clickButtonBar() {
        driver.findElement(By.xpath(clickButtonBar)).click();
    }

    public void clickButtonCharryInBusket() {
        driver.findElement(By.xpath(clickButtonCharryInBusket)).click();
    }

    public void clickButtonBusket() {
        driver.findElement(By.xpath(clickButtonBusket)).click();
    }

    public String getTextPizzaName() {
        return driver.findElement(By.xpath(getTextPizzaName)).getText();
    }

    public String getTextCharryDrink() {
        return driver.findElement(By.xpath(getTextCharryDrink)).getText();
    }

}
