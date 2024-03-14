package Programs;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

	int user;
	int computer;

	public void game() {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter input value");
		String input =sc.nextLine();
		//String input ="Paper";
		System.out.println("User move: "+input);
		
		Random rand = new Random();
		 int move2 = rand.nextInt(1, 3);
		// System.out.println(move2);
		 String Sysmove ="";
		 switch(move2) {
			case 1: 
				Sysmove="Rock";
				System.out.println("System move: Rock ");
				break;
			case 2: 
				Sysmove="Paper";
				System.out.println("System move: Paper ");
				break;
			case 3: 
				Sysmove="Scissors";
				System.out.println("System move: Scissors ");
}
		if(input.equalsIgnoreCase("Rock")) {
			if(Sysmove=="Paper") {
				computer++;
			}
			else if(Sysmove=="Scissors")
				user++;
		}
		
		if(input.equalsIgnoreCase("Paper")) {
			if(Sysmove=="Rock") {
				user++;
			}
			else if(Sysmove=="Scissors")
				computer++;
		}
		
		if(input.equalsIgnoreCase("Scissors")) {
			if(Sysmove=="Paper") {
				user++;
			}
			else if(Sysmove=="Rock")
				computer++;
		}
		System.out.println("User -"+user);
		System.out.println("Computer -"+computer);
	}
		
	public void output() {
			if(user>computer) 
				System.out.println("User Winner");
			else if(user==computer) 
				System.out.println("Match Draw");
			else
				System.out.println("Computer Winner");
	}
}
