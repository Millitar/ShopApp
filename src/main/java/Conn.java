import java.sql.*;

public class SqlJava {
    final static String jdbcURL = "jdbc:mysql://localhost:3306/sklep";
    final static String user = "root";
    final static String pass = "militar";
    Connection connection;

    {
        try {
            connection = DriverManager.getConnection(jdbcURL, user,pass);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    Statement statement;

    {
        try {
            statement = connection.createStatement();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }


    public void viewAsort() throws SQLException {
        ResultSet resultSet = statement.executeQuery("select * from sklep.asortyment");
        while (resultSet.next()){
            System.out.println(resultSet.getString(1)+" "+resultSet.getString(2));
        }
    }

    public void addAsort(){
        String
    }
}
