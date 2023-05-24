import java.util.Scanner;
public class PhoneNumberValidator{
	Scanner sc=new Scanner (System.in);
	public static void main(String[]args)
	{
	PhoneNumberValidator ph=new PhoneNumberValidator();
	ph.displayResult(ph.validatephoneNumber(ph.getInput()));
	}
	public String getInput(){
	System.out.println("Enter Mobile number ");
	return sc.nextLine();
	}
	public void displayResult(int result){
	switch(result)
	{
	 case 1:System.out.println("Valid");break;
	 case 2:System.out.println("Invalid");break;
	 default:System.out.println("Empty String");
	}
	}

	public int validatephoneNumber(String num){
	int count=0;
	if(num.length() == 0 || num == null)
		return -1;
	for(char ch : num.toCharArray()){
		if(ch == '-'){
		continue;
		}
	else{
	if(ch=='0' ||ch=='1' ||ch=='2' ||ch=='3' ||ch=='4' ||ch=='5' ||ch=='6' ||ch=='7' ||ch=='8' ||ch=='9'){
		count++;
	}
	else {
	return 2;
	}
	}
	}
	if(count==10){
	return 1;
	}
	return 2;
}

}