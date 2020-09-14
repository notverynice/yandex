package by.local.yandex.layout;

import by.local.yandex.element.LoginForm;
import io.qameta.atlas.webdriver.extension.FindBy;

public interface WithLoginForm {

    @FindBy("//form")
    LoginForm loginForm();
}
