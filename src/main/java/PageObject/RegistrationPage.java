package PageObject;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.testng.Assert;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;

public class RegistrationPage {

    public SelenideElement

            AuthorisationIcon = $(By.cssSelector("button[data-testid='cypress-headernav-profile']")),
            ClickTxtSignup = $(byLinkText("Sign up")),
            ContinueWithEmail = $("._bc4egv", 3),
            FirstEmailImput = $ ("#email-login-email"),
            ContinueBtn = $("._6hkhatt"),
            FirstnameSlc = $(By.name("user[first_name]")),
            LastnameSlc = $(By.name("user[last_name]")),
            BirthDate = $("#email-signup-date"),
            PasswordReg = $("#email-signup-password"),
            TermsCheckbox = $ ("._1yf4i4f"),
            TermsOfService = $(byLinkText("Terms of Service")),
            Showpassword = $(byText("Show")),
            RegcomplateBtn = $("._6hkhatt"),
            RegComplateFin = $("._ydig0e"),
            LoginPass = $("._js9i23"),
            LogInButton = $(By.cssSelector("button[data-testid='signup-login-submit-btn']")),
            LoginSuccesDone = $(".fnky2vc"),
            AuthorisationIconout = $(By.cssSelector("button[data-testid='cypress-headernav-profile']")),
            LogoutDone = $(byText("Log out"));





}
