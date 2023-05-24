/*


5
5 4
5 4 3
5 4 3 2
5 4 3 2 1


*/






import java.util.*;
class Decrement{
	public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the no of rows");
	int n= sc.nextInt();
	//int n=5;
	for(int row=1;row<=n;row++){
		for(int col=1;col<=row;col++){
		System.out.print(n-(col-1)+" ");
		}
		System.out.println();
		}
	}
}