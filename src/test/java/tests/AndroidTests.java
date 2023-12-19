package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.ArticlePage;
import pages.OnboardingPage;
import pages.SearchPage;
import pages.SearchResultPage;

import static io.qameta.allure.Allure.step;

public class AndroidTests extends TestBase {

  private SearchPage searchPage = new SearchPage();
  private SearchResultPage searchResult = new SearchResultPage();
  private ArticlePage articlePage = new ArticlePage();
  private OnboardingPage onboardingPage = new OnboardingPage();

  private final static String SEARCH_VALUE = "Appium";
  private final static String ERROR_TEXT_VALUE = "An error occurred";
  private final static String ERROR_BUTTON_NAME = "GO BACK";


  @Test
  @Tag("browserstack")
  @DisplayName("Проверка отображения сообщения об ошибке на странице Википедии")
  void checkErrorTextTest() {
    step("Ввод значения Appium в строку поиска", () -> {
      searchPage.clickOnFirstSearch()
              .clickOnSecondSearch(SEARCH_VALUE);
    });
    step("Клик по строке поиска с содержанием текста введенного запроса", () -> {
              searchResult.clickOnLineSearch(SEARCH_VALUE);
            }
    );
    step("Проверка видимости сообщения об ошибке", () -> {
              articlePage.checkErrorText(ERROR_TEXT_VALUE)
                      .checkErrorButton(ERROR_BUTTON_NAME);
            }
    );
  }

  @Test
  @Tag("emulator")
  @DisplayName("Проверка текстов на экранах онбординга")
  void checkOnboardingTest() {
    step("Проверка первого экрана", () -> {
      onboardingPage.checkPrimaryText("The Free Encyclopedia …in over 300 languages")
              .checkSecondaryText("We’ve found the following on your device:")
              .checkOptionLabel("1. English")
              .checkLanguageButtonText("Add or edit languages")
              .continueButtonClick();
    });
    step("Проверка второго экрана", () -> {
      onboardingPage.checkPrimaryText("New ways to explore")
              .checkSecondaryText("Dive down the Wikipedia rabbit hole with a constantly updating " +
                      "Explore feed. Customize the feed to your interests – whether it’s learning about historical " +
                      "events On this day, or rolling the dice with Random.")
              .continueButtonClick();
    });
    step("Проверка третьего экрана", () -> {
      onboardingPage.checkPrimaryText("Reading lists with sync")
              .checkSecondaryText("You can make reading lists from articles you want to read later, " +
                      "even when you’re offline. Login to your Wikipedia account to sync your reading lists. " +
                      "Join Wikipedia")
              .continueButtonClick();
    });
    step("Проверка четвертого экрана", () -> {
      onboardingPage.checkPrimaryText("Send anonymous data")
              .checkSecondaryText("Help make the app better by letting us know how you use it. " +
                      "Data collected is anonymous. Learn more")
              .checkRejectButtonText("Reject")
              .checkAcceptButtonText("Accept");
    });
  }

}
