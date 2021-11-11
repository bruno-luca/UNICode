import java.util.*;

public class SommeCifre {
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

    public static int somme(int n){
        int somme = 0;
        while(n>0){
            somme += potenza(n, n);
            n--;
        }
        return somme;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci n compreso tra 1 e 9: ");
        int n = scanner.nextInt();

        if(n<1 || n>9){
            System.out.println("Fuori dal range accettato!");
        }else{
            System.out.println(somme(n));
        }
    }
}
