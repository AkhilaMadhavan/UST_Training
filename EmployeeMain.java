class Employee{
	int empId;
	String empName;
	String eMail;
	public void printEmployee(){
		System.out.println("ID   : "+empId);
		System.out.println("Name : "+empName);
		System.out.println("Email: "+eMail);
}}

class EmployeeMain{
	public static void main(String[]args){
	Employee e1=new Employee();
	e1.empId=100;
	e1.empName="Akhila";
	e1.eMail="akhila@yahoo.com";
	Employee e2=new Employee();
	e2.empId=101;
	e2.empName="Abitha";
	e2.eMail="abitha@yahoo.com";
	e1.printEmployee();
	e2.printEmployee();
	
}}