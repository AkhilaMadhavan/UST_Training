/*
Write an algorithm for accepting a character and 
then display whether it is a vowel or a consonant.


input='x';
if input belongs to  a,e,i,o,u  is a vowel
else consonant

*/



import java.util.Scanner;

class Ex8{
public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a character :");
	char input=sc.next().toLowerCase().charAt(0);
	
	String output=" ";
		if(input =='a' ||input =='e' ||input =='i' ||input =='o' ||input =='u'){
			output="Vowel";
		}
		else{
			output="Consonant";
		}
	System.out.println(output);
}}