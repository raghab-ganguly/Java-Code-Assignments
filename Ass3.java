/*
3. Write a program to convert the given temperature in Fahrenheit to Celsius using the 
following conversion formula:
 C = (F-32)/1.8
*/

//code: 

import java.util.Scanner;

public class Ass2 {
	public static void main(String... args) {
		Scanner scanner = new Scanner(System.in);
		float temp;
		
		System.out.print("Enter the temperature in Fahrenheit: ");
		temp = scanner.nextFloat();
		
		temp = (temp - 32) * 5/9;
		
		System.out.println("The Temperature in Celsius: "+ Math.round(temp));
		
		scanner.close();
	}
}

/*output:
D:\Java_Code_Practices\1_Java_Clg_Assignmetns>java Ass3.java
Enter the temperature in Fahrenheit: 102
The Temperature in Celsius: 39
*/