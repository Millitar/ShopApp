import java.util.Scanner;

public class SqlProdukt {
    private String kod_kreskowy;
    private int kod_kreskowy_producenta;
    private double energia;

    Scanner scanner =new Scanner(System.in);

    private void scannK_k(){
        System.out.println("Podaj kod kreskowy produktu");
        kod_kreskowy = scanner.next();
    }

    private  void scannEnergia(){
        System.out.println("Podaj wartosc energetyczna produktu");
        energia = scanner.nextDouble();
    }

    public String addProduct(){
        scannK_k();
        scannEnergia();

        return
    }
}
