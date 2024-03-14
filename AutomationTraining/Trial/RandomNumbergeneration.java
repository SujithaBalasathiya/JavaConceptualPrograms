package Trial;

import java.util.Random;

public class RandomNumbergeneration {

	public static void main(String[] args) {
		// create instance of Random class
		// create instance of Random class
//        Random rand = new Random();
//   
//
//        int int1 = rand.nextInt(10);
//        int int2 = rand.nextInt(99);
//     
//        System.out.println("Random Integers: "+int1);
//        System.out.println("Random Integers: "+int2);

        Random rand = new Random();
		 int move2 = rand.nextInt(3);
		 
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
			default:
				System.out.println("Invalid input");
		}
	}

}
