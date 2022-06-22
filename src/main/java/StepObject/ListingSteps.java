package StepObject;

import PageObject.ListingPage;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import java.time.Duration;

import static DataObject.RegistrationData.Username;
import static com.codeborne.selenide.Selenide.*;
import static org.testng.AssertJUnit.assertEquals;

public class ListingSteps extends ListingPage {

    @Step("Fill Field Anywhere")
    public ListingSteps filterAnywhere() {
        FilterAnywhere.shouldBe(Condition.visible, Duration.ofMillis(200000));
        FilterAnywhere.click();
        return this;
    }

    @Step("Click Field When")
    public ListingSteps sfilterWhen() {
        Filteranyweek.click();
        return this;
    }

    @Step("Fill Field Choose Dates")
    public ListingSteps choosedates() {
        FilterChoosedates.click();
        return this;
    }

    @Step("Fill Field from Dates")
    public ListingSteps sFromdate() {
        FromDate.click();
        return this;
    }

    @Step("Fill Field Till Dates")
    public ListingSteps sTilldate() {
        TillDate.click();
        return this;
    }

    @Step("Add Guest Button")
    public ListingSteps addguest() {
        AddGuest.click();
        sleep(2000);
        return this;
    }

    @Step("Add Guest Quantity")
    public ListingSteps addguestquantity() {
        GuestQuantity.doubleClick();
        Guestchild.click();
        GuestInfants.click();
        sleep(1000);
        return this;
    }


    @Step("Add Location Batumi")
    public ListingSteps addlocation(String destination) {
        Location.setValue(destination);
        Location.shouldNotBe(Condition.empty);
        return this;
    }

    @Step("Click Search Button")
    public ListingSteps searchbtn() {
        SearchButton.click();
        sleep(3000);
        return this;
    }

    @Step("Click Filter Listing")
    public ListingSteps listingFilters() {
        ListingFilter.click();
        sleep(1000);
        return this;
    }

    @Step("Set Min Price")
    public ListingSteps minimalprice(String pricemin) {
        MinPrice.setValue(pricemin);
        MinPrice.shouldNotBe(Condition.empty);
        sleep(1000);
        return this;
    }

    @Step("Set Max Price")
    public ListingSteps maximalprice(String pricemax) {
        Maxprice.sendKeys(Keys.CONTROL,"a",Keys.DELETE);
        Maxprice.setValue(pricemax);
        Maxprice.shouldNotBe(Condition.empty);
        sleep(1000);
        return this;
    }

    @Step("click  Filter Search Button")
    public ListingSteps filtersearchbutton() {
        FilterSearch.click();
        sleep(3000);
        return this;
    }

    @Step("Add Wishlist Statements")
    public ListingSteps Addwishlist() {
        int cardNumber = $$(".ckqgked").size();
        for (int i = 0; i < 3; i++){
            $(".ckqgked button", i).click();
            sleep(2000);
            $("#loading", 1).parent().parent().click();
        }
        return this;
    }


    @Step("Log Out From Listing")
    public ListingSteps listingLogout() {
        AuthorisationIconout1.click();
        sleep(1000);
        LogoutDone12.click();
        sleep(5000);
        return this;
    }

}


