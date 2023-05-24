/*
pyramid

*
##
***
####
*****

*/

import java.util.Scanner;
class Pyramid{
	public static void main(String[]args){
	System.out.println("Enter a number");
	Scanner sc=new Scanner(System.in);
	int lines=sc.nextInt();
	for(int row=1;row<=lines;row++){
		for(int col=1;col<=row;col++){
 		char ch=row%2==0 ? '#':'*';
		System.out.print(ch+"  ");	
	}}
System.out.println("");
}}