/*
2. Write a program to read the price of an item in the decimal form (like 75.95) and print the 
output in paise (like 7595 paise).
*/

//Code:

import java.util.Scanner;

public class Ass2 {
	public static void main(String... args) {
		Scanner scanner = new Scanner(System.in);
		double price;
		long paise;
		
		System.out.print("Enter the price of an item in decimal form: ");
		price = scanner.nextDouble();
		
		//Note: from Float or Double to Integral type (int/long etc.) implicitly not possible
		paise = (long) (price * 100);
		
		System.out.println(paise+" paise");
		
		scanner.close();
		
		System.exit(0);
	}
}

/*output:
D:\Java_Code_Practices\1_Java_Clg_Assignmetns>java Ass2.java
Enter the price of an item in decimal form: 22.04
2204 paise
*/