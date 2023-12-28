package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.ArticlePage;
import pages.OnboardingPage;
import pages.SearchPage;
import pages.SearchResultPage;

import static io.qameta.allure.Allure.step;

public class ArticleTests extends TestBase {

    private SearchPage searchPage = new SearchPage();
    private SearchResultPage searchResultPage = new SearchResultPage();
    private ArticlePage articlePage = new ArticlePage();
    private OnboardingPage onboardingPage = new OnboardingPage();

    private final static String SEARCH_VALUE = "Amazon";

    @Test
    @Tag("article")
    @DisplayName("Проверка работы строки поиска")
    void checkSearchTest() {
        step("Скип экрана онбординга", () -> {
            onboardingPage.skipButtonClick();
        });
        step("Ввод значения Amazon в строку поиска", () -> {
            searchPage.clickOnFirstSearch()
                    .clickOnSecondSearch(SEARCH_VALUE);
        });
        step("Клик по строке поиска с содержанием текста введенного запроса", () -> {
                    searchResultPage.clickOnLineSearch(SEARCH_VALUE);
                }
        );
        step("Проверка открытой страницы", () -> {
                    articlePage.checkNameArticle(SEARCH_VALUE);
                }
        );
    }

}
