import java.sql.*;
import java.util.Scanner;

public class SqlAsort {
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

    public String addAsort(){
        System.out.printf("Podaj kod kreskowy");
        kod_kreskowy = scanner.nextLine();
        System.out.println("Podaj ilosc");
        ilosc = scanner.nextInt();
        System.out.println("Podaj cene");
        cena = scanner.nextDouble();

        return "INSERT INTO asortyment " + "VALUES ("+kod_kreskowy+",'McBeal',"+cena+","+ilosc+")";
    }

    public String sale() throws SQLException {

        System.out.println("Podaj ilosc sprzedanego towaru");
        int value = scanner.nextInt();
        System.out.println("Podaj kod kreskowy");
        kod_kreskowy = scanner.nextLine();

        ilosc-=value;

        return "Update asortyment SET ilosc="+ value+" where kod_kreskowy =" +kod_kreskowy;

    }




}
