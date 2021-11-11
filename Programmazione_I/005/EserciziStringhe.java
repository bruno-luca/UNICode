import java.util.*;

public class EserciziStringhe {
    public static boolean testVocale(char c){
        if(c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U' || c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') return true;
        else return false;
    }

    public static boolean contieneVocali(String s){
        boolean contiene = false;

        for(int i = 0; i < s.length(); i++){
            if(testVocale(s.charAt(i))) return true;
        }

        return false;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char c;
        System.out.println("Carattere: ");
        c = scanner.nextLine().charAt(0);
        System.out.println(testVocale(c));

        String frase = "";
        System.out.println("Frase: ");
        frase = scanner.nextLine();
        System.out.println(contieneVocali(frase));

        

        scanner.close();
    }      
}
