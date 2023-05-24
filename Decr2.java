/*
54321
5432
543
54
5
*/



class Decr2{
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