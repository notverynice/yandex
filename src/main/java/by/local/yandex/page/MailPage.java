package by.local.yandex.page;

import by.local.yandex.layout.WithLeftSideBar;
import by.local.yandex.layout.WithNewMail;
import io.qameta.atlas.webdriver.AtlasWebElement;
import io.qameta.atlas.webdriver.WebPage;
import io.qameta.atlas.webdriver.extension.Page;

public interface MailPage extends WebPage, WithLeftSideBar, WithNewMail {

    @Page
    AtlasWebElement mailPage();
}
