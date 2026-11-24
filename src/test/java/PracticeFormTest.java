import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.hidden;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;


public class PracticeFormTest extends TestBase{

    @Test
    void successfulForm() {
        open(BASE_URL + "automation-practice-form");
        $("h5").shouldHave(text("Student Registration Form"));
        $("#firstName").setValue("Андрей");
        $("#lastName").setValue("Старуш");
        $("#userEmail").setValue("test@icloud.com");
        $("#genterWrapper").$(byText("Male")).click();
        $("#userNumber").setValue("8800100101");
        $("#dateOfBirthInput").click();
        $("#userNumber").setValue("8800100101");
        $(".react-datepicker__month-select").selectOption("March");
        $(".react-datepicker__year-select").selectOption("1993");
        $(".react-datepicker__day--029").click();
        $("#subjectsInput").setValue("English").pressEnter();
        $("#hobbiesWrapper").$(byText("Sports")).click();
        $("#uploadPicture").uploadFromClasspath("Андрей.jpg");
        $("#currentAddress").setValue("Moscow");
        $("#react-select-3-input").setValue("NCR").pressEnter();
        $("#react-select-4-input").setValue("Delhi").pressEnter();
        $("#submit").click();

        $("#example-modal-sizes-title-lg").shouldHave(text("Thanks for submitting the form"));
        $(".table-responsive").$(byText("Student Name")).parent().shouldHave(text("Андрей Старуш"));
        $(".table-responsive").$(byText("Student Email")).parent().shouldHave(text("test@icloud.com"));
        $(".table-responsive").$(byText("Gender")).parent().shouldHave(text("Male"));
        $(".table-responsive").$(byText("Mobile")).parent().shouldHave(text("8800100101"));
        $(".table-responsive").$(byText("Date of Birth")).parent().shouldHave(text("29 March,1993"));
        $(".table-responsive").$(byText("Subjects")).parent().shouldHave(text("English"));
        $(".table-responsive").$(byText("Hobbies")).parent().shouldHave(text("Sports"));
        $(".table-responsive").$(byText("Picture")).parent().shouldHave(text("Андрей.jpg"));
        $(".table-responsive").$(byText("Address")).parent().shouldHave(text("Moscow"));
        $(".table-responsive").$(byText("State and City")).parent().shouldHave(text("NCR Delhi"));
        $("#closeLargeModal").click();
    }
}
