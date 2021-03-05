package Sql;

import java.util.Scanner;

public class SqlKraj {
    private int kodKraju;
    private String nazwaKraju;

    Scanner scanner = new Scanner(System.in);

    private void scannNazwaKraju(){
        System.out.println("Podaj nazwe kraju");
        nazwaKraju = scanner.next();
    }

    private void scannKodKraju(String choice){
        System.out.println("Podaj kod kraju");
        if(choice.equals("delete")){
            System.out.println("któru chcesz usunąć");
        }
        kodKraju = scanner.nextInt();
    }

    public String addKraj(){
        scannKodKraju("add");
        scannNazwaKraju();

        return "INSERT INTO kraj " + "VALUES ("+kodKraju+","+"'"+nazwaKraju+"'"+")";
    }

    public String deleteKraj(){
        scannKodKraju("delete");

        return "Delete from kraj where kod_kraju ="+kodKraju;
    }

}
