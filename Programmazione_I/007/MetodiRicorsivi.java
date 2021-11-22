/*

In una classe MetodiRicorsivi scrivere una funzione sommatoriaRicorsiva che legge da tastiera una
sequenza di numeri strettamente maggiori di 0, terminata dal numero 0. Usare Sin.readInt() oppure 
nextInt() di Scanner per la lettura. Quando la sequenza viene terminata, il metodo deve ritornare la 
somma di tutti i numeri inseriti. Si chieda all’utente di inserire un numero per ogni chiamata 
ricorsiva del metodo.
In una classe TestRicorsione scrivere il metodo main che richiama sommatoriaRicorsiva e stampa 
a video il risultato.

*/ 

import java.util.*;

public class MetodiRicorsivi{
    public static int Sommatoria(){
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        do{
            System.out.println("inserisci un numero (>= 0): ");
            num = scanner.nextInt();
        }while(num < 0);

        if(num == 0){
            return num;
        }else{
            return num + Sommatoria();
        }
        
    }


    public static void main(String[] args){
        System.out.println(Sommatoria());
    } 
}