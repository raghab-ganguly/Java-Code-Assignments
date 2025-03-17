/*
9. Write a Java Program to demonstrate arithmetic operations between two numbers using 
command line arguments.
*/

//Code:

public class Ass9 {
	public static void main(String... args) {
		long num1 = Long.parseLong(args[0]);
		Double num2 = Double.parseDouble(args[1]);
		Double add = num1 + num2;
		Double sub = num1 - num2;
		Double mul = num1 * num2;
		Double div = num1 / num2;
		System.out.println("Addition: "+add);
		System.out.println("Subtract: "+sub);
		System.out.println("Division: "+div);
		System.out.println("Multiplication: "+mul);
	}
}

/*Output:
D:\Java_Code_Practices\1_Java_Clg_Assignmetns>java Ass9.java 20 2.0
Addition: 22.0
Subtract: 18.0
Division: 10.0
Multiplication: 40.0
*/