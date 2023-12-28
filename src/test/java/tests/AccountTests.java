package tests;

import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.*;

import static io.qameta.allure.Allure.step;

public class AccountTests extends TestBase {

    private LoginPage loginPage = new LoginPage();
    private MainPage mainPage = new MainPage();
    private OnboardingPage onboardingPage = new OnboardingPage();

    private final static String USERNAME = "Username";
    private final static String PASSWORD = "Password";
    private final static String REPEAT = "Repeat password";
    private final static String EMAIL = "Email (Optional)";

    @Test
    @Tag("login")
    @Tag("smoke")
    @Owner("izolina")
    @Feature("Авторизация в Википедии")
    @Story("Страница Логина в Википедии")
    @Severity(SeverityLevel.CRITICAL)
    @DisplayName("Проверка объектов на странице создания нового аккаунта")
    void checkAccountPageTest() {
        step("Скип экрана онбординга", () -> {
            onboardingPage.skipButtonClick();
        });
        step("Клик по кнопке More", () -> {
                    mainPage.clickOnMoreButton();
                }
        );
        step("Клик по кнопке Log In", () -> {
                    mainPage.clickOnLogInButton();
                }
        );
        step("Проверка объектов на форме создания аккаунта", () -> {
                    loginPage.checkFieldLogin(USERNAME)
                            .checkFieldLogin(PASSWORD)
                            .checkFieldLogin(REPEAT)
                            .checkFieldLogin(EMAIL)
                            .checkNextButton()
                            .checkLogInButton();
                }
        );
    }

}
