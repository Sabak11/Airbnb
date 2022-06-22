package AirbnbProject;

import StepObject.ListingSteps;
import StepObject.LogInSteps;
import Utils.BrowserOpener;
import Utils.LoginUser;
import Utils.Retry;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static DataObject.RegistrationData.ValidEmail;
import static DataObject.RegistrationData.ValidPass;
import static com.codeborne.selenide.Selenide.$;

public class LoginTest extends BrowserOpener {

    @Test(retryAnalyzer = Retry.class)
    @Description("Log In Test")
    @Severity(SeverityLevel.CRITICAL)

        public void LoginDoneF() {
            LogInSteps Steps = new LogInSteps();
            SoftAssert soft = new SoftAssert();
            ListingSteps StepList = new ListingSteps();


        Steps.GoLoginPage();
            Steps.ClickLogin();
            Steps.continueemail();
            Steps.firstemailinputfield(ValidEmail);

        soft.assertTrue(Steps.FirstEmailImput.is(Condition.not(Condition.empty)));

        Steps.continuebutton();

        Steps.pass(ValidPass);
        soft.assertTrue(Steps.PasswordReg.is(Condition.not(Condition.empty)));

        Steps.Loginbuttondone();

        StepList.listingLogout();






    }
}

