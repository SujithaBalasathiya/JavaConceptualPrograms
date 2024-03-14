package Programs;

public class Palindrome {

	public static void main(String[] args) {
		String Str = "Madamqw";
		char a;
		String Rev ="";
		
		for(int i=0;i<Str.length();i++) {
			a=Str.charAt(i);
			Rev=a+Rev;
		}
		System.out.println(Str);
		System.out.println(Rev);
		if(Str.equalsIgnoreCase(Rev)) {
			System.out.println("This is Palindrom");
		}
		else
			System.out.println("Not Palindrom");
		
	
	}
}
		
		
		
		