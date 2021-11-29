import java.util.*;
import java.util.List;

import javax.lang.model.util.ElementScanner14;

import java.util.ArrayList;

public class MetodiSuArray {
    /** 
     * @param l:    lenght of the array
     * @return a l-lenght array containing all integer read from the input
     */
    public static int[] initArrayInt(int l){

        int[] a = new int[l];
        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i < l; i++){
            a[i] = scanner.nextInt();
        }

        return a;
    }

    /**
     * 
     * @param a:    array to print on the terminal
     *
     */
    public static void stampaArray(int[] a){
        for(int i = 0; i < a.length; i++){
            System.out.print(a[i]);
        }

        System.out.println();
    }

    public static void stampaArray(boolean[] a){
        for(int i = 0; i < a.length; i++){
            System.out.print(" " + a[i]);
        }

        System.out.println();
    }

    /**
     * 
     * @param from   array we take element 
     * @param to     array where we come elements
     */
    public static void copiaElementi(int[] from, int[] to){
        for(int i = 0; i < from.length; i++){
            to[i] = from[i];
        }
    }

    /**
     * 
     * @param a     array from wich elements are copied
     * @return      a copy of the array 'a'
     */
    public static int[] clonaArray(int[] a){
        if(a == null) 
            return null;
        else{
            int[] b = new int[a.length];
            copiaElementi(a, b);
            return b;
        }
    }

    /**
     * 
     * @param a     input array
     * @param limiteSuperiore   treeshold
     * @return  a new array where elements of array 'a' are < treeshold
     */
    public static int[] filtroMinoriDi(int[] a, int limiteSuperiore){
        int dim = 0;

        for(int i = 0; i < a.length; i++){
            if(a[i] < limiteSuperiore)  dim++;
        }

        int[] b = new int[dim];
        dim = 0;

        for(int i = 0; i < a.length; i++){
            if(a[i] < limiteSuperiore){
                b[dim] = a[i];
                dim++; 
            }
        }

        return b;
    }

    /**
     * 
     * @param a input array
     * @param min   min value of the interval
     * @param max   max value of the interval
     * @return  all values of a that are odd and in the range (min, max)
     */
    public static int[] filtroIntervalloDisp(int[] a, int min, int max){
        List<Integer> b = new ArrayList<Integer>();

        for(int i = 0; i < a.length; i++){
            if((a[i] % 2 != 0) && (a[i] >= min) && (a[i] <= max))
                b.add(a[i]);
        }

        int[] c = new int[b.size()];

        for(int i = 0; i < b.size(); i++)
            c[i] = b.get(i);
        

        return c;
    }

    /**
     * 
     * @param a     input array
     * @param limiteSuperiore   treeshold
     * @return  a boolean array that conatins true if a[i] <= tresshold
     */
    public static boolean[] trasduttore(int[] a, int limiteSuperiore){
        boolean[] t = new boolean[a.length];

        for(int i = 0; i < a.length; i++){
            t[i] = (a[i] <= limiteSuperiore) ? true: false;
        }

        return t;
    }

    /**
     * 
     * @param a firs input array
     * @param b second input array
     * @return  true if all elements of a are equals to elements of b
     */
    public static boolean eqArray(int[] a, int[] b){
        for(int i = 0; i < a.length; i++){
            if(a[i] != b[i])
                return false;
        }

        return true;
    }

    public static boolean eqArrayRicorsive(int[] a, int[] b){
        if(a.length == 0)
            return true;
        else{
            if(a[0] == b[0]){
                int[] a1 = new int[a.length -1];
                int[] b1 = new int[b.length -1];

                for(int i = 1; i < a.length; i++){
                    a1[i-1] = a[i];
                    b1[i-1] = b[i];
                }
                return eqArrayRicorsive(a1, b1);
            }else
                return false;
        }
    }

    /**
     * 
     * @param a input array
     * @param treeshold treeshold
     * @return  true if all elements of a are even and > treeshold
     */
    public static boolean tuttiPariMaggioriDi(int[] a, int treeshold){
        for(int i = 0; i < a.length; i++)
            if((a[i] % 2 == 1) || (a[i] <= treeshold))
                return false;

        return true;
    }

    public static boolean tuttiPariMaggioriDiRecursive(int[] a, int treeshold){
        if(a.length == 0)
            return true;
        else{
            if((a[0] % 2 == 1) || (a[0] <= treeshold))
                return false;
            else{
                int[] a1 = new int[a.length -1];

                for(int i = 1; i < a.length; i++)
                    a1[i-1] = a[i];

                return tuttiPariMaggioriDiRecursive(a1, treeshold);
            }
        }
    }
    
    /**
     * 
     * @param a input array where searching the subsequrnce 'b'
     * @param b subsequence
     * @return the index where the subsequence start
     */
    public static int indiceSubSeq(int[] a, int[] b, int i){
        if(a.length-i+1 < b.length)
            return -1;
        else{
            boolean flag = true;
            for(int k = 0; k < b.length && flag; k++){
                if(a[i+k] != b[k])
                    flag = false;
            }

            if(flag)
                return i;
            else
                return indiceSubSeq(a, b, i+1);
        }
    }
    public static void main(String[] args) {
        int[] a = initArrayInt(5);
        //stampaArrayInt(a);

        int[]b = clonaArray(a);
        stampaArray(b);

        int[] c = filtroMinoriDi(a, 3);
        stampaArray(c); 

        c = filtroIntervalloDisp(a, 1, 4);
        stampaArray(c);

        boolean[] t = trasduttore(a, 3);
        stampaArray(t);

        System.out.println(eqArray(a, a));
        System.out.println(eqArrayRicorsive(a, a));

        System.out.println(tuttiPariMaggioriDi(a, 0));
        System.out.println(tuttiPariMaggioriDiRecursive(a, 0));

        int[] d = {3,1};
        System.out.println(indiceSubSeq(a, d, 0));
    }
}
