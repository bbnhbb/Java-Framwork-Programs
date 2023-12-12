package NoFactory;

public class Email {
    public static void sendEmail(String dbType) {
        if (dbType.equals("sql")) {
            SqlDbDriver db = new SqlDbDriver();
            db.getUser();
//            send email code
        } else if (dbType.equals("mongo")) {
            MongoDbDriver db = new MongoDbDriver();
            db.getUser();
//            send email code

        }
    }
}
