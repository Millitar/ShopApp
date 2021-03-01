import Sql.*;

import java.sql.*;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) throws SQLException {
        SqlAsortyment sqlAsortyment = new SqlAsortyment();
        SqlProdukt sqlProdukt = new SqlProdukt();
        SqlProducent sqlProducent = new SqlProducent();
        SqlKraj sqlKraj = new SqlKraj();


        Conn conn = new Conn();
        Scanner scanner = new Scanner(System.in);

        int choice=0;
        Boolean loop = true;

        while (true){
            System.out.println("Wpisz operacje");

            choice = scanner.nextInt();

            switch (choice){

                case 1 :
                    conn.viewAsortyment();
                    break;

                case 2 :
                    conn.resltSet(sqlAsortyment.addAsort());
                    break;

                case 3 :
                    conn.sale();
                    break;

                case 4 :
//                    long a = 5903978396357L;
                    conn.resltSet(sqlProdukt.addProduct());
                    break;

                case 5 :
                    conn.resltSet(sqlProdukt.deleteProduct());
                    break;

                case 6 :
                    conn.resltSet(sqlProducent.addProducent());
                    break;

                case 7 :
                    conn.resltSet(sqlProducent.deleteProducent());
                    break;

                case 8 :
                    conn.resltSet(sqlKraj.addKraj());
                    break;

                case 9 :
                    conn.resltSet(sqlKraj.deleteKraj());
                    break;

                default:
                    System.out.println("1-Wyświetlenie asortymentu\n" +
                            "Dodanie asorytmentu\n" +
                            "");
                    break;
            }
        }

    }
}
