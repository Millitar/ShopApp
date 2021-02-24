import java.util.Scanner;

public class SqlProdukt {
    private String kod_kreskowy;
    private int kod_kreskowy_producenta;
    private double energia;
    private String nazwa;

    Scanner scanner =new Scanner(System.in);

    private void scannK_k(){
        System.out.println("Podaj kod kreskowy produktu");
        kod_kreskowy = scanner.next();
    }

    private  void scannEnergia(){
        System.out.println("Podaj wartosc energetyczna produktu");
        energia = scanner.nextDouble();
    }

    private void scannNazwa(String choice){
        System.out.println("Podaj nazwe produktu");
        if(choice.equals("delete")){
            System.out.println("który chcesz usunąć");
        }else if (choice.equals("add")){
            System.out.println("który chcesz dodać");
        }
        nazwa = scanner.next();
    }

    private void kodKreskowyProducentaSubstring(){
        String pom = kod_kreskowy.substring(7,12);
        kod_kreskowy_producenta = Integer.parseInt(pom);
    }


    public String addProduct(){
        scannK_k();
        scannEnergia();
        kodKreskowyProducentaSubstring();
        scannNazwa("add");

        return "INSERT INTO produkt(kod_kreskowy, kod_kreskowy_produktu, wartosci_energetyczna, nazwa) VALUE ("+kod_kreskowy+","+kod_kreskowy_producenta+","+energia+","+nazwa+")";
    }

    public String deleteProduct(){
        scannNazwa("delete");

        return "Delete from produkt where nazwa ="+nazwa;
    }
}
