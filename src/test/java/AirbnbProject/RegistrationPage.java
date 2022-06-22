package AirbnbProject;

import StepObject.RegistrationSteps;
import Utils.BrowserOpener;
import Utils.Retry;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import static DataObject.RegistrationData.*;
import static com.codeborne.selenide.Selenide.$;
@Listeners(Utils.TestLister.class)

public class RegistrationPage extends BrowserOpener {

    @Test(retryAnalyzer = Retry.class)
    @Description("Registration With Email Test")
    @Severity(SeverityLevel.CRITICAL)

    public void RegistrationPageAir() {
        SoftAssert soft = new SoftAssert();
        RegistrationSteps Steps = new RegistrationSteps();

        Steps
                .GoRegPage()
                .signuptxtclick()
                .continueemail()
                .firstemailinputfield(EmailData)
                .continuebutton()
                .firstnamef(Username)
                .lastnamef(Lastname)
                .birth(BirthDate)
                .pass(Password)
                .showpass()
                .checkbox()
                .termsandservices()
                .regbuttoncomplete()
                .registrationfinal();

        soft.assertTrue(Steps.RegComplateFin.isDisplayed());
        soft.assertAll();

    }


}

