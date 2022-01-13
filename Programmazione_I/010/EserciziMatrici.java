import javax.print.event.PrintJobListener;
import javax.swing.text.html.HTMLDocument.RunElement;

class EserciziMatrici{

    public static int[] clonaArray(int[] a){
        int[] clone = new int[a.length];

        for(int i = 0; i < a.length; i++){
            clone[i] = a[i];
        }

        return clone;
    }

    public static int[][] initAlt(int[][] matp, int[][] matd, int numr){
        int[][] array = new int[numr][matd[0].length];

        if (matd != null && matp != null){
            for(int r = 0; r < numr; r++){
                array[r] = (r % 2 == 0) ? clonaArray(matp[r]) : clonaArray(matd[r]);
            }
        }

        return array;
    }

    public static void stampaMatrice(int[][] m){
        for(int r = 0; r < m.length; r++){
            for(int c = 0; c < m[0].length; c++){
                System.out.print(m[r][c] + " ");
            }
            System.out.println();
        }
    }

    public static String toString(int[][] m){
        String out = "";

        for(int r = 0; r < m.length; r++){
            for(int c = 0; c < m[0].length; c++){
                out += m[r][c] + " ";
            }out += "\n";
        }

        return out;
    }

    public static void stampaVettore(int[] v){
        for(int i = 0; i < v.length; i++){
            System.out.print(v[i] + " ");
        }
        System.out.println();
    }

    public static int contaElementi(int[][] m){
        int k = 0;

        for(int i = 0; i < m.length; i++){
            k += m[i].length;
        }

        return k;
    }

    public static int[] linearizzaRighe(int[][] m){
        int l = contaElementi(m);

        int[] linear = new int[l];
        int i = 0;

        for(int r = 0; r < m.length; r++){
            for(int c = 0; c < m[r].length; c++){
                linear[i] = m[r][c];
                i++;
            }
        }

        return linear;
    }

    public static int maxRowLen(int[][] m){
        int max = 0;

        for(int r = 0; r < m.length; r++){
            max = (m[r].length > max) ? m[r].length : max;
        }

        return max;
    }

    public static int[] sommaRighe(int[][] m){
        int[] a = new int[m.length];

        for(int r = 0; r < m.length; r++){
            a[r] = 0;
            for(int c = 0; c < m[r].length; c++){
                a[r] += m[r][c];
            }
        }

        return a;
    }

    public static boolean domMat(int[][] m){
        boolean flag = true;

        for(int r = 0; r < m.length && flag; r++){
            if(!domRiga(m[r])) flag = false;
        }

        return flag;
    }

    public static boolean domRiga(int[] a){
        boolean found = false;
        boolean flag = true;

        for(int i = 0; i < a.length && !found; i++){
            for(int k = 0; k < a.length && flag; k++){
                flag = (i != k && (a[k] % a[i]) != 0) ? false: true;
            }
            found = (flag) ? true : false;
        }

        return flag;
    }



    public static void main(String[] args) {

        //esercizio 1.1

        int[][] pari = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] dispari = {{9,8,7},{6,5,4},{3,2,1}};

        stampaMatrice(initAlt(pari, dispari, 2));

        //eserzio 1.2

        int[][] m = {
            {1,2,3,4},
            {},
            {5,6}
        };

        System.out.println(contaElementi(m));

        //esercizio 1.3

        stampaVettore(linearizzaRighe(m));

        //esercizio 1.4

        System.out.println(toString(initAlt(pari, dispari, 2)));

        //esercizio 2.1

        int[][] m1 = {
            {1,2,3,4},
            {},
            {9,8,7,6,5,4,3,2,1},
            {5,6}
        };

        System.out.println(maxRowLen(m1));

        //esercizio 2.2

        stampaVettore(sommaRighe(m1));
        
        //esercizio 3

        //esercizio 4
        int[][] m5 = { {1, 5, 10, 7}, {3, 12, 21, 30}, {5, 10, 20, 30} }; // true
        int[][] m6 = { {4, 7, 2, 5}, {7, 9, 20, 12}, {5, 8, 11, 21} }; // false

        System.out.println(domMat(m5));
        System.out.println(domMat(m6));

    }
}