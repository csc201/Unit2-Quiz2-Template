package edu.nvcc.csc201.unit1;

import java.util.Scanner;

public class HelloMyName {
	public static void main(String[]args) {
		int age;
		String name;
		Scanner scan;

		scan = new Scanner(System.in);	
		System.out.println("Enter your age and name");
		age = scan.nextInt();
		
		//scan.nextLine();
		//System.out.println("Enter your name");
		name = scan.nextLine();
		System.out.println("Hello " + name + " age is " + age);
		scan.close();
		
		/*System.out.println("Enter your name2");
		String name2 = scan.next();
		System.out.println("Hello " + name2 + " age is " + age);*/
		
	}
}
