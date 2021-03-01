import Sql.SqlAsortyment;
import Sql.SqlProdukt;
import Sql.SqlProducent

import java.sql.*;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) throws SQLException {
        SqlAsortyment sqlAsortyment = new SqlAsortyment();
        SqlProdukt sqlProdukt = new SqlProdukt();
        SqlProducent sqlProducent = new SqlProducent();


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

                case 5 :
                    conn.resltSet(sqlProdukt.deleteProduct());
                    break;

                case 6 :
                    conn.resltSet(sqlProducent.addProducent());
                    break;


                default:
                    System.out.println();
                    break;
            }
        }

    }
}
