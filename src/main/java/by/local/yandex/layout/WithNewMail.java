package by.local.yandex.layout;

import by.local.yandex.element.NewMail;
import io.qameta.atlas.webdriver.extension.FindBy;

public interface WithNewMail {

    @FindBy("//div[@class = 'ComposePopup-Content'")
    NewMail mail();
}
