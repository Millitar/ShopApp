import java.sql.*;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) throws SQLException {
        SqlAsortyment sqlAsortyment = new SqlAsortyment();
        SqlProdukt sqlProdukt = new SqlProdukt();

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
                    conn.resltSet(sqlAsortyment.addAsort());
                    break;

                case 3 :
                    conn.sale();
                    break;

                case 4 :
                    conn.resltSet(sqlProdukt.addProduct());
                    break;

                default:
                    System.out.println();
                    break;
            }
        }

    }
}
