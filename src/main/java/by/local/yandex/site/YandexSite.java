package by.local.yandex.site;

import by.local.yandex.page.LoginPage;
import by.local.yandex.page.MailPage;
import by.local.yandex.page.ProfilePage;
import io.qameta.atlas.webdriver.WebSite;
import io.qameta.atlas.webdriver.extension.Page;

public interface YandexSite extends WebSite {

    @Page
    LoginPage onLoginPage();

    @Page
    MailPage onMailPage();

    @Page
    ProfilePage onProfilePage();
}
