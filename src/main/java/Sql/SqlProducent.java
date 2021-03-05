package Sql;

import java.util.Scanner;

public class SqlProducent {
    private String kodKreskowy;
    private String kodKreskowyProducenta;
    private String nazwaFirmy;
    private String siedzibaFirmy;
    private int kodKraju;

    Scanner scanner = new Scanner(System.in);

    private void scannKodKreskowy(){
        System.out.println("Podaj kod kreskowy");
        kodKreskowy = scanner.next();
    }

    private void scannNazwaFirmy(){
        System.out.println("Podaj nazwe firmy");
        nazwaFirmy = scanner.next();
    }

    private void scannSiedzibaFirmy(){
        System.out.println("Podaj lokalizacja siedziby");
        siedzibaFirmy = scanner.next();
    }

    private void kodKreskowyProducentaSubstring(){
//        String pom = kodKreskowy.substring(2,6);
        kodKreskowyProducenta = kodKreskowy.substring(2,6);
    }

    private void kodKrajuSubstring(){
        String pom = kodKreskowy.substring(0,3);
        kodKraju = Integer.parseInt(pom);
    }


    public String addProducent(){
        scannKodKreskowy();
        scannNazwaFirmy();
        scannSiedzibaFirmy();
        kodKrajuSubstring();
        kodKreskowyProducentaSubstring();

        return "INSERT INTO producent(kod_kreskowy, kod_kreskowy_producenta, nazwa_firmy, siedziba_firmy, kod_kraju)"+" VALUE ("+kodKreskowy+","+kodKreskowyProducenta+","+nazwaFirmy+","+siedzibaFirmy+","+kodKraju+")";
    }

    public String deleteProducent(){
        System.out.println("Podaj id producenta który chcesz usunąć");
        int idProducenta = scanner.nextInt();

        return "DELETE FROM producent WHERE id_producenta="+idProducenta;
    }



}
