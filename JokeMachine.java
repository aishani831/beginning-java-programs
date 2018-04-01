import java.util.Scanner;

public class JokeMachine {
	public static void main(String[] args) {
		String[] jokeArray = new String[10];
		jokeArray[0] = "Joke 1";
		jokeArray[1] = "Joke 2";
		jokeArray[2] = "Joke 3";
		jokeArray[3] = "Joke 4";
		jokeArray[4] = "Joke 5";
		jokeArray[5] = "Joke 6";
		jokeArray[6] = "Joke 7";
		jokeArray[7] = "Joke 8";
		jokeArray[8] = "Joke 9";
		jokeArray[9] = "Joke 10";
		Scanner sc = new Scanner(System.in);
		String input = "";
		int jokeNumber = (int) (Math.random()*9);
		System.out.println("Do you want to hear a joke?");
		input = sc.next();
		if (input.equals("yes")) {
			System.out.println(jokeArray[jokeNumber]);
		}
		else if (input.equals("no")) {
			System.out.println("You will hear a joke anyways.");
			System.out.println(jokeArray[jokeNumber]);
		}
	}

}
