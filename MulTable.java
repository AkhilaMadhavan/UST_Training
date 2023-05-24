/* 
Multiplication table of 5
*/

import java.util.Scanner;
class MulTable{
	public static void  main(String []args){
		Scanner sc=new Scanner(System.in);
		int count=1;
		int product;
		System.out.println("Enter a number");
		int num=sc.nextInt();
		while(count<=10){
		    product=count*num;
		    System.out.println(num+"X"+count+"="+product);
			count++;}
	}
	

}