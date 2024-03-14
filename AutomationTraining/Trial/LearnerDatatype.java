package Trial;
import java.util.Scanner;
public class LearnerDatatype {

	public static void main(String[] args) {
		
		String Name = "Sujitha Balasathiya";
		byte Age = 26;
		short RollNum = 1234;
		int EmpId = 934617;
		long PhoneNumber = 9864689757899l;
		float Height = 167.5f;
		double Salary = 12245323.2134;
		char Initial ='S';
		boolean Working = true;
		
		
		
		
		System.out.println("Name = "+Name);
		System.out.println("Age = "+Age);
		System.out.println("RollNum = "+RollNum);
		System.out.println("EmpId = "+EmpId);
		System.out.println("PhoneNumber = "+PhoneNumber);
		System.out.println("Height = "+Height);
		System.out.println("Salary = "+Salary);
		System.out.println("Initial = "+Initial);
		System.out.println("Working = "+Working);
		

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name");
		String SisName = sc.next();
		System.out.println("Sister Name "+SisName);

	}

}
