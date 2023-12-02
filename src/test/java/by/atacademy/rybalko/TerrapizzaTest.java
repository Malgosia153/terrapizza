package by.atacademy.rybalko;

import by.itacademy.rybalko.Terrapizza;

import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.Test;

public class TerrapizzaTest extends BaseTest {

    @Test
    public void terrapizza() throws InterruptedException {
        Terrapizza terrapizza = new Terrapizza(driver);
        terrapizza.clickButtonCoocie();
        terrapizza.clickButtonPizza();
        terrapizza.clickButtonInBusket();
        terrapizza.clickButtonBar();
        terrapizza.clickButtonCharryInBusket();
        terrapizza.clickButtonBusket();
        Thread.sleep(2000);
        String actual = terrapizza.getTextPizzaName();
        String expected = "Пицца Маргарита на тонком 32 см";
        Assertions.assertEquals(expected, actual);
        Thread.sleep(2000);
        String actualDrink = terrapizza.getTextCharryDrink();
        String expectedDrink = "Вишневый глинтвейн";
        Assertions.assertEquals(expectedDrink, actualDrink);
    }

}
