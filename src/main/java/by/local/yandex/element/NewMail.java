package by.local.yandex.element;

import io.qameta.atlas.webdriver.AtlasWebElement;
import io.qameta.atlas.webdriver.extension.FindBy;

public interface NewMail extends AtlasWebElement {

    @FindBy(".//span[contains(text(), 'Кому')]/ancestor::div[@class = 'compose-LabelRow']/descendant::div[contains(@class, 'MultipleAddressesDesktop-Field')]")
    AtlasWebElement to();

    @FindBy(".//input[@name='subject']")
    AtlasWebElement subject();

    @FindBy(".//div[@class='composeReact-MBodyPanels']//descendant::div[@placeholder]")
    AtlasWebElement message();

    @FindBy(".//button")
    AtlasWebElement send();
}
