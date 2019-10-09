import javax.swing.JOptionPane;

/**
 * A simple class to run the Magpie class.
 * @author Laurie White
 * @version April 2012
 */
public class MagpieRunner4 {

	/**
	 * Create a Magpie, give it user input, and print its replies.
	 */
	public static void main(String[] args) {
		Magpie4 maggie = new Magpie4();

		String response = maggie.getGreeting();
		String statement = "";

		do {
			System.out.println("Magpie: " + response);
			statement = TextInput.getString(response);
			System.out.println("Me:     " + statement);
			response = maggie.getResponse(statement);
		} while (!statement.equals("Bye"));
	}

}
