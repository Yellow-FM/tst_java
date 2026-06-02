import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class Serch_result {
    private final SelenideElement result = $x("//*[@class='mw-page-title-main']");


            public String Getresult(){
                return result.getText();
            }
}
