package by.local.yandex.page;

import by.local.yandex.element.ProfileCard;
import io.qameta.atlas.webdriver.ElementsCollection;
import io.qameta.atlas.webdriver.WebPage;
import io.qameta.atlas.webdriver.extension.Page;

public interface ProfilePage extends WebPage, ProfileCard {

    @Page
    ElementsCollection<ProfileCard> loggedIn();
}
