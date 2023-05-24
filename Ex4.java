
class Exercise5{
public static void main(String []args){
	int n1,n2;
	n1=100;
	n2=10;
	if(n1==n2){
		System.out.println("BOTH ARE EQUAL");
	}
	else if(n1>n2){
		System.out.println("Largest number is: "+n1);
	}
	else{
		System.out.println("Largest number is: "+n2);
	}
}}
	



import java.util.Scanner;
class Ex4{
	public static void  main(String []args){
	Scanner scan=new Scanner(System.in);
	int n1,n2;
	System.out.println("Enter 2 numbers: ");
	n1=scan.nextInt();
	n2=scan.nextInt();
	
	int sum=n1+n2+n3+n4+n5;
	float avg=sum/5;
	System.out.println("Sum of 5 numbers is: "+sum);
	System.out.println("Average of 5 numbers is: "+avg);
	}
}