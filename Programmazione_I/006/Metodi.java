public class Metodi {

    public static boolean palindroma(String x){
        boolean palindroma = false;

        String reverse_x = "";

        //giro la parola
        for(int i = x.length() -1; i >= 0; i--){
            reverse_x = reverse_x + x.charAt(i);
        }

        if(x.equals(reverse_x)){
            palindroma = true;
        }

        System.out.println(palindroma);

        return palindroma;
    }

    public static boolean elementiComuni(String a, String b){
        boolean elementiComuni = true;

        if(a.length() < b.length()){
            //ciclo sugli elementi di a
            for(int i = 0; i < a.length(); i++){
                if(b.indexOf(a.charAt(i)) > -1){
                    elementiComuni = false;
                    i = a.length();
                }
            }
        }else{
            //ciclo sugli elementi di b
            for(int i = 0; i < b.length(); i++){
                if(a.indexOf(b.charAt(i)) > -1){
                    elementiComuni = false;
                    i = b.length();
                }
            }
        }
        
        System.out.println(elementiComuni);

        return elementiComuni;
    }
    public static void main(String[] args) {
        palindroma("anna");

        elementiComuni("casa", "ballo");
    }
}
