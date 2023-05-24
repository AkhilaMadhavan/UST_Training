/*
Problem Find whether two phrases are anagrams of each other.
One phrase is said to be anagram of the other if one phrase has same characters as the other
----------------------------------------------------------------------------------------
import java.util.Scanner;
import java.util.*;
class Anagram{
    public String checkAnagrams(String s1,String s2){
        char [] array1=s1.toCharArray();
        char [] array2=s2.toCharArray();
        Arrays.sort(array1);
        Arrays.sort(array2);
        String str1=new String(array1);
        String str2=new String(array2);
        String output="";
        boolean result=false;
        if(str1.length()==str2.length()){
            result= str1.equals(str2);
        }
        if(str1.isEmpty() && str2.isEmpty())
        {
            output="Give proper input not empty phrases";
        }
        else if(result)
        {
            output="Given phrases are anagrams";
        }
        else{
            output="Given phrases are not anagrams";
       }    

        return output;

 

    }

 

}

class AnagramMain{

    public static void main(String []args){

        Scanner scan=new Scanner(System.in);

        System.out.println("Enter first string:");

        String s1=scan.nextLine();

        System.out.println("Enter second string:");

        String s2=scan.nextLine();

        Anagram obj=new Anagram();

        String result=obj.checkAnagrams(s1,s2);

        System.out.println(result);





    }

}
*/





import java.util.Scanner;
import java.util.*;
class Anagram{
	public String checkAnagram(String s1,String s2){
	char[] array1=s1.toCharArray();
	char[] array2=s2.toCharArray();
	Arrays.sort(array1);
	Arrays.sort(array1);
	String str1=new String(array1);
	String str2=new String(array2);
	String output="";
	boolean result=false;
	if(str1.length()==str2.length()){
		result=str1.equals(str2);
	}
	if

}}