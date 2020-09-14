package by.local.yandex.element;

import io.qameta.atlas.webdriver.AtlasWebElement;
import io.qameta.atlas.webdriver.extension.FindBy;

public interface ProfileCard extends AtlasWebElement<ProfileCard> {

    @FindBy(".//span[@class = 'avatar']")
    AtlasWebElement avatar();
}
