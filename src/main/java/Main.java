import java.sql.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws SQLException {
        SqlAsort sqlAsort = new SqlAsort();
        Conn conn = new Conn();
        Scanner scanner = new Scanner(System.in);

        int choice=0;
        Boolean loop = true;

        while (true){
            choice = scanner.nextInt();

            switch (choice){

                case 1 :
                    conn.viewAsort();
                    break;

                case 2 :
                    conn.resultSet(sqlAsort.addAsort());
                    break;

                case 3 :
                    conn.valueFromIlosc();
                    conn.resultSet(sqlAsort.sale());

            }
        }



    }
}
