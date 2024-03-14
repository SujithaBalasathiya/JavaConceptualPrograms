package Trial;

public class MyMobile {

	public static void main(String[] args) {
		
		Mobile mobile = new Mobile();
		mobile.Brand();
		int Mob = mobile.Model(15);
		System.out.println(Mob);
		String Modl = mobile.Model("Galaxy A15");
		System.out.println(Modl);
		

	}

}
