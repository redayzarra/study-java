public class Switch {
	public static void main(String[] args) {
		// Define the variable that we are dependent on
		String role = "admin";

		// Create a switch block with the variable 
		switch (role) {
			// Define an individual case for the variable
			case "admin":
				System.out.println("You're an admin.");
				break; // Remember to break out of switch block
			case "moderator":
				System.out.println("You're a mod.");
				break;
			// Define a default case if all else fails
			default:
				System.out.println("You're a guest.");
		}
	}
}
