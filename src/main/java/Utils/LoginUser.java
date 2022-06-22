package Utils;

import StepObject.ListingSteps;
import StepObject.LogInSteps;
import StepObject.RegistrationSteps;
import io.qameta.allure.Step;
import org.testng.annotations.BeforeTest;
import org.testng.asserts.SoftAssert;

import static DataObject.ListingPageData.LocationGe;
import static DataObject.RegistrationData.*;

public class LoginUser extends BrowserOpener{

    public void LogIN() {
        LogInSteps Steps = new LogInSteps();

        Steps.GoLoginPage();
        Steps.ClickLogin();
        Steps.continueemail();
        Steps.firstemailinputfield(ValidEmail);
        Steps.continuebutton();
        Steps.pass(ValidPass);
        Steps.Loginbuttondone();
        //Steps.Logout();

    }

  }
