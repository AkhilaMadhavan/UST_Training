import java.util.Scanner;
class Str{
		
	public static void main(String []args){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter two strings");
	String str1=sc.nextLine();
	String str2=sc.nextLine();
        int diff=str1.compareTo(str2);
	System.out.println("Difference is: "+diff);
	
        int length=str1.length();
	System.out.println("Length is: "+length);
	
	
        int chara=str1.charAt(3);
	System.out.println("Character is at position : "+chara);

	
        int ind=str1.indexOf("a");
	System.out.println("a is at : "+ind);
	
	boolean cont=str1.contains("how");
		if(cont){
		System.out.println("Found");}
		else{
		System.out.println("Not Found");}

	int val=str1.indexOf("akhila");
	System.out.println("akhila is at : "+val);
	
}}