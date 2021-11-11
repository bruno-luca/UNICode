import java.util.*;

public class Asterischi {
    public static void rettangoloAsterischi(int b, int a){
        String riga = "";
        for(int i = 0; i < b; i++){
            riga += '*';
        }

        for(int i = 0; i < a; i++){
            System.out.println(riga);
        }

        return;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Base: ");
        int b = scanner.nextInt();
        System.out.print("Altezza: ");
        int a = scanner.nextInt();

        rettangoloAsterischi(b, a); 

        scanner.close();
    }
}
