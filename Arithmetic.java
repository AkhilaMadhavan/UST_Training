
import java.util.Scanner;
class Arithmetic{
	public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the two numbers");
	int num1=sc.nextInt();
	int num2=sc.nextInt();
	System.out.println(" 1-Add \n 2-Substraction \n 3-Multiply \n 4-Division");
	System.out.println("Enter the Arithmetic operation from the list");
	int choice=sc.nextInt();
	switch(choice)
	{
		case 1:
		System.out.println(num1+num2);break;

		case 2:
		System.out.println(num1-num2);break;

		case 3:
		System.out.println(num1*num2);break;

		case 4:
		System.out.println(num1/num2);break;

		default:
		System.out.println("Invalid choice");
		}
}}