public class Pitagora {
    public static void tavolaPitagorica(){
        int righe = 10;
        int colonne = 10;
        for(int r = 1; r <= righe; r++){
            for(int c = 1; c <= colonne; c++){
                System.out.print(c * r + "\t");
            }

            System.out.print("\n");
        }


    }
    public static void main(String[] args) {
        tavolaPitagorica();
    }
}
