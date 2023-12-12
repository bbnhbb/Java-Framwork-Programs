package ThemeAbstractFactory;

public abstract class Theme {
  public String name;
  public String primaryColor;
  public String Author;

  public abstract ThemeFactory createThemeFactory();

  public abstract boolean changePrimaryColor(String color);
}
