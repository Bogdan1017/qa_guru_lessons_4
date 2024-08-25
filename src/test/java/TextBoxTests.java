import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


public class TextBoxTests {
    //https://demoqa.com/text-box/
    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "1920x1080";
        Configuration.baseUrl = "https://demoqa.com";
    }
    @Test
    void fillFormTest(){
        open("/text-box/");
        $("[id=userName]").setValue("Lionel Messi");
        $("[id=userEmail]").setValue("test1@Gmail.com");
        $("[id=currentAddress]").setValue("Walt street");
        $("[id=permanentAddress]").setValue("Another address");

        $("[id=submit]").click();

        $("[id=output]").shouldHave(text("Lionel Messi"),text("test1@Gmail.com"),
                text("test1@Gmail.com"),text("Walt street"));



    }

}
