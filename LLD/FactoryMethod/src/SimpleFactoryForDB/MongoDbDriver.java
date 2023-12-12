package SimpleFactoryForDB;

public class MongoDbDriver implements DatabaseDriver{
    @Override
    public void connect() {
        System.out.println("mongo connect");
    }

    @Override
    public void query() {
        System.out.println("mongo query");
    }

    @Override
    public void close() {
        System.out.println("mongo close");
    }
}
