package Pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class StartPageBrowser {
    SelenideElement searchField = $(By.name("q"));
    SelenideElement firstElementAfterSearch  = $("#rso div.r > a");

    public SelenideElement getSearchField() {
        return searchField;
    }

    public SelenideElement getFirstElementAfterSearch() {
        return firstElementAfterSearch;
    }
}
