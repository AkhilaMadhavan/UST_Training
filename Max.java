import java.util.Scanner;
class Max{

	public static void main(String []args){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the size: ");
	int size=sc.nextInt();
	int []num=new int[size];
	System.out.println("Enter Numbers ");
	for (int count=0;count<num.length;count++){
	num[count]=sc.nextInt();
}	
	int max=num[0];
	int max2=num[0];
	for(int nums:num){
	if(nums>max){
		max=nums;
		}
}
	for(int num1:num){
	if( max>num1 && max2<num1){
		max2=num1;
}}

	System.out.println("Second Max number is: "+max2);
	}
}

