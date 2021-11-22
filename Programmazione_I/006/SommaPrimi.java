public class SommaPrimi {

    public static int sommaPrimi(int x,int current){
        if(x == 0){
            return 0;
        }else{
            boolean found = false;

            while(!found){
                current++;

                if(ePrimo(current)){
                    found = true;
                }
            }

            return current + sommaPrimi(x-1, current);
        }
    }

    public static boolean ePrimo(int x){
        for(int i = 2; i <= Math.sqrt(x); i++){
            if(x % i == 0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(sommaPrimi(5,1));
    }
}
