import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class TextBox extends TestBase{

    @Test
    void successfulBox() {
        open(BASE_URL + "text-box");
        $("[id=userName]").setValue("Anbez");
        $("[id=userEmail]").setValue("astarush@icloud.com");
        $("[id=currentAddress]").setValue("Reutov");
        $("[id=permanentAddress]").setValue("Moscow");
        $("[id=submit]").click();

        $("[id=output] [id=name]").shouldHave(text("Anbez"));
        $("[id=output] [id=email]").shouldHave(text("astarush@icloud.com"));
        $("[id=output] [id=currentAddress]").shouldHave(text("Reutov"));
        $("[id=output] [id=permanentAddress]").shouldHave(text("Moscow"));




    }

}
