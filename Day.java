/*
Display message based on the day.
--------------------------------
int day;

day = 1
message = "Monday - its time to start the week"
day = 2
message = "Tuesday - ...."
..
..
day = 6
message = "Saturday - Enjoy your weekend"
day = 7
message = "Sunday - Plan for the upcoming week"
*/

/*

import java.util.Scanner;
class Day{
	public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	int day;
	System.out.println("Enter the Day: ");
	day=sc.nextInt();	
	if(day==1){
	System.out.println("Monday-Its time to start the week");
	}
	else if(day==2){
	System.out.println("Tuesday");
	}
	else if(day==3){
	System.out.println("Wednessday");
	}
	else if(day==4){
	System.out.println("Thursday");
	}
	else if(day==5){
	System.out.println("Friday");
	}
	else if(day==6){
	System.out.println("Saturday-Enjoy your weekend");
	}
	else if(day==7){
	System.out.println("Sunday-Plan for the upcoming week");
	}
	else{
	System.out.println("Wrong option selected");
	}
}
}

----------------------
SAME WITH SWITCH 
--------------------
*/


import java.util.Scanner;
class Day{
	public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	int day=sc.nextInt();
	String message="";


	switch(day){
	case 1 : message = "Monday-Its time to start the week";break;
	case 2 : message = "Tuesday";break;
	case 3 : message = "Wednesday";break;
	case 4 : message = "Thursdayk";break;
	case 5 : message = "Friday";break;
	case 6 : message = "Saturday-Enjoy your weekend";break;
	case 7 : message = "Sunday-Plan for the upcoming week";break;
	default : message = "Wrong option selected";break;
	}
	System.out.println(message);
	}
	
	
}
	































