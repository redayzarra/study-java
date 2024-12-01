public class Switch {
	public static void main(String[] args) {
		// Define the variable that we are dependent on
		String role = "admin";
		switch (role) {
			case "admin":
				System.out.println("You're an admin.");
				break;
			case "moderator":
				System.out.println("You're a mod.");
				break;
			default:
				System.out.println("You're a guest.");
		}
	}
}
