/*
6. Write a Java Program to take two inputs (name and college name) through command line 
argument and print as follows:
<name> is a B.Tech student of <college name> college.
E.g.: 
Input: 
Ram AOT
Output: 
Ram is a B.Tech student of AOT college
*/

//Code:
public class Ass6 {
	public static void main(String... args) {
		System.out.println(args[0]+" is a B.Tech student of "+args[1]+" college.");
	}
}
/*Output:
D:\Java_Code_Practices\1_Java_Clg_Assignmetns>java Ass6.java Raghab AOT
Raghab is a B.Tech student of AOT college.
*/
