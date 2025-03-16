/*
4. Write a program to determine sum of the following series for given value of n:
 1 - 1/2^2 + 1/3^2 - ..... + 1/n^2
*/

//code:

import java.util.Scanner;

public class Ass4 {
	public static void main(String... args) {
		Scanner scanner = new Scanner(System.in);
		int n;
		float sum = 0.0f;
		
		System.out.print("Enter the value of n: ");
		n = scanner.nextInt();
		
		for(int i = 1; i <= n ; i++) {
			if(i % 2 != 0) {
				sum += ( 1.0f / (i * i));
			}else {
				sum -= (1.0f / (i * i));
			}
		}
		System.out.println("The Sum of this expression: "+sum);
		
		scanner.close();
	} 
}

/*output:
D:\Java_Code_Practices\1_Java_Clg_Assignmetns>java Ass4.java
Enter the value of n: 4
The Sum of this expression: 0.7986111
*/
