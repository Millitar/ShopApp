import java.sql.*;
import java.util.Scanner;

public class Conn {
    final static String jdbcURL = "jdbc:mysql://localhost:3306/sklep";
    final static String user = "root";
    final static String pass = "militar";

    SqlAsortyment sqlAsortyment = new SqlAsortyment();
    Scanner scanner = new Scanner(System.in);

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

    public void valueFormIlosc() throws SQLException {
        String kod_kreskowy = scanner.next();
        int d = Integer.parseInt(kod_kreskowy);
        int value=0;
        ResultSet resultSet = statement.executeQuery("SELECT ilosc from asortyment WHERE kod_kreskowy = "+d);
        while (resultSet.next()){
            value=resultSet.getInt("ilosc");
        }
        System.out.println(value);
        sqlAsortyment.setIlosc(value);
        System.out.println(sqlAsortyment.getIlosc());
    }


    public void viewAsort() throws SQLException {
        ResultSet resultSet = statement.executeQuery("select * from sklep.asortyment");
        while (resultSet.next()){
            System.out.println(resultSet.getString(1)+" "+resultSet.getString(2)
                    +" "+resultSet.getString(3)
                    +" "+resultSet.getString(4));
        }
    }

    public void resltSet(String sql) throws SQLException {
        ResultSet resultSet = statement.executeQuery(sql);
    }
}
