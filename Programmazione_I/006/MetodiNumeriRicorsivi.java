import javax.print.event.PrintEvent;

public class MetodiNumeriRicorsivi {
    public static int esponenziale(int b, int e){
        if(e == 1){
            return b;
        }else{
            return b * esponenziale(b, e-1);
        }
    }

    public static int somma(int x, int y){
        if(y == 0){
            return 1;
        }else{
            return x + somma(1, y-1);
        }
    }

    public static int prodottoMultipli(int n, int m, int q){
        //si ocnsideri che n < m
        if((n > m)){
            return 1;
        }else{
            if(n % q == 0){
                return n * prodottoMultipli(n+1, m, q);
            }else{
                return prodottoMultipli(n+1, m, q);
            }
        }
    }

    public static void stampaInteroAlRovescio(int x){
        if(x == 0){
            System.out.print(0);
        }else{
            System.out.print(x + " ");
            stampaInteroAlRovescio(x-1);
        }

    }
    public static void main(String[] args) {
        System.out.println(esponenziale(2, 3));

        System.out.println(somma(2, 10));

        System.out.println(prodottoMultipli(3, 12, 3));

        stampaInteroAlRovescio(10);
    }
}
