package pages;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class RegistrationPage {


    public RegistrationPage openFormRegistration() {
        open("/automation-practice-form");
        return this;
    }

    public RegistrationPage closeBanner() {
        executeJavaScript("$('#fixedban').remove()");
        executeJavaScript("$('footer').remove()");
        return this;
    }

    public RegistrationPage setName(String name) {
        $("#firstName").setValue(name);
        return this;
    }

    public RegistrationPage setLastName(String LastName) {
        $("#lastName").setValue(LastName);
        return this;
    }
    public RegistrationPage setUserEmail(String mail) {
        $("#userEmail").setValue(mail);
        return this;
    }

    public RegistrationPage setUserNumber(String userNumber) {
        $("#userNumber").setValue(userNumber);
        return this;
    }

    public RegistrationPage setGender(String value) {
        $("#genterWrapper").$(byText(value)).click();
        return this;
    }

    public RegistrationPage dateOfBirthInput(String day, String month, String year) {
        $("#dateOfBirthInput").click();
        $(".react-datepicker__month-select").selectOption(month);
        $(".react-datepicker__year-select").selectOption(year);
        $(".react-datepicker__day--0" + day).click();
        return this;
    }

    public RegistrationPage subjectsInput (String value) {
        $("#subjectsInput").setValue(value).pressEnter();
        return this;
    }

    public RegistrationPage hobbiesWrapper(String value) {
        $("#hobbiesWrapper").$(byText(value)).click();
        return this;
    }

    public RegistrationPage uploadPicture(String value) {
        $("#uploadPicture").uploadFromClasspath(value);
        return this;
    }


    public RegistrationPage currentAddress(String value) {
        $("#currentAddress").setValue(value).click();
        return this;
    }

    public RegistrationPage setState(String value) {
        $("#state").click();
        $("#stateCity-wrapper").$(byText(value)).click();
        return this;
    }

    public RegistrationPage setCity(String value) {
        $("#city").click();
        $("#stateCity-wrapper").$(byText(value)).click();
        return this;
    }

    public void clickSubmit() {
        $("#submit").click();
    }

    public RegistrationPage checkResult(String key, String value) {
        $(".table-responsive").$(byText(key)).sibling(0).shouldHave(text(value));

        return this;
    }



}
