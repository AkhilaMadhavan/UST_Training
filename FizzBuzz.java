/*
FizzBuzz Problem
--------
Read an input 
if a number is divisible by 3 print Fizz
if a number is divisible by 5 print Buzz
if a number is divisible by both 3 and 5 print FizzBuzz
Otherwise print the number

input :6
output:Fizz
input :15
output:FizzBuzz
input :4
output:4

*/

import java.util.Scanner;

class FizzBuzz{
public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
		
	System.out.println("Enter a Number :");
	int num=sc.nextInt();	
	if(num%3==0 && num%5==0){
		System.out.println("FizzBuzz");
	}
	else if(num%3==0){
		System.out.println("Fizz");
	}
	else if(num%5==0){
		System.out.println("Buzz");
	}
	else{
		System.out.println("Number you entered is : "+num);
	}
	
}}
	










