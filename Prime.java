class Prime{
public static void main(String []args){
	int num=55;
	boolean Prime=true;
	for(int count=2;count<num/2;count++){
	   if(num%count==0){
		Prime=false;
		break;
	   }
	}
        if(Prime==true){
		System.out.println("Prime");
	}
	else{
		System.out.println("Not Prime");
}}}
