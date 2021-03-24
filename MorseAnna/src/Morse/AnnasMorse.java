package Morse;

import java.util.Scanner;

public class AnnasMorse {
	public static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		int option = 0;

		do
		{
			System.out.println("V�lj 1 f�r svenska till morse och 2 f�r morse till svenska. 3 om du vill avsluta."); // Printar ut vilka val som finns
			System.out.println("");
			

			while(!sc.hasNextInt()) { // S� l�nge anv�ndaren matar in en siffra forts�tt visa valen som finns.
				sc.next();   
			}

			option = sc.nextInt();

			switch(option)
			{
			case 1:{
				Scanner scanner = new Scanner(System.in);  
				System.out.println("Skriv en mening p� svenska:");
				String answer = scanner.nextLine(); //L�s inmatade tecken och spara i answer
				answer = answer.toLowerCase();  //Felhantering 1 - G�r om ev versaler till gemener pga morse
				System.out.println(morseAnna.toMorse(answer)); // Skriv ut svaret
				break;
			}

			case 2:{
				Scanner scanner = new Scanner(System.in);  
				System.out.println("Skriv en mening p� morse:");
				String answer = scanner.nextLine(); // L�s in inmatade tecken och spara i answer

				try  //Felhantering 2 - Felmeddelande om anv�ndaren f�rs�ker skriva n�t annat �n morsekod.
				{
					System.out.println(morseAnna.toSwedish(answer)); // Skriv ut svaret
				} 
				catch
				(Exception e) {
					System.err.println("Bara morse tack!"); // Om anv�ndaren skriver annat �n morsetecken eller mellanslag
					System.out.println("");
				}
				break;
			}

			case 3:
			{
				System.out.println("Tack f�r att du anv�nde denna magiska tj�nst."); // Hej d� om anv�ndaren skriver in 3
				break;
			}

			default:
			{
			
				System.out.println("");
				System.err.println("Du m�ste v�lja 1 eller 2. Vill du avsluta v�lj 3."); //Felhantering 3 - Felmeddelande om anv�ndaren skriver annan siffra �n 1 eller 2.
				break;
			}
			}
		}
		while(option != 3); // Forts�tt visa valen s� l�nge anv�ndaren inte matar in 3 dvs vill avsluta.
	}
}
