public class DatabaseV0 {
    private static DatabaseV0 instance = null;
    private DatabaseV0() {}

    public static DatabaseV0 getInstance() {
        if (instance == null) {
            instance = new DatabaseV0();
        }
        return instance;
    }
}
