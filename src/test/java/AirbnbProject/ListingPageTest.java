package AirbnbProject;

import StepObject.ListingSteps;
import Utils.BrowserOpener;
import Utils.LoginUser;
import Utils.Retry;
import Utils.SearchFilter;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static DataObject.ListingPageData.*;
import static DataObject.RegistrationData.Username;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static org.testng.AssertJUnit.assertEquals;

public class ListingPageTest extends SearchFilter {

    @Test(retryAnalyzer = Retry.class)
    @Description("Home Page search and Wisting Test")
    @Severity(SeverityLevel.CRITICAL)

    public void search () {
        SoftAssert soft = new SoftAssert();
        ListingSteps Steps = new ListingSteps();
        LoginUser StepLogIn = new LoginUser();

        StepLogIn
                .LogIN();
        Steps
                .sfilterWhen()
                .choosedates()
                .sFromdate()
                .sTilldate()
                .addguest()
                .addguestquantity()
                .searchbtn()
                //.listingFilters()
                //.minimalprice(Minprices)
                //.maximalprice(Maxprice)
                //.filtersearchbutton()
                .Addwishlist();
        soft.assertEquals("Saved to your Wishlist For Testing wishlist", $("._1n6q029").getText());

        Steps
                .listingLogout();



}
    }