import java.util.*;

public class ControllaStringa {

    public static boolean tutteCifre(String s, int i){

        if(s.charAt(i) == '9' || s.charAt(i) == '8' || s.charAt(i) == '7' || s.charAt(i) == '6' || s.charAt(i) == '5' || s.charAt(i) == '4' || s.charAt(i) == '3' || s.charAt(i) == '2'|| s.charAt(i) == '1'|| s.charAt(i) == '0'){
            if(i == s.length()-1){
                return true;
            }else{
                return tutteCifre(s, i+1);
            }
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        System.out.println(tutteCifre("75718438817436832", 0));
    }
}
