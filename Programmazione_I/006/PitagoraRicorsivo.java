public class PitagoraRicorsivo {
    public static void Pitagoraricorsivo(int x, int y){
        if(y == 10 && x == 11){
            return;
        }
        if(x == 11){
            System.out.println("\n");
            Pitagoraricorsivo(1, y+1);
        }else{
            System.out.print(x * y + "\t");
            Pitagoraricorsivo(x+1, y);
        }
    }

    public static void main(String[] args) {
        Pitagoraricorsivo(1,1);
    }
}
