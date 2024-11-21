

public class Strings {
	public static void main(String[] args) {
		// You can initalize like this - redundant
        String message = new String("Hello world");
        System.out.println(message);

        // You can use this shorter way as well
        String message2 = "Hello universe!";
        System.out.println(message2);

        // Concatenate different strings
        System.out.println(message2 + "!!");

        // Explore some string methods avaiablle
        System.out.println(message2.endsWith("!"));
        System.out.println(message.startsWith("Bye"));

        // Get the string's length
        System.out.println(message2.length());

		// Get the first occurence of a character
		System.out.println(message.indexOf("o"));

		// Replace characters => returns new string
		System.out.println(message2.replace("!", "*") + ", " + message2);

		System.out.println(message.toLowerCase());

		// Get rid of whitespaces
		System.out.println(message.trim());
	}
}
