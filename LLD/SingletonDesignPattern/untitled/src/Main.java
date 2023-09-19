public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

//        V0
        DatabaseV0 db = DatabaseV0.getInstance();

        DatabaseV0 db1 = DatabaseV0.getInstance();

        SomeOtherClass s = new SomeOtherClass();
        DatabaseV0 db2 = s.createDBClass();

    }
}