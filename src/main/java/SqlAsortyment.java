import java.sql.*;
import java.util.Scanner;

public class SqlAsortyment {
    private String kod_kreskowy;
    private double cena;
    private int ilosc;



    Scanner scanner = new Scanner(System.in);

    public String getKod_kreskowy() {
        return kod_kreskowy;
    }

    public void setKod_kreskowy(String kod_kreskowy) {
        this.kod_kreskowy = kod_kreskowy;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public int getIlosc() {
        return ilosc;
    }

    public void setIlosc(int ilosc) {
        this.ilosc = ilosc;
    }

    private void scannKreskowy(){
        System.out.printf("Podaj kod kreskowy");
        kod_kreskowy = scanner.nextLine();
    }

    private void scannIlosc(){
        System.out.println("Podaj ilosc");
        ilosc = scanner.nextInt();
    }

    private void scannCena(){
        System.out.println("Podaj cene");
        cena = scanner.nextDouble();
    }



    public String addAsort(){
        scannKreskowy();
        scannIlosc();
        scannCena();

        return "INSERT INTO asortyment " + "VALUES ("+kod_kreskowy+",'McBeal',"+cena+","+ilosc+")";
    }

//    public String sale() throws SQLException {
//
//        System.out.println("Podaj ilosc sprzedanego towaru");
//        int value = scanner.nextInt();
//        System.out.println(ilosc);
////        ilosc-=value;
//        System.out.println(kod_kreskowy);
//        System.out.println(ilosc);
//        return "Update asortyment SET ilosc="+ value+" where kod_kreskowy =" +kod_kreskowy;
//
//    }


//    public void pokaz(){
//        System.out.println(kod_kreskowy);
//    }



}
