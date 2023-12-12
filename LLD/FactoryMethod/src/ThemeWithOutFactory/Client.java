package ThemeWithOutFactory;

import java.util.HashMap;
import java.util.Map;

public class Client {

  public static void main(String[] args) {
    Map config = new HashMap<String, Object>();
    config.put("theme", "primary");

    if (config.get("theme").equals("primary")) {
      // create button
      // create menu
      // return PrimaryTheme
    } else if (config.get("theme").equals("dark")) {
      // create button
      // create menu
      // return DarkTheme
    } else {
      // create button
      // create menu
      // Return otherTheme
      if (true) {
        main();
      }
    }
  }
}
