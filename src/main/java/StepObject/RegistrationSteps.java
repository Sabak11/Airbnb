package StepObject;

import PageObject.RegistrationPage;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import java.time.Duration;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;
public class RegistrationSteps extends RegistrationPage {

    @Step("Click User Account Button")
    public RegistrationSteps GoRegPage() {
        sleep(2000);
        AuthorisationIcon.shouldBe(Condition.visible, Duration.ofMillis(200000));
        AuthorisationIcon.click();
        return this;
    }

    @Step("Click signUP button")
    public RegistrationSteps signuptxtclick() {
        sleep(2000);
        ClickTxtSignup.shouldBe(Condition.visible, Duration.ofMillis(200000));
        ClickTxtSignup.click();
        $("._bc4egv").scrollIntoView(true);
        sleep(2000);
        return this;
    }

    @Step("Click Registration type email")
    public RegistrationSteps continueemail() {
        ContinueWithEmail.click();
        return this;
    }

    @Step("Fill registration email")
    public RegistrationSteps firstemailinputfield(String email) {
        FirstEmailImput.setValue(email);
        FirstEmailImput.shouldNotBe(Condition.empty);
        return this;
    }

    @Step("Click continue button for registration")
    public RegistrationSteps continuebutton() {
        ContinueBtn.click();
        sleep(5000);
        return this;
    }

    @Step("Fill first, Value: {0}")
    public RegistrationSteps firstnamef(String firstname){
        FirstnameSlc.parent().parent().parent().click();
        FirstnameSlc.setValue(firstname);
        FirstnameSlc.shouldNotBe(Condition.empty);
        return this;
    }

    @Step("Fill last name, Value:{0}")
    public RegistrationSteps lastnamef(String lastname) {
        LastnameSlc.parent().parent().parent().click();
        LastnameSlc.setValue(lastname);
        LastnameSlc.shouldNotBe(Condition.empty);
        return this;
    }



    @Step("Fill birthday date")
    public RegistrationSteps birth(String date ){
        BirthDate.parent().parent().parent().click();
        BirthDate.setValue(date);
        BirthDate.shouldNotBe(Condition.empty);
        return this;
    }

    @Step("Fill password")
    public RegistrationSteps pass(String password){
        PasswordReg.parent().parent().parent().click();
        PasswordReg.setValue(password);
        PasswordReg.shouldNotBe(Condition.empty);
        return this;
    }

    @Step("Click show password")
    public RegistrationSteps showpass(){
        Showpassword.click();
        sleep(2000);
        return this;
    }

    @Step("Click don’t want to receive marketing messages")
    public RegistrationSteps checkbox(){
        TermsCheckbox.parent().parent().click();
        sleep(2000);
        return this;
    }

    @Step("Click terms and conditions")
    public RegistrationSteps termsandservices(){
        TermsOfService.click();
        return this;
    }

    @Step("Click registration button")
    public RegistrationSteps regbuttoncomplete(){
        RegcomplateBtn.click();
        RegComplateFin.shouldBe(Condition.visible, Duration.ofMillis(9000));
        return this;
    }

    @Step("Show registration PopUP")
    public RegistrationSteps registrationfinal(){
        RegComplateFin.shouldBe(Condition.visible, Duration.ofMillis(9000));
        sleep(5000);
        return this;
    }





}



