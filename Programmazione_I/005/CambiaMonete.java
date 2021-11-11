import java.util.*;

public class CambiaMonete {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int centesimi;
        System.out.println("Centesimi: ");
        centesimi = scanner.nextInt();

        int cinquanta = 0;
        int venti = 0;
        int dieci = 0;
        int cinque = 0;
        int due = 0;
        int uno = 0;

        int c = centesimi;

        while(c>0){
            if(c>=50){
                cinquanta++;
                c -= 50;   
            }else{
                if(c>=20){
                    venti++;
                    c -= 20;   
                }else{
                    if(c>=10){
                        dieci++;
                        c -= 10;   
                    }else{
                        if(c>=5){
                            cinque++;
                            c -= 5;   
                        }else{
                            if(c>=due){
                                due++;
                                c -= due;   
                            }else{
                                uno++;
                                c--;
                            }
                        }
                    }
                }
            }
        }

        System.out.println("Per cambiare " + centesimi + " servono:\n\n\t" + cinquanta + " moenete da cinquanta\n\t" + venti + " moenete da venti\n\t" + dieci + " moenete da dieci\n\t" + cinque + " moenete da cinque\n\t" + due + " moenete da due\n\t" + uno + " moenete da uno\n\t");

        
        
        

        scanner.close();
    }      
}
