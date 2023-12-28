package pages;

import com.codeborne.selenide.ElementsCollection;
import io.appium.java_client.AppiumBy;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$$;

public class ArticlePage {

    private ElementsCollection nameArticle = $$(AppiumBy.className("android.widget.TextView"));


    public ArticlePage checkNameArticle(String valueNameArticle) {
        nameArticle.findBy(text(valueNameArticle)).shouldBe(visible);
        return this;
    }

}
