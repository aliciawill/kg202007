package ���;

public class CoffeeTruckUser {

	public static void main(String[] args) {
		CoffeeTruck coffee = new CoffeeTruck();
		coffee.color = "����"; //Car
		coffee.company = "apple"; //Car
		coffee.price = 1500; //CoffeeTruck
		coffee.weight = 1;//Truck
		System.out.println(coffee);
		
		coffee.speedUp(); //Car
		coffee.move();//Truck
		coffee.sale();//CoffeeTruck
		coffee.speedUDown();//Car
	}
	
	
	
	
	
	

}
