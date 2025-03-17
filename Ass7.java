/*
7. Write a program to find the reverse of a given integer number (1st day using static i/p and 2nd
day using command-line argument).
*/

//Code:

import java.util.Scanner;
public class Ass7 {
	public static void main(String... args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = scanner.nextInt();
		
		int reversed = 0;
		int temp = Math.abs(number);
		
		while(temp > 0) {
			int digit = temp % 10;
			reversed = reversed * 10 + digit;
			
			temp /= 10; 
		}
		 
		if(number < 0) {
			reversed = -reversed;
		}
		System.out.println("Reversed of this number is: "+reversed);
		scanner.close(); 
	}
}

/*Output:
D:\Java_Code_Practices\1_Java_Clg_Assignmetns>java Ass7.java
Enter a number: -123456789
Reversed of this number is: -987654321
*/