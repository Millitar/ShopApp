import java.sql.*;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) throws SQLException {
        SqlAsortyment sqlAsortyment = new SqlAsortyment();

        Conn conn = new Conn();
        Scanner scanner = new Scanner(System.in);

        int choice=0;
        Boolean loop = true;

        while (true){
            System.out.println("Wpisz operacje");

            choice = scanner.nextInt();

            switch (choice){

                case 1 :
                    conn.viewAsort();
                    break;
                case 2 :
                    System.out.println("Podaj kod kreskowy");
                    conn.valueFormIlosc();
                    sqlAsortyment.sale();
                    System.out.println(sqlAsortyment.getIlosc());
                    break;
            }
        }

    }
}
