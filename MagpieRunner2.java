/**
 * A simple class to run the Magpie class.
 * @author Laurie White
 * @version April 2012
 */
public class MagpieRunner2 {

	/**
	 * Create a Magpie, give it user input, and print its replies.
	 */
	public static void main(String[] args) {
		Magpie2 maggie = new Magpie2();

		String response = maggie.getGreeting();
		System.out.println("Magpie: " + response);
		String statement = TextInput.getString(response);
		System.out.println("Me:     " + statement);

		while (!statement.equals("Bye")) {
			response = maggie.getResponse(statement);
			System.out.println("Magpie: " + response);
			statement = TextInput.getString(response);
			System.out.println("Me:     " + statement);
		}
	}

}
