package Trial;

public class StatisVariable {
	
	int x;
	static int y;
	
	public void increment() {
		++x;
		++y;
		System.out.println("X - "+x + ", Y - "+y);
	}

	public static void main(String[] args) {
		
		StatisVariable sv = new StatisVariable();
		sv.increment();
		sv.increment();
		
		StatisVariable sv1 = new StatisVariable();
		sv1.increment();
		sv1.increment();
	}

}
