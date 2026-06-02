import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.open;

/**
 * WIKI ORG
 */


public class MainPage {
    private final SelenideElement searchButton = $x("//input[@id='searchInput']");

    public void clickOnSearch(){
        searchButton.click();
    }

    public void openWebSite (String url){
        open(url);
    }

    /**
     * выполянем поиск нажимаем энтер
     * @param searchString
     */
    public void search(String searchString){
        searchButton.setValue(searchString);
        searchButton.sendKeys(Keys.ENTER);
    }
}
