/**
 * 
 */
package VowelCounter;

import java.util.Scanner;

/**
 * @author CamilleDayao
 *@Description : program that counts the number of occurrences of lowercase and uppercase vowels in entered lines of text
 **@DateCreated : 25/05/2022
 */
public class VowelCounterDriver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		VowelCounter vcounter = new VowelCounter();			
		Scanner scan = new Scanner(System.in);				//scanner to scan the String input
		String inputSentence;
		do {												// loop to continuously prompt the message and call the process line method
			System.out.println("Enter a line of characters (press enter by itself to quit)");
			inputSentence = scan.nextLine();
			
			vcounter.processLine(inputSentence);
		}
		while(!inputSentence.equals(""));
		
		vcounter.printSummary();						//to call print summary method
	}
}

