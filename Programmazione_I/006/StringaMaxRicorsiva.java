import java.util.*;

public class StringaMaxRicorsiva {
    public static int MassimoRicorsivo(String a){
        Scanner scanner = new Scanner(System.in);

        String stringa = scanner.nextLine();
    

        if(stringa.length() == 0){
            return a.length();
        }else{
            return MassimoRicorsivo((stringa.length() > a.length()) ? stringa: a);
        }
    }
    public static void main(String[] args) {
        System.out.println("Lunghezza massima: " + MassimoRicorsivo(""));
    }
}
