package Programs;

public class LeapYear {

	public static void main(String[] args) {
		int Y = 1900;
		if (Y%4==0) {
			if((Y%100==0)&&(Y%400!=0))
				System.out.println("This is not Leap Year");
			else
				System.out.println("This is a Leap Year");
		}
		else
			System.out.println("This is not Leap Year");
			
			
	
			
		

	}

}
