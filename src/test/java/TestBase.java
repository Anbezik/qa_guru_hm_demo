
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;

import static com.codeborne.selenide.Selenide.closeWebDriver;

public class TestBase {

    public static final String BASE_URL = "https://demoqa.com/";
    public static final String BASE_URL_SIMPLE = "https://qa-guru.github.io/one-page-form/text-box.html";

    @BeforeAll
    static void BeforeAll() {
        Configuration.browser = "chrome";
//        Configuration.browserVersion = "144.0";
        Configuration.browserSize = "1920x1080";
//        Configuration.baseUrl = "https://demoqa.com";
        Configuration.timeout = 1000;
    }

    @AfterEach
    void afterEach() {
        closeWebDriver();
    }

}