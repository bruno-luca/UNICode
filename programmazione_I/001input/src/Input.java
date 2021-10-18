import java.util.*;

public class Input{
	public static void main(String[] args){
		/*
		
		COMRE PRENDERE IN INPUT DEI DATI DAL CMD USANDO SCANNER	
		
		-necessario importare la classe scanner contenuta nell util di java
		-istanziare un oggetto Scanner(System.in) con parametro il terminale di input
		-andare ad effettuare un assegnamento e scruttare uno dei seguenti metodi dell'oggetto Scanner()
		
			> nextBoolean()	Reads a boolean value from the user
			> nextByte()	Reads a byte value from the user
			> nextDouble()	Reads a double value from the user
			> nextFloat()	Reads a float value from the user
			> nextInt()		Reads a int value from the user
			> nextLine()	Reads a String value from the user
			> nextLong()	Reads a long value from the user
			> nextShort()	Reads a short value from the user
		
		*/
		
		String istruzioni = "Metodi contenuti nell'oggetto Scanner:\n\n\t> nextBoolean()	Reads a boolean value from the user\n\t> nextByte()	Reads a byte value from the user\n\t> nextDouble()	Reads a double value from the user\n\t> nextFloat()	Reads a float value from the user\n\t> nextInt()	Reads a int value from the user\n\t> nextLine()	Reads a String value from the user\n\t> nextLong()	Reads a long value from the user\n\t> nextShort()	Reads a short value from the user\n\n";
		System.out.print(istruzioni);
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Inserisci un numero: ");
		int num = scanner.nextInt();
		System.out.println("Numero inserito: " + num);
		
	}
}