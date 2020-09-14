package by.local.yandex.page;

import by.local.yandex.layout.WithLoginForm;
import io.qameta.atlas.webdriver.AtlasWebElement;
import io.qameta.atlas.webdriver.WebPage;
import io.qameta.atlas.webdriver.extension.Page;

public interface LoginPage extends WebPage, WithLoginForm {

    @Page
    AtlasWebElement loginBlock();

}
