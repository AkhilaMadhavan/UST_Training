/*
Write an algorithm for accepting five numbers and display 
the sum and average of the numbers.
*/



import java.util.Scanner;
import java.util.*;
class Exercise3{
	public static void  main(String []args){
	Scanner scan=new Scanner(System.in);
	int n1,n2,n3,n4,n5;
	System.out.println("Enter 5 numbers: ");
	n1=scan.nextInt();
	n2=scan.nextInt();
	n3=scan.nextInt();
	n4=scan.nextInt();
	n5=scan.nextInt();
	int sum=n1+n2+n3+n4+n5;
	float avg=sum/5;
	System.out.println("Sum of 5 numbers is: "+sum);
	System.out.println("Average of 5 numbers is: "+avg);
	}
}