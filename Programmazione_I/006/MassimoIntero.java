import java.util.*;

public class MassimoIntero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = 0;
        int y = 0;
        System.out.println("Inserisci una sequenza di numero strettamente > 0 (0 per terminare, i numeri negativi non verranno presi in considerazione):");
        
        do{
            y = scanner.nextInt();
            x = (y > x) ? y: x;
        }while(y != 0);

        System.out.println("max: " + x);
    }
}
