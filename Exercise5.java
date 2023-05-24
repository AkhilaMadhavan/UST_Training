/*
Q) Write an algorithm for accepting two numbers and display the highest number among two.
Algorithm:
---------
step1 -start
step2 -input n1,n2
step3 -if n1>n2 ,then print n1
	else print n2
step4 -end

*/


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
	