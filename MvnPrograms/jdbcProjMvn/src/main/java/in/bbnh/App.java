package in.bbnh;

import java.sql.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws SQLException
    {

        System.out.println( "Hello World!" );

        String url = "jdbc:mysql://localhost:3306/library_new";
        String username = "root";
        String password = "admin";

        Connection connection = DriverManager.getConnection(url, username, password);
        System.out.println("connection object created::" + connection);


        Statement statement = connection.createStatement();
        System.out.println("statement object created::" + statement);

        String sqlSelectQuery = "select id, author, isbn, subject, title from book";
        ResultSet resultSet = statement.executeQuery(sqlSelectQuery);
        System.out.println("ResultSet object::" + resultSet);

        System.out.println(" id, author, subject, title");

        while(resultSet.next()) {
            Integer id = resultSet.getInt(1);
            String author = resultSet.getString(2);
            Integer isbn = resultSet.getInt(3);
            String subject = resultSet.getString(4);
            String title = resultSet.getString(5);
            System.out.println(id+" "+ author+" "+ isbn+" "+ subject+" "+ title);
        }
        connection.close();
    }
}
