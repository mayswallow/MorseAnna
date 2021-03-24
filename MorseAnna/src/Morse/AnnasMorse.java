package Morse;

import java.util.Scanner;

public class AnnasMorse {
	public static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		int option = 0;

		do
		{
			System.out.println("Välj 1 för svenska till morse och 2 för morse till svenska. 3 om du vill avsluta."); // Printar ut vilka val som finns
			System.out.println("");
			

			while(!sc.hasNextInt()) { // Så länge användaren matar in en siffra fortsätt visa valen som finns.
				sc.next();   
			}

			option = sc.nextInt();

			switch(option)
			{
			case 1:{
				Scanner scanner = new Scanner(System.in);  
				System.out.println("Skriv en mening på svenska:");
				String answer = scanner.nextLine(); //Läs inmatade tecken och spara i answer
				answer = answer.toLowerCase();  //Felhantering 1 - Gör om ev versaler till gemener pga morse
				System.out.println(morseAnna.toMorse(answer)); // Skriv ut svaret
				break;
			}

			case 2:{
				Scanner scanner = new Scanner(System.in);  
				System.out.println("Skriv en mening på morse:");
				String answer = scanner.nextLine(); // Läs in inmatade tecken och spara i answer

				try  //Felhantering 2 - Felmeddelande om användaren försöker skriva nåt annat än morsekod.
				{
					System.out.println(morseAnna.toSwedish(answer)); // Skriv ut svaret
				} 
				catch
				(Exception e) {
					System.err.println("Bara morse tack!"); // Om användaren skriver annat än morsetecken eller mellanslag
					System.out.println("");
				}
				break;
			}

			case 3:
			{
				System.out.println("Tack för att du använde denna magiska tjänst."); // Hej då om användaren skriver in 3
				break;
			}

			default:
			{
			
				System.out.println("");
				System.err.println("Du måste välja 1 eller 2. Vill du avsluta välj 3."); //Felhantering 3 - Felmeddelande om användaren skriver annan siffra än 1 eller 2.
				break;
			}
			}
		}
		while(option != 3); // Fortsätt visa valen så länge användaren inte matar in 3 dvs vill avsluta.
	}
}
