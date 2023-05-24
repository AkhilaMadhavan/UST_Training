
/*
using While loop
Write an algorithm for accepting five numbers and display the sum and average of the numbers.
if any negative number present skip that number
*/

import java.util.Scanner;
class While5Num{
	public static void  main(String []args){
		Scanner sc=new Scanner(System.in);
		int count=0;
		int sum=0;
		int avg=0;
		System.out.println("Enter 5 numbers ");
		while(count<5){
		int num=sc.nextInt();
		    if(num>0){
			sum=sum+num;
			avg=sum/num;
			count++;}
	}
	System.out.println("Sum of 5 numbers is: "+sum);
	System.out.println("Average of 5 numbers is: "+avg);
}
}