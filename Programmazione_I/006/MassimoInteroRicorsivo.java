import java.util.Scanner;

import java.util.*;

public class MassimoInteroRicorsivo{

    public static int MassimoRicorsivo(int x){
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();

        if(num == 0){
            return x;
        }else{
            return MassimoRicorsivo((num > x) ? num: x);
        }
    }
    public static void main(String[] args) {
        System.out.println("Sequenza: ");
        System.out.println("max: " + MassimoRicorsivo(0));
    }

    
}
