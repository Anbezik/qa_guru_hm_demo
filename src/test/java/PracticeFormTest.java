import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;


public class PracticeFormTest extends TestBase{

    @Test
    void successfulForm() {
        open(BASE_URL + "automation-practice-form");
        $("[id=firstName]").setValue("Андрей");
        $("[id=lastName]").setValue("Старуш");
        $("[id=userEmail]").setValue("astarush@icloud.com");
        $("[id=gender-radio-1]").click();
        $("[id=userNumber]").setValue("8800100101");
        $("[id=dateOfBirthInput]").setValue("29 Mar 1993");
        $("[id=subjectsInput]").setValue("English");
        $("[id=hobbies-checkbox-1]").click();
        $("[id=uploadPicture]").click();
        $("[id=currentAddress]").setValue("Moscow");
        $("[id=react-select-3-input]").click();
        $("[id=react-select-4-input]").click();
        $("[id=submit]").click();

    }

}
