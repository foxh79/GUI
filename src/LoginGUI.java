import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LoginGUI extends JFrame {
	private JLabel usernameLabel;
	private JLabel passwordLabel;
	private JTextField usernameField;
	private JPasswordField passwordField;
	private JButton loginButton;
	private JButton refreshButton;

	public LoginGUI() {
		super("Login");
		setLayout(new FlowLayout());

		usernameLabel = new JLabel("Username: ");
		add(usernameLabel);

		usernameField = new JTextField(15);
		add(usernameField);

		passwordLabel = new JLabel("Password: ");
		add(passwordLabel);

		passwordField = new JPasswordField(15);
		add(passwordField);

		loginButton = new JButton("Login");
		add(loginButton);

		refreshButton = new JButton("Refresh");
		add(refreshButton);

		ButtonHandler handler = new ButtonHandler();
		loginButton.addActionListener(handler);
		refreshButton.addActionListener(handler);
	}

	private class ButtonHandler implements ActionListener {
	public void actionPerformed(ActionEvent event) {
		if (event.getSource() == loginButton) {
			// code for login
			String username = usernameField.getText();
String password = new String(passwordField.getPassword());

// check if username and password are valid
if (checkCredentials(username, password)) {
JOptionPane.showMessageDialog(null, "Login successful!");
} else {
JOptionPane.showM
essageDialog(null, "Invalid username or password.", "Error", JOptionPane.ERROR_MESSAGE);
}

// dummy method for checking credentials
 checkCredentials(String username, String password) {
return (username.equals("admin") && password.equals("admin"));
}
		} else if (event.getSource() == refreshButton) {
			// code for refresh
			usernameField.setText("");
			passwordField.setText("");
		}
	}

		private boolean checkCredentials(String username, String password) {
			return false;
		}
	}

	public static void main(String[] args) {
		LoginGUI login = new LoginGUI();
		login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		login.setSize(250, 150);
		login.setVisible(true);
	}
}
