/**
 * @author Santiago Garcia
 * @version 1.0
 * @see Lobster
 * @since Java 17.0.6
 * This class uses class Lobster to provide a report to indicate if a Lobster is a legal size or a prohibited size,
 * based on its carapace length.
 */

import java.util.Scanner;


public class LobsterSizeChecker {

	/**
	 * The main method asks for a length, uses an instance of class Lobster to generate a report, and writes
	 * the report to the console.
	 */
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		Lobster myLobster = new Lobster();
		double length;
		String report;
		
		System.out.printf("%s", "Lobster’s Carapace Length: ");
		length = keyboard.nextDouble();
		myLobster.setLength(length);
		
		report = myLobster.sizeReport();
		
		System.out.printf("%s%n", report);
		System.out.printf("%s%n", "Program created by Santiago Garcia");
	}
}
