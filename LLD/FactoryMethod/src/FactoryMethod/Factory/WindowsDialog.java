package FactoryMethod.Factory;

import FactoryMethod.Button.Button;
import FactoryMethod.Button.WindowButton;

public class WindowsDialog extends Dialog {
    @Override
    public Button createButton() {
        return new WindowButton();
    }
}
