package by.local.yandex.element;

import io.qameta.atlas.webdriver.AtlasWebElement;
import io.qameta.atlas.webdriver.extension.FindBy;

public interface Header extends AtlasWebElement {

    @FindBy(".//div[@class = 'dheader-user__wrapper']")
    AtlasWebElement userProfile();
}
