/*
Descending order pattern 
5
5 4
5 4 3 
5 4 3 2 
5 4 3 2 1


class DecrPattern{
	public static void main(String[]args){
	for(int row=5;row>0;row--){
		for(int col=5;col>=row;col--){
		System.out.print(col+" ");
		}
		System.out.println();
		}
	}
}
*/
class DecrPattern{
	public static void main(String[]args){
	int lines=5;
	for(int row=1;row<=lines;row++){
		for(int col=1;col<=row;col++){
		System.out.print(lines-(col-1)+" ");
		}
		System.out.println();
		}
	}
}



















