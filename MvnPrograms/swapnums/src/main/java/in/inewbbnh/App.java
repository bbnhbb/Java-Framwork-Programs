package in.inewbbnh;

/**
 * Hello world!
 *
 */
public class App 
{
    public int add(int x, int y) {
        return x+y;
    }
    public static void main( String[] args )
    {
        App a = new App();
        int addValue = a.add(10, 20);
        System.out.println(addValue);
        System.out.println( "Hello World!" );
    }
}
