package by.local.yandex.element;

import io.qameta.atlas.webdriver.AtlasWebElement;
import io.qameta.atlas.webdriver.extension.FindBy;
import io.qameta.atlas.webdriver.extension.Param;

public interface LoginForm extends AtlasWebElement {

    @FindBy(".//input[@name = '{{text}}']")
    AtlasWebElement input(@Param("text") String text);

}
