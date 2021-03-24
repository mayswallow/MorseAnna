package Morse;

public class morseAnna {    
	 
	private static final char[] swedish = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l',
			'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x',
			'y', 'z', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0',
			',', '.', '?'};
	private static final String[] morse = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..",
			".---", "-.-", ".-..", "--", "-.", "---", ".---.", "--.-", ".-.",
			"...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", ".----",
			"..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.",
			"-----", "--..--", ".-.-.-", "..--.."};
	
	// Loopar igenom varje inmatat tecken för att hitta motsvarigheten i respektive array. 
	// Varje teckens motsvarighet i arrayerna har samma index. 
	
	public static String toMorse(String translate) {
        String answer = "";
        
        char[] chars = translate.toCharArray(); //Första tecknet
        
        for(int i = 0; i < chars.length; i++)  
        { 
            for(int j = 0; j<swedish.length; j++)   // Kollar tecken för tecken
            {
                if(swedish[j] == chars[i])   // Matchar tecken för tecken
                {
                    answer = answer + morse[j] + " "; // Lägger till tecken + mellanslag
                }  
            }
        }
        return answer;
    }
    
	public static String toSwedish(String translate) {
	        String[] mening = translate.split(" ");  // Delar upp inmatade tecken
	        String answer = "";
	        
		   for (int i = 0; i < mening.length; i++) {  
	        	String s = mening[i]; 
	        	int index = findIndex(s); // Vilket index har tecknet i arrayen
	            char m = swedish[index]; // Hitta motsvarigheten i svenska arrayen
	            answer += m;
	        }
	        return answer;
	    }
	 
	 public static int findIndex(String s) { // Metod för att hitta motsvarigheten på samma index i arrayerna
		    for (int i = 0; i < swedish.length; i++) {
		        if (morse[i].equals(s)) return i;
		    }
		    return -1;
	 }
	 
}