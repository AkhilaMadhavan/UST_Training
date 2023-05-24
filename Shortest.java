/*
Write a Java program to get the strings as input from the user and push them to an array. 
Find the shortest word in the list of strings and display the same on the screen.

Sample Input
words[] = {"Atrocity", "Pensive", "Imperceptible", "Discordant" }

Sample Output
Shortest word is Pensive
-------------------------------------------------------------------------
*/


import java.util.Scanner;
class Shortest{
	public static void main(String []args){
	String[]array=new String[10];
	Scanner sc=new Scanner(System.in);
	int i;
	System.out.println("Enter the array size ");
	int size=sc.nextInt();
	System.out.println("enter the words");
	for(i=0;i<=size;i++)
	{
	   array[i]=sc.nextLine();
	}
	String first=array[0];
	for(i=0;i<=size;i++)
	{
	if((array[i].compareTo(first))>0)
	{
	    first=array[i];
	}
	}
	System.out.println("Shortest word is: ");
	System.out.print(first);


}
}