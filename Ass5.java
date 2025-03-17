/*
5. Write a program to find the sum of digits of a given integer number (1st day using static i/p 
and 2nd day using command-line argument).
*/

//Code:

import java.util.Scanner;

public class Ass5 {
	public static void main(String... args) {
		Scanner scanner = new Scanner(System.in);
		int number;
		int sum = 0;
		int temp;
		
		System.out.print("Enter a number: ");
		number = scanner.nextInt();
		
		temp = Math.abs(number);
		
		while(temp > 0) {
			sum += temp % 10;
			temp /= 10;
		}
		System.out.println("The sum of Digits of "+number+" is: "+sum);
		scanner.close();
	}
}

/*Output:
D:\Java_Code_Practices\1_Java_Clg_Assignmetns>java Ass5.java
Enter a number: -123
The sum of Digits of -123 is: 6
*/