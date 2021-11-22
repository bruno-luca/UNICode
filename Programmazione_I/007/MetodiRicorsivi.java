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

import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

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

    public static boolean trovaCarattere(String s, char c, int i){
        if(s.length() == i){
            return false;
        }else{
            if(s.charAt(i) == c){
                return true;
            }else{
                return trovaCarattere(s, c, i + 1);
            }
        }
    }

    public static int contaCaratteri(String s, char c, int i){
        if(i == s.length()){
            return 0;
        }else{
            if(s.charAt(i) == c){
                return 1 + contaCaratteri(s, c, i + 1);
            }else{
                return contaCaratteri(s, c, i + 1);
            }
        }
    }

    public static boolean palindroma(String s, int i){
        if(i >= s.length()/2){
            return true;
        }else{
            if(s.charAt(i) != s.charAt(s.length()-1-i)){
                return false;
            }else{
                return palindroma(s, i + 1);
            }
        }
    }

    public static boolean in(char c, char[] chars){
        for (char i : chars) {
            if(i == c) return true;
        }
        return false;
    }

    public static char[] vocali = {'a', 'e', 'i', 'o', 'u'};
    public static char[] consonanti = {'q', 'w', 'r', 't', 'y', 'p', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'z', 'x', 'c', 'v', 'b', 'n', 'm'};
    
    public static String convertiStringhe(String s, int i){
        if(i == s.length()){
            return s;
        }else{
            if(in(s.charAt(i), vocali)){
                s = s.substring(0, i) + '*' + s.substring(i + 1);
            }else{
                if(in(s.charAt(i), consonanti)){
                    s = s.substring(0, i) + '$' + s.substring(i + 1);
                }else{
                    s = s.substring(0, i) + '-' + s.substring(i + 1);
                }
            }
            return convertiStringhe(s, i + 1);
        }
    }

    public static String stringaInversa(String s, int len){
        if(s.length() == len*2 ) return s.substring(len, s.length());
        else return stringaInversa(s + s.charAt(len - 1 - (s.length()-len)), len);
    }

    public static void main(String[] args){
        //System.out.println(Sommatoria());

        System.out.println(trovaCarattere("Ciao mi chiamo luca", 'p', 0));
        System.out.println(contaCaratteri("Banana", 'o', 0));
        System.out.println(palindroma("onorarono", 0));
        System.out.println(convertiStringhe("stringa di prova", 0));
        String s = "Ciao mi chiamo luca";
        System.out.println(stringaInversa(s, s.length()));
        
    } 
}