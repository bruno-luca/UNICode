import javax.sound.sampled.SourceDataLine;
import java.util.*;

public class AritNatIter {

    // metodo che implementa la somma di due numeri x e y, 
    // attraverso incrementi progressivi di +1. 
    // L'argomento y non può essere negativo.
    public static int somma(int x, int y) { // x, y parametri formali
        int s = x;
        int i = 0;
        while (i < y) {
            s = s + 1;
            i = i + 1;
        }
        return s;
    }

    // il metodo moltiplicazione restituisce il prodotto tra x ed y.
    // Il prodotto viene realizzato attraverso incrementi successivi di +1.
    public static int moltiplicazione(int x, int y) { // x, y parametri formali 
        int m = 0;
        int i = 0;
        while (i < y) {
            m = somma(m, x); // chiamiamo somma sui parametri attuali m e x
            // risultato: m' = m+x
            i = i + 1;
        }
        return m;
    }

    public static int max(int x, int y){
        if (x > y){
            return x;
        }else{
            return y;
        }
    }

    public static int sommatoria(int x){
        int s = 0;
        for(int i = 1; i <= x; i++){
            s += i;
        }
        return s;
    }

    public static int fattoriale(int x){
        int f = 1;
        while(x > 0){
            f = f*x;
            x--;
        }
        return f;
    }

    public static int potenza(int b, int e){

        int ripeti = (e < 0) ? -e: e;
        int pot = b;

        if(e == 0){
            return 1;
        }else{
            while(ripeti>1){
                pot = pot*b;
                ripeti--;
            }
            return pot;
        }
    }

    public static void main(String[] args) {
        // Test della somma
        System.out.println("33 + 3 = " + somma(33, 3) + ", atteso: " + (33+3));
        System.out.println("4 + 0 = " + somma(4, 0) + ", atteso: " + (4+0));

        // Verifica commutatività della somma
        System.out.println("33 + 3 == 3 + 33: " + (somma(33, 3) == somma(3, 33)));
        System.out.println("4 + 0 == 0 + 4" + (somma(4, 0) == somma(0, 4)));

        // ESERCIZIO: verificare associatività somma con alcuni esempi di test
        //            (x+y)+z == x+(y+z)

        System.out.println("(33 + 3) + 4 == 33 + (3 + 4): " + (somma(somma(33, 3), 4) == somma(33, somma(3, 4))));


        // Test metodo moltiplicazione 
        System.out.println("523 * 13 = " + moltiplicazione(523, 13) 
            + ", atteso: " + (523*13));
        System.out.println("523 * 0 = " + moltiplicazione(523, 0) 
            + ", atteso: " + (523*0));

        // Test commutatività moltiplicazione 
        System.out.println(moltiplicazione(523, 13) == moltiplicazione(13, 523));
        System.out.println(moltiplicazione(523, 0) == moltiplicazione(0, 523));
        System.out.println(moltiplicazione(0, 13) == moltiplicazione(13, 0));

        // ESERCIZIO: verificare associatività moltiplicazione con alcuni esempi di test
        //            (x*y)*z == x*(y*z)
        System.out.println("(33 * 3) * 4 == 33 * (3 * 4): " + (moltiplicazione(moltiplicazione(33, 3), 4) == moltiplicazione(33, moltiplicazione(3, 4))));

        System.out.println("massimo 4, 3 = " + max(3, 4));

        System.out.println("Sommatoria 5 = " + sommatoria(5));

        System.out.println("Fattoriale 5 = " + fattoriale(5));

        System.out.println("-2^3 = " + potenza(-2, 3));

        
    }
}
