package by.local.yandex.layout;

import by.local.yandex.element.LeftSideBar;
import io.qameta.atlas.webdriver.extension.FindBy;

public interface WithLeftSideBar {

    @FindBy("//div[@class = 'mail-Layout-Inner']/child::div[contains(@class, 'mail-Layout-Aside')]")
    LeftSideBar leftSideBar();
}
