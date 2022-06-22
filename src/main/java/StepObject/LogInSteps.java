package StepObject;

import PageObject.RegistrationPage;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

public class LogInSteps extends RegistrationPage {


    @Step("Click User Account Button")
    public LogInSteps GoLoginPage() {
        sleep(2000);
        AuthorisationIcon.shouldBe(Condition.visible, Duration.ofMillis(200000));
        AuthorisationIcon.click();
        return this;
    }

    @Step("Click Log In")
    public LogInSteps ClickLogin() {
        sleep(2000);
        ClickTxtSignup.shouldBe(Condition.visible, Duration.ofMillis(200000));
        ClickTxtSignup.click();
        sleep(2000);
        return this;
    }

    @Step("Click Login Email")
    public LogInSteps continueemail() {
        ContinueWithEmail.click();
        return this;
    }

    @Step("Fill Login Email")
    public LogInSteps firstemailinputfield(String email) {
        FirstEmailImput.setValue(email);
        FirstEmailImput.shouldNotBe(Condition.empty);
        return this;
    }

    @Step("Click continue button for Login")
    public LogInSteps continuebutton() {
        ContinueBtn.click();
        sleep(9000);
        return this;
    }

    @Step("Fill Login Valid Password")
    public LogInSteps pass(String password) {
        sleep(2000);
        PasswordReg.parent().parent().parent().click();
        PasswordReg.setValue(password);
        PasswordReg.shouldNotBe(Condition.empty);
        return this;
    }

    @Step("Click continue button for Login")
    public LogInSteps Loginbuttondone() {
        LogInButton.click();
        sleep(5000);
        return this;
    }

    @Step("Log Out")
    public LogInSteps Logout() {
        AuthorisationIconout.click();
        sleep(1000);
        LogoutDone.click();
        sleep(5000);
        return this;
    }

}

