/*Write an algorithm for accepting three numbers 
and display the highest number among the three numbers.
*/

import java.util.Scanner;
class Ex9{
	public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	int n1,n2,n3;
	int largest;
	System.out.println("Enter any three numbers: ");
	n1=sc.nextInt();
	n2=sc.nextInt();
	n3=sc.nextInt();

	if(n1>n2){
		largest=n1;
	}
	else{
		largest=n2;
	}
	if(n3>largest){
		largest=n3;
	}
	System.out.println("largest is: "+largest);
	

		
}
}