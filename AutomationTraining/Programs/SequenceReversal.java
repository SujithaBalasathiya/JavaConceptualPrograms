package Programs;

public class SequenceReversal {
	public static void main(String[] args) {
		String Str = "SujINhbsk";
		char a;
		String Final ="";

		for(int i=0;i<Str.length();i++) {
			if(Character.isLowerCase(Str.charAt(i))) {
				a = Character.toUpperCase((Str.charAt(i)));
				Final = Final+a;
			}
			else{
				a = Character.toLowerCase((Str.charAt(i)));
				Final = Final+a;
			}
		}
		System.out.println(Final);
	}
}
