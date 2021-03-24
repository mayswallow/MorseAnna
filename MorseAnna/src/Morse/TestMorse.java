package Morse;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestMorse {

	@Test
	void eToDot() {
		//Arrange
		morseAnna morse = new morseAnna();
		
		//Act
		String answer = morseAnna.toMorse("e");
		
		//Assert
		assertEquals(". ", answer);
	}
	
	@Test
	void DotToT() {
		//Arrange
		morseAnna morse = new morseAnna();
		
		//Act
		String answer = morseAnna.toSwedish(".");
		
		//Assert
		assertEquals("e", answer);
	}
	
	@Test
	void sentenceToMorse() {
		//Arrange
		morseAnna morse = new morseAnna();
		
		//Act
		String answer = morseAnna.toMorse("et");
		
		//Assert
		assertEquals(". - ", answer);
	}
	
	@Test
	void HelloWorldToSwedish() {
		//Arrange
		morseAnna morse = new morseAnna();
		
		//Act
		String answer = morseAnna.toSwedish(".... . .-.. .-.. --- .-- --- .-. .-.. -..");
		
		//Assert
		assertEquals("helloworld", answer);
	}
	
}
