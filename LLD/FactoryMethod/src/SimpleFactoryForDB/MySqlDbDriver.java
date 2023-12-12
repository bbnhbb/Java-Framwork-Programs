package SimpleFactoryForDB;

public class MySqlDbDriver implements DatabaseDriver {
    @Override
    public void connect() {
        System.out.println("my sql connect");
    }

    @Override
    public void query() {
        System.out.println("my sql query");
    }

    @Override
    public void close() {
        System.out.println("my sql close");
    }
}
