import java.util.Scanner;

public class Message {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String x = "";
		String hint1 = "It is a shade of a color.";
		String hint2 = "It starts with the letter m.";
	    String hint3 = "It is not mango.";
	    String hint4 = "It is a shade of brown.";
	    int count = 0;
	    System.out.println("Tell me your favorite color.");
		do {
			if (count == 2) {
				System.out.println(hint1);
			} else if (count == 3) {
				System.out.println(hint2);
			} else if (count == 5) {
				System.out.println(hint3);
			} else if (count == 6) {
				System.out.println(hint4);
			}
			x = sc.next();
			if (x.equals("red")) {
				System.out.println("Roses are red...");
			}
			else if (x.equals("green")) {
				System.out.println("Are you a leprechaun? Give me your pot of gold!");
			}
			else if (x.equals("blue")) {
				System.out.println("Violets are blue...");
			}
			else if (x.equals("sugar")) {
				System.out.println("Sugar is sweet, and so are you! Unless you are Sonu. PS: Not a color.");
			}
			else if	(x.equals("orange")) {
				System.out.println("Not a common choice. Are you a hipster?");
			}
			else if (x.equals("yellow")) {
				System.out.println("What a nice color. Unless it's on a banana. Then yuck!");
			}
			else if (x.equals("pink")) {
				System.out.println("That is my favorite color too! You are super lit!;)");
			}
			else if (x.equals("purple")) {
				System.out.println("I love this color. It's so beautiful.");
			}
			else if (x.equals("white")) {
				System.out.println("Don't wear white after Labor Day!");
			}	
			else if (x.equals("black")) {
				System.out.println("This goes with everything. But are you a goth?");
			}	
			else if (x.equals("brown")) {
				System.out.println("I don't really like this color. It's the color of poop.");
			}	
			else if (x.equals("silver")) {
				System.out.println("So shiny. But only second place. PS: Also known as gray/grey.");
			}	
			else if (x.equals("indigo")) {
				System.out.println("I like rainbows too. After the rain, you can always find a rainbow.:)");
			}	
			else if (x.equals("maroon")) {
				System.out.println("You found the secret color. Good job!");
			}	
			else if (x.equals("mango")) {
				System.out.println("This is not a color. This is not a color. This is not a color. This is not a color. This is not a color. This is not a color. This is not a color. This is not a color. This is not a color. This is not a color.");
			}
			else if (x.equals("millenialpink")) {
				System.out.println("You need to stop. Kids these days...");
			}
			else if (x.equals("mauve")) {
				System.out.println("This is actually not bad. It could work, but it's not the right answer.");
			}
			else if (x.equals("mummy")) {
			System.out.println("Are you ok? Are you Sonu? If you are Sonu then I already know that you are not ok.");
			}
			else {
				System.out.println("I never thought about that. You're such a weirdo. But I love that about you. Unless you are Sonu.");
			}
			if (!x.equals("maroon")) {
				System.out.println("Now try to find the secret color. You can do it!");
			}
			count = count + 1;
		} while (!x.equals("maroon"));
	}
}
