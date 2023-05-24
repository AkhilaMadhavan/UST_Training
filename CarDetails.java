class Car{
	//static int noOfWheels;
	int regId;
	String model;
	String color;
	public void displayDetails(){
		System.out.println("Reg ID : "+regId);
		System.out.println("Model  : "+model);
		System.out.println("Color  : "+color);
}
	public void start(){
		System.out.println("Car started");
	}
	public void brake(){
		System.out.println("Brakes Applied");
	}
}

class CarDetails{
	public static void main(String[]args){
	Car c1=new Car();
	c1.start();
	c1.regId=3456;
	c1.model="BMW";
	c1.color="White";
	c1.displayDetails();
	c1.brake();
	Car c2=new Car();
	c2.start();
	c2.regId=5657;
	c2.model="Swift";
	c2.color="Red";
	c2.displayDetails();
	c2.brake();
	
}}