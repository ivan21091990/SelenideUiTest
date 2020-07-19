package Pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class BankOpenStartPage {

    public SelenideElement currencyRatesTable = $("#main div.main-page-exchange__main");

    @Step("Получаем действующий курс валюты '{0}' при '{1}'")
    public double getCurrencyExchangeRate(String currency, String action) {
        int index = action.equals("Покупки") ? 0 : 1;
        return Double.parseDouble(currencyRatesTable.findElements(By.xpath("//*[text()='" + currency + "']/../../..//span[contains(@class, 'rate')]"))
                .get(index).getText()
                .replace(",", "."));
    }
}
