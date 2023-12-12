package SimpleFactoryForDB;

public class DatabaseDriverFactory {

  public static DatabaseDriver getDatabaseDriver(String dbType) {
    if (dbType.equals("sql")) {
      return new MySqlDbDriver();
    } else if (dbType.equals("mongo")) {
      return new MongoDbDriver();
    }
    return null;
  }
}
