package Trial;

public class Car {
	
	String Name= "Sujitha Balasathiya";
	int Age = 26;
	
	public String CarName() {
		System.out.println("Name - "+Name);
		System.out.println("Age - "+Age);
		return "Car Name Aadi";	
	}
	
	private boolean OwnCar() {
		System.out.println("Not Own Car");
		return false;
		
	}
	
	public int CarNum() {
		int Num = 12345432;
		System.out.println("Car Numer - "+Num);
		return Num;
	}
	
	

}
