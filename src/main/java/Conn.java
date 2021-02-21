import java.sql.*;


public class Conn {
    final static String jdbcURL = "jdbc:mysql://localhost:3306/sklep";
    final static String user = "root";
    final static String pass = "militar";

    SqlAsort sqlAsort = new SqlAsort();

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

    public void resultSet(String sql) throws SQLException {
        statement.executeUpdate(sql);
    }

    public void valueFromIlosc() throws SQLException {
        String kod = sqlAsort.getKod_kreskowy();
        ResultSet resultSet = statement.executeQuery("SELECT ilosc from asortyment where kod_kreskowy ="+kod);
        int value=0;
        while (resultSet.next()) {
             value = resultSet.getInt("ilosc");
        }
        sqlAsort.setIlosc(value);
    }


    public void viewAsort() throws SQLException {
        ResultSet resultSet = statement.executeQuery("select * from sklep.asortyment");
        while (resultSet.next()){
            System.out.println(resultSet.getString(1)+" "+resultSet.getString(2)
                    +" "+resultSet.getString(3)
                    +" "+resultSet.getString(4));
        }
    }
}
