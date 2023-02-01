/**
 * 
 */
package VowelCounter;

/**
 * @author CamilleDayao
 *@Description : program that counts the number of occurrences of lowercase and uppercase vowels in entered lines of text
 **@DateCreated : 25/05/2022
 */
public class VowelCounter {													//to set the variable
	private String inputSentence;			
	private int[][] arrVowel = new int[5][3];
	private char [] arrVowelLetters = {'A', 'E', 'I', 'O', 'U'};			//char of array with UpperCase Letter
	
	
	public VowelCounter() {									//0 parameter constructor
	}
	
	public void processLine(String inputSentence) {			//process line method to test the input sentence
		this.inputSentence = inputSentence;
		char[] inputToChar = inputSentence.toCharArray();	//conversion of String input to Char of array
		
		for(int i=0; i< inputToChar.length ; i++) {				
			for(int j = 0; j<arrVowelLetters.length ; j++) {
			if(inputToChar[i] == arrVowelLetters[j]) {			//compare the input to char of array with UpperCase Letter
				arrVowel[j][1]++;								//increment on UpperCase letters 
				}
			else if(inputToChar[i] == Character.toLowerCase(arrVowelLetters[j])) {		//compare the input to LowerCase letters on array of char
				arrVowel[j][0]++;								//increment on LowerCase letters
			}
		}
	}		
}

		
	public void printSummary() {				//print Summary method
		
		 for (int x = 0; x < arrVowel.length; x++) { // loop that counts the array vowels length.
			 System.out.print(arrVowelLetters[x] + ": ");
		     System.out.println(arrVowel[x][0] + " lowercase, " + arrVowel[x][1] + " uppercase, "
		                    + arrVowel[x][2] + " total.");
			}
		}
}
		