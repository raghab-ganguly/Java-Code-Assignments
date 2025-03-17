/*
10. Write a Java Program to check if a number is Even or Odd.
*/

/*Theroy:
A number that is divisible by 2 and generates a remainder of 0 is called an even number. All the numbers ending with 0, 2, 4, 6, and 8 are even numbers. On the other hand, number that is not divisible by 2 and generates a remainder of 1 is called an odd number. All the numbers ending with 1, 3, 5,7, and 9 are odd numbers. Do refer to the below illustration to get what is supposed to be conveyed out basics here via generic Illustration for any random integer, check whether it is even or odd. 

Input : 13
Output: ODD
Input : 24
Output: EVEN
Methods:

**NOTE: Zero is the smallest even whole number**

There are various ways to check whether the given number is odd or even. Some of them are as follows starting from the brute force approach ending up at the most optimal approach.

Using Brute Force- Naive Approach
Using bitwise operators
Using Bitwise OR
Using Bitwise AND
Using Bitwise XOR
By Checking the Least Significant Bit
*/


//Code: Brute Force 

import java.util.Scanner;
import java.util.InputMismatchException;
public class Ass10 {
	public static void main(String... args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number: ");
		
		try{
			long num = scanner.nextLong();
			if(num % 2 == 0){
				System.out.println(num +" is a Even Number");
			}else {
				System.out.println(num +" is a Odd Number");
			}
		}catch(InputMismatchException ex){
			System.out.println("Heyyy...You did not enter a Integer Number!!");
		}
		scanner.close();
	}
}

/*Output:
D:\Java_Code_Practices\1_Java_Clg_Assignmetns>java Ass10.java
Enter a number: *
Heyyy...You did not enter a Integer Number!!

D:\Java_Code_Practices\1_Java_Clg_Assignmetns>java Ass10.java
Enter a number: 0
0 is a Even Number

D:\Java_Code_Practices\1_Java_Clg_Assignmetns>java Ass10.java
Enter a number: 25
25 is a Odd Number

D:\Java_Code_Practices\1_Java_Clg_Assignmetns>java Ass10.java
Enter a number: 6515654156465416
6515654156465416 is a Even Number
*/