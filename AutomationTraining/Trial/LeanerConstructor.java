package Trial;

public class LeanerConstructor {
	
	//private static final int "Sujitha" = 0;
	int i;
	short s;
	byte b;
	long l;
	double d;
	String str;
	char c;
	
	public void defaultvalue() {
		System.out.println("Int - "+i);
		System.out.println("Short - "+s);
		System.out.println("Byte - "+b);
		System.out.println("Long - "+l);
		System.out.println("Double - "+d);
		System.out.println("String - "+ str);
		System.out.println("Char - "+c);
	}
	
	public void LeanerConstructor(int i, double d ){
		this.i=i;
		this.d=d;
		System.out.println("Int - "+i);
		System.out.println("Short - "+s);
		System.out.println("Byte - "+b);
		System.out.println("Long - "+l);
		System.out.println("Double - "+d);
		System.out.println("String - "+ str);
		System.out.println("Char - "+c);
		
		System.out.println("----------------");
	}
	
	public void LeanerConstructor(String str, char c ){
		this.str=str;
		this.c=c;
		System.out.println("Int - "+i);
		System.out.println("Short - "+s);
		System.out.println("Byte - "+b);
		System.out.println("Long - "+l);
		System.out.println("Double - "+d);
		System.out.println("String - "+ str);
		System.out.println("Char - "+c);
	}
	
	public static void main(String[] args) {
		LeanerConstructor lc = new LeanerConstructor();
		//lc.defaultvalue();
		lc.LeanerConstructor(20, 1.5);
		lc.LeanerConstructor("Sujitha", 'S');

	}

}
