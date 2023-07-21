package tests;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.RegistrationPage;
import test.TestBase;

public class RegistrationRemoteTest extends TestBase {

    RegistrationPage registrationPage = new RegistrationPage();

    @Test
    @Tag("remote")
    void registrationFormTest (){
        registrationPage.openFormRegistration()
                .closeBanner()
                .setName("Ivan")
                .setLastName("Popov")
                .setUserEmail("one@two.com")
                .setGender("Female")
                .setUserNumber("9031013947")
                .dateOfBirthInput("17", "December", "1977")
                .subjectsInput("b")
                .hobbiesWrapper("Music")
                .uploadPicture("122.png")
                .currentAddress("Anything")
                .setState("NCR")
                .setCity("Delhi")
                .clickSubmit();


        registrationPage
                .checkResult("Student Name", "Ivan Popov")
                .checkResult("Student Email", "one@two.com")
                .checkResult("Gender", "Female")
                .checkResult("Mobile", "9031013947")
                .checkResult("Date of Birth", "17 December,1977")
                .checkResult("Hobbies", "Music")
                .checkResult("Picture", "122.png")
                .checkResult("Address", "Anything")
                .checkResult("State and City", "NCR Delhi");


    }
}
