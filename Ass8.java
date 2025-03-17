/*
8. Write a program to check whether a given integer number is palindrome or not (1st day 
using static i/p and 2nd day using command-line argument).
*/

/*Theory and Example:
=> A given number can be said palindromic in nature if the reverse of the given number is the same as that of a given number. 

=> Input : n = 46355364
Output: Reverse of n = 46355364
Palindrome : Yes

Input : n = 1234561111111111654321
Output: Reverse of n = 1234561111111111654321
Palindrome : Yes
*/

//Code:
//using Command line input...

//First we need to write the logic to reverse a number 
public class Ass8 {
	public static void main(String... args) {
		int reversed = 0;
		int number = Integer.parseInt(args[0]);
		int temp = Math.abs(number);
		
		while( temp > 0 ) {
			int digit = temp % 10;
			reversed = reversed * 10 + digit;
			 
			temp /= 10;
		}
		
		if( reversed == number) {
			System.out.println(args[0]+" is a Palindrome");
		}else{
			System.out.println(args[0]+" is not a Palindrome");
		}
	}
}

/*Output:
D:\Java_Code_Practices\1_Java_Clg_Assignmetns>java Ass8.java 155525551
155525551 is a Palindrome

D:\Java_Code_Practices\1_Java_Clg_Assignmetns>java Ass8.java 1550155
1550155 is not a Palindrome
*/