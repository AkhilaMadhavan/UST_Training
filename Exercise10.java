/*
Write an algorithm for accepting the age of  user and if the age is valid, check whether the user is a kid,
a teenager, an adult or a senior citizen.
min 1 max-120
kid 1-12
teenager 13-19
adult 20-60
senior citizen 61+
*/

import java.util.Scanner;
class Exercise10{
	public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	int age;
	System.out.println("Enter your age: ");
	age=sc.nextInt();

	if(age<1 || age>120){
		System.out.println("Enter a valid age");
	}
	

	else if(1<=age && age<=12){
		System.out.println("KID");
	}
	else if(13<=age && age<=19){
		System.out.println("Teenager");
	}
	else if(20<=age && age<=60){
		System.out.println("Adult");
	}
	else if(age>60 && age<=120){
		System.out.println("Senior citizen");
	}

	/*else{
		System.out.println("Invalid Age");
}
*/	
}
}