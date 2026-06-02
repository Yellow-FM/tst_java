import org.junit.jupiter.api.Test;

public class RSHBTest  extends SimpleSearchTest{

    private final static String BASE_URL = "https://www.wikipedia.org/";
    private final static String SEARCH_STRING = "Россельхозбанк";

    @Test
    public void checkHref(){
        MainPage mainPage = new MainPage();
        mainPage.openWebSite(BASE_URL);
        //mainPage.clickOnSearch();
        mainPage.search(SEARCH_STRING);
        int a = 0;
    }
}
