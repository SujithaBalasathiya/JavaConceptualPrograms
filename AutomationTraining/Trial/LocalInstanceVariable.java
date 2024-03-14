package Trial;

public class LocalInstanceVariable {
	
	//int a=90;
	int a;
	
	
	public void Sum(int a, int d) {
		System.out.println("Sum "+(this.a+d));
	}
	
	

	public static void main(String[] args) {
		LocalInstanceVariable lc = new LocalInstanceVariable();
		lc.Sum(2, 20);
		
		//This keyword can not be used in Static
		//int Sum=20+this.a;

	}

}
