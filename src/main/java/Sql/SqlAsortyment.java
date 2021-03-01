package Sql;

import java.util.Scanner;

public class SqlAsortyment {
    private String kod_kreskowy;
    private double cena;
    private int ilosc;


    Scanner scanner = new Scanner(System.in);


    private void scannKreskowy(){
        System.out.println("Podaj kod kreskowy");
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


        return "INSERT INTO asortyment " + "VALUES ("+kod_kreskowy+","+cena+","+ilosc+")";
    }
    



}
