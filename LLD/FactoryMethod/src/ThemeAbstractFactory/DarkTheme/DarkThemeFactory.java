package ThemeAbstractFactory.DarkTheme;

import ThemeAbstractFactory.Button.Button;
import ThemeAbstractFactory.Button.DarkThemeButton;
import ThemeAbstractFactory.Dropdown.Dropdown;
import ThemeAbstractFactory.Menu.Menu;
import ThemeAbstractFactory.ThemeFactory;

public class DarkThemeFactory implements ThemeFactory {
  @Override
  public Button createButton() {
    return new DarkThemeButton();
  }

  @Override
  public Menu createMenu() {
    return null;
  }

  @Override
  public Dropdown createDropdown() {
    return null;
  }
}
