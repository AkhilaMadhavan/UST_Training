/*
Sample Input :
    int[] salesDepartmentEmpIds = {101,105,106,107,108,109};
Sample Output:
    true
if repeat=false
*/


import java.util.Scanner;
class Dpt{
	public static void main(String[]args){
	int[]empId={101,105,106,101,108,109};
	boolean val=true;
	for(int i=0;i<empId.length;i++){
		for(int j=1;j<empId.length;j++){
			if(empId[i]==empId[j]){
			val=false;
			}
			else{
			val=true;
			}
		}
	}
	System.out.println(val);
}}