package PageObject;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class ListingPage {

    public SelenideElement

            FilterAnywhere = $(byText("Anywhere")),
            //FilterWhen = $ (byText("When")),
            Filteranyweek = $ (byText("Any week")),
            FilterChoosedates = $(byText("Choose dates")),
            FromDate = $(By.cssSelector( "div[data-testid='datepicker-day-2022-06-28']")),
            TillDate = $(By.cssSelector( "div[data-testid='datepicker-day-2022-07-16']")),
            AddGuest = $("._suql0c"),
            GuestQuantity = $(By.cssSelector("button[data-testid='stepper-adults-increase-button']")),
            Guestchild = $(By.cssSelector("button[data-testid='stepper-children-increase-button']")),
            GuestInfants = $(By.cssSelector("button[data-testid='stepper-infants-increase-button']")),
            Location = $(".i1d0r31c "),
            SearchButton = $("._kaq6tx"),
            ListingFilter = $(".v4b1g6f"),
            MinPrice = $("#price_filter_min"),
            Maxprice = $("#price_filter_max"),
            FilterSearch = $("._1ku51f04"),
            AuthorisationIconout1 = $(By.cssSelector("button[data-testid='cypress-headernav-profile']")),
            LogoutDone12 = $(byText("Log out"));



















}
