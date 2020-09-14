package by.local.yandex.element;

import io.qameta.atlas.webdriver.AtlasWebElement;
import io.qameta.atlas.webdriver.extension.FindBy;

public interface LeftSideBar extends AtlasWebElement {

    @FindBy(".//span[@class = 'mail-ComposeButton-Text']")
    AtlasWebElement writeNewMailButton();
}
