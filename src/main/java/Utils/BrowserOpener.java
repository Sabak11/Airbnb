package Utils;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.testng.annotations.BeforeTest;
import static com.codeborne.selenide.Selenide.sleep;


public class BrowserOpener {

    @BeforeTest(description = "Configure browser before tests")
    public void openbrowser(){
        Selenide.open("https://airbnb.com");
        Configuration.browserSize = "1920x1080";
        sleep(7000);

    }



}



