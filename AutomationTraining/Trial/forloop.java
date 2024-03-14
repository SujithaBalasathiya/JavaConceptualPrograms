package Trial;

import java.util.Scanner;

public class forloop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int n=sc.nextInt();
		
		for(int i=1;i<20;i++) {
			System.out.println(n+"*"+i+"="+(n*i));
			//2*i=x
		}

	}

}
