import javax.swing.JOptionPane;

public class TextInput {

	public static String getString(String message) {
		return JOptionPane.showInputDialog(message);
	}

	public static int getInt(String message) {
		boolean isInt = false;
		int num = 0;
		while (!isInt) {
			String s = getString(message);
			try {
				num = Integer.parseInt(s);
				isInt = true;
			} catch (NumberFormatException nfe) {
				JOptionPane.showMessageDialog(null, "That is not an int");
			}
		}
		return num;
	}

	public static double getDouble(String message) {
		boolean isDouble = false;
		double num = 0;
		while (!isDouble) {
			String s = getString(message);
			try {
				num = Double.parseDouble(s);
				isDouble = true;
			} catch (NumberFormatException nfe) {
				JOptionPane.showMessageDialog(null, "That is not a double");
			}
		}
		return num;
	}

}
