public class EserciziBooleani {

    public static void main(String[] args) {
        int a = 2;
        int b = 4;
        // a) dati due interi, stampi true se il primo intero è multiplo del secondo, false altrimenti;
        System.out.println(((a % b) == 0) ? true : false);

        // b) dato un intero (un voto), stampi true se tale intero è compreso fra 1 e 30 (inclusi), false altrimenti;
        System.out.println((a >= 1 && a <= 30) ? true : false);

        boolean b1 = true;
        boolean b2 = true;
        // c) dati due booleani b1 e b2, stampi a video il booleano false, se b1 e b2 sono entrambi veri, true altrimenti;
        System.out.println( (b1 && b2) ? false : true);

        // d) dati due interi, stampi a video il massimo; se sono uguali stampi a video "I due valori sono uguali".

        int x1 = 3;
        int x2 = 1;
        int x3 = 2;
        // e) dati tre interi, stampi a video il massimo (si usi una variabile di supporto max); 

        // f) dati tre interi, stampi a video true se questi sono ordinati in modo crescente
    }
}
