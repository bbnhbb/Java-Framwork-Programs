package FactoryMethod.Factory;

import FactoryMethod.Button.HtmlButton;
import FactoryMethod.Button.Button;

public class HtmlDialog extends Dialog {
    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
