import java.util.Scanner;

public class StringaMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lunghezza_max = 0;

        String stringa, strMax = "";

        System.out.println("Inserisci una sequenza di stringhe (stringa vuota per terminare): ");
        

        do{
            stringa = scanner.nextLine();
            
            if(stringa.length() > lunghezza_max){
                lunghezza_max = stringa.length();
                strMax = stringa;
            }
        }while(stringa.length() > 0);

        System.out.println("La stringa di lunghezza massima e': \n\t'" + strMax + "'\n e contiene " + lunghezza_max + " caratteri");
    }
}
