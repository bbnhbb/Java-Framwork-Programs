package ThemeAbstractFactory;

import ThemeAbstractFactory.Button.Button;
import ThemeAbstractFactory.Dropdown.Dropdown;
import ThemeAbstractFactory.Menu.Menu;

public interface ThemeFactory {
  Button createButton();

  Menu createMenu();

  Dropdown createDropdown();
}
