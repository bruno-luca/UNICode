import java.util.*;

import javax.print.event.PrintEvent;

public class Freccia {
    public static void stampaRiga(int p, int a){
        String riga = "";
        while(p>0){
            riga += '.';
            p--;
        }
        while(a>0){
            riga += '*';
            a--;
        }

        System.out.println(riga);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        do{
            System.out.print("Inserisci N: ");
            n = scanner.nextInt();
        }while(n<0);

        for(int i = 0; i < n; i++){
            stampaRiga(i, 2);
        }

        for(int i = n-2; i > 0; i--){
            stampaRiga(i, 2);
        }

        scanner.close();
    }
}
