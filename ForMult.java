/*
Multiplication using For lopps
*/

import java.util.Scanner;
class ForMult{
 public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number");
	int num=sc.nextInt();
	int pdt=1;
	for(int count=1;count<11;count++){
	pdt=count*num;
	System.out.println(num+" x "+count+" = "+pdt);}
}}