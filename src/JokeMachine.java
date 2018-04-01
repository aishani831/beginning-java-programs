import java.util.Scanner;

public class JokeMachine {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String x = "";
		int joke = (int) (Math.random()*10);
		System.out.println("Do you want to hear a joke?");
		x = sc.next();
		int i = sc.nextInt();
		if (x.equals("yes")) {
			System.out.println( i);
		}
		else if (x.equals("no")) {
			System.out.println("You will hear a joke anyways.");
			System.out.println(i);
		}
	}

}
