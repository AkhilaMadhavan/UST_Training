*/
Problem Statement: Phone number validator using for loop
**Given a String find whether it is a valid 10 digit phone number **
*/


import java.util.Scanner;
public class PhoneNumberValidator
{
    Scanner sc = new Scanner(System.in);
    public static void main(String args[]){
    PhoneNumberValidator ph = new PhoneNumberValidator();
    ph.displayResult(
    ph.validatephoneNumber(ph.getInput())
    );

    }
    public String getInput(){
    return sc.nextLine();

    }
    public void displayResult(int result){
    switch(result){
        case 1 : System.out.println("valid");break;
        case 0 : System.out.println("Invalid");break;
        default : System.out.println("Empty String");
    }
    }
    public int validatephoneNumber(String input){
    int countDigits = 0;
    if(input.length()==0 || input == null)
        return -1;
    for(char ch: input.toCharArray()){
        if(ch == '-'){
        continue;
    }
    else{
    if(ch=='0'||ch=='1'||ch=='2'||ch=='3'||ch=='4'||ch=='5'||ch=='6'||ch=='7'||ch=='8'||ch=='9'){
        countDigits++;
    }
    else{
        return 0;
    }
    }
    }
    if(countDigits==10){
    return 1;
    }
    return 0;

 

}

 

}