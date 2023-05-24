import java.util.Scanner;
class NameSize{
	public static void main(String []args){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the size: ");
	int size=sc.nextInt();
	String []names=new String[size];
	System.out.println("Enter Names ");
	for (int count=0;count<names.length;count++){
	//names[count]=sc.next();  //this also correct
	names[count]=sc.next()+sc.nextLine();;
}
	System.out.println("Names are: ");
	for(var name:names)
	System.out.print(name+"\t ");
		
}}
