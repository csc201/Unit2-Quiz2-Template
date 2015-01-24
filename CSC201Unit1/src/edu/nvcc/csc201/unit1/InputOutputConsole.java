/**
 * Purpose: Demonstrate how to read input from keyboard 
 * and write output to the console using Java.
 *   
 * Date: 1/17/2015
 * @author Tanes Kanchanawanchai
 */
package edu.nvcc.csc201.unit1;
import java.util.Scanner;

public class InputOutputConsole {

	public static void main(String[] args) {
		int x;
		//instantiation
		Scanner scanner = new Scanner(System.in);
		x = scanner.nextInt();
		System.out.println("You have just entered " + '\"' + x + '\"');
		scanner.close();
	}

}
