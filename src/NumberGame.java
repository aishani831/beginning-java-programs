import java.util.Scanner;

public class NumberGame {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String x = "";
		int winning = (int) (Math.random()*10);
	    while (!x.equals("no")) {
			System.out.println("Do you want to play the number game?");
	    	x = sc.next();
			if (x.equals("no")) {
				System.out.println("You should play it!");
			} else if (x.equals("yes")) {
				System.out.println("Choose a number from 1 to 10!");
				
				try {
					int i = sc.nextInt();
					
					if (i == winning)
						System.out.println("You win!");
					else if (i > 10 || i < 1)
						System.out.println("Number out of bounds.");
					else
						System.out.println("You lose!");
				} catch (Exception e){
					System.out.println("Try again!");
					return;
				}
			} else {
				System.out.println("Please answer yes or no.");
			}
	    }

	}

}
