package Programs;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		
//Normal
		/*Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int n=sc.nextInt();*/
		/*int isPrime=0;
		for (int n=2;n<=100;n++) {
			for(int j=2;j<n;j++) {
			   if(n%j==0) {
				isPrime++; 
				
				}
			   }
			if(isPrime==0) {
				  System.out.println(n+" Is Prime Number");
			  }
			//else
			//   System.out.println(n+" not a Prime Number");
			isPrime=0;
}}}*/
		
//optimized
		
		int n = 13;
		int count = 0;
		int i=1;
		while(count<3) {
			if(n%i==0) {
				count++;
			}
			if(n==i)
				break;
			
			i++;
			
		}
		if(count==2) {
			  System.out.println(n+" Is Prime Number");
		  }
		else
			System.out.println(n+" not a Prime Number");
		
	}
	}


