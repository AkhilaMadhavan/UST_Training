import java.util.Scanner;
class Sorting{

	public static void main(String []args){
/*
user inputs size and values

	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the size: ");
	int size=sc.nextInt();
	int []arr=new int[size];
	System.out.println("Enter the array Numbers ");
	for (int id=0;id<arr.length;id++){
	arr[id]=sc.nextInt();
}	
*/
	int []arr= {8,3,4,5,1};
//if array is already given//

	for(int i=0;i<arr.length-1;i++){
		for( int j=i+1;j<arr.length;j++){
			if(arr[i]>arr[j]){
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
}}}
	
	System.out.println("Sorted Array");
	for(int arr2:arr){
	System.out.println(arr2);
	}
}}