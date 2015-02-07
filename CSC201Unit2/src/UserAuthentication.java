import javax.swing.JOptionPane;


public class UserAuthentication {
	private static String correctUsername = "Tanes";
	private static String correctPassword = "1234";
	private static String username;
	private static String password;

	public static void main(String[] args) {
		username = JOptionPane.showInputDialog("Enter username.");
		authentication();
	}

	public static boolean authentication() {
		boolean status = false;
		if (username.equalsIgnoreCase(correctUsername)) {
			password = JOptionPane.showInputDialog("Enter password");
			// Note: difference between showInputDialog and showMessageDialog
			if (password.equals(correctPassword)) {
				JOptionPane.showMessageDialog(null, "Welcome " + username);
				status = true;
			} else {
				JOptionPane.showMessageDialog(null, "Invalid Password");
			}
		} else {
			status = false;
			JOptionPane.showMessageDialog(null, "Invalid Username");
		}
		return status;

	}
}