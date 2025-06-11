package ActivitiesPractice;

public class Car {
	String color;
	 String transmission;
	 int make;
	 int tyres;
	int doors;
	
	 Car(String color,String transmission,int make) {
		 this.color=color;
		 this.transmission=transmission;
	        this.tyres = 4;
	        this.doors = 4;
	        this.make = make;
	    }
	
	 public void displayCharacteristics() {
		 System.out.println("The color of the car is :" + this.color);
		 System.out.println("Transimission Type is:" + this.transmission);
		 System.out.println("The car was made in :" + this.make);
		 System.out.println("It has " + this.tyres + "Tyres and" + this.doors + "Doors " );
	 }
	  public void accelerate() {
		 System.out.println("car is moving forward");
	 }
	  public void brake() {
		 System.out.println("car has stoped");
	 }

}
