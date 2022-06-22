package Utils;

import StepObject.ListingSteps;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;

import static DataObject.ListingPageData.LocationGe;
import static DataObject.RegistrationData.Addresscities;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class SearchFilter extends BrowserOpener{

    ListingSteps Steps = new ListingSteps();


    @BeforeTest(description = "Open Any Location")

    public void BrowserOpenerList() {
        Steps.filterAnywhere();
        Steps.addlocation(Addresscities);
        Steps.searchbtn();


    }

}
