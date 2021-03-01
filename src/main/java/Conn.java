import Sql.SqlAsortyment;

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

    public void sale() throws SQLException {
        System.out.println("Podaj kod kreskowy sprzedanego towaru");
        String kod_kreskowy = scanner.next();
        int valueKOD = Integer.parseInt(kod_kreskowy);

        System.out.println("Podaj ilosc sprzedanego towaru");
        int different = scanner.nextInt();

        int value=0;
        ResultSet resultSet = statement.executeQuery("SELECT ilosc from asortyment WHERE kod_kreskowy = "+valueKOD);
        while (resultSet.next()){
            value=resultSet.getInt("ilosc");
        }

        value-=different;
        statement.executeUpdate("Update asortyment SET ilosc="+ value +" where kod_kreskowy ="+valueKOD);
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
