import java.util.*;

public class NumeriPrimi {
    public static boolean verificaPrimalita(int x){

        if(x == 0) return false;

        for(int i = 2; i <= x/2; i++){
            if (x % i == 0){
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("n: ");
        int n = scanner.nextInt();

        System.out.println(verificaPrimalita(n));

        scanner.close();
    }
}
