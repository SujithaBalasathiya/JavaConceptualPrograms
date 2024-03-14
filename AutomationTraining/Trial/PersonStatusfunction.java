package Trial;

public class PersonStatusfunction {
	
	public void eat() {
		System.out.println("Dosa");
	}
	public static void sleep() {
		System.out.println("7 hr's a day");
	}
	public static void main(String[] args) {
		
		sleep();
		System.out.println("After object creation");
		PersonStatusfunction sta = new PersonStatusfunction();
		sta.eat();
		sta.sleep();//The static method sleep() from the type PersonStatusfunction should be accessed in a static way
		PersonStatusfunction.sleep();

	}

}
