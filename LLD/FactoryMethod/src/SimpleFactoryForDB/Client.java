package SimpleFactoryForDB;

public class Client {
  public static void main(String[] args) {
    DatabaseDriver sql = DatabaseDriverFactory.getDatabaseDriver("sql");
    Email.sendEmail(sql);
  }
}
