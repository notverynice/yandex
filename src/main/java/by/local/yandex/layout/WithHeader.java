package by.local.yandex.layout;

import by.local.yandex.element.Header;
import io.qameta.atlas.webdriver.extension.FindBy;

public interface WithHeader {

    @FindBy("//div[@class = 'dheader']")
    Header header();
}
