import java.util.Scanner;
class Five{
	public static void main(String []args){
	Scanner sc=new Scanner(System.in);
	int []nums=new int[5];
	System.out.println("enter 5 Number ");
	for (int count=0;count<5;count++){
	nums[count]=sc.nextInt();
}
	System.out.println("Numbers are: ");
	for(var num:nums)
		System.out.print(num+" ");
		
}}
