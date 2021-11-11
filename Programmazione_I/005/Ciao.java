import java.util.*;

import javax.print.event.PrintEvent;

class Ciao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean flag = true;
        String input = "";

        for(int i = 0; i < 5; i++){
            System.out.print("Parola: ");
            input = scanner.nextLine();

            if(!input.equals("ciao")) flag = false;
        }

        System.out.println(flag);
        


        

        scanner.close();
    }    
}
