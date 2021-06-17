package steps;

import io.cucumber.java.en.And;
import pages.LoginPage;
import pages.MainPage;


public class ScenarioSteps {

    final LoginPage loginPage = new LoginPage();
    final MainPage mainPage = new MainPage();

    @And("^Страница авторизации: вводим логин \"([^\"]*)\" и пароль \"([^\"]*)\"$")
    public void loginWithParametresCucumber(String login, String password) {
        loginPage.enterLoginAndPassword(login, password);
    }

    @And("^Страница авторизации: нажимаем кнопку подтвердить$")
    public void submitBtnClickCucumber() {
        loginPage.submitClick();
    }

    @And("^Грид: выбираем 'Расходы'$")
    public void clickCostCucumber() {
        mainPage.costsClick();
    }

    @And("^Грид: выбираем 'Командировки' в выпадающем списке$")
    public void clickAssigmentCucumber() {
        mainPage.assignmentClick();
    }

    @And("^Грид: ловим ошибку$")
    public void checkNotNullCucumber() {
        mainPage.checkSmth();
    }
}
