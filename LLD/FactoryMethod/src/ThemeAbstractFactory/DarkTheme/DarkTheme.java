package ThemeAbstractFactory.DarkTheme;

import ThemeAbstractFactory.Theme;
import ThemeAbstractFactory.ThemeFactory;

public class DarkTheme extends Theme {
  @Override
  public ThemeFactory createThemeFactory() {
    return null;
  }

  @Override
  public boolean changePrimaryColor(String color) {
    return false;
  }
}
