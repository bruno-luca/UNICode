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

    public static void main(String[] args) {
        // Test della somma
        System.out.println("33 + 3 = " + somma(33, 3) + ", atteso: " + (33+3));
        System.out.println("4 + 0 = " + somma(4, 0) + ", atteso: " + (4+0));

        // Verifica commutatività della somma
        System.out.println(somma(33, 3) == somma(3, 33));
        System.out.println(somma(4, 0) == somma(0, 4));

        // ESERCIZIO: verificare associatività somma con alcuni esempi di test
        //            (x+y)+z == x+(y+z)


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
    }
}
