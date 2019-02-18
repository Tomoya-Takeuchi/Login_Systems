package Login_Sys;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JSeparator;
import javax.swing.JTextField;

public class Login_S {

	private JFrame frame;
	private JTextField txtUsername;
	private JPasswordField txtPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login_S window = new Login_S();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Login_S() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(200, 200, 500, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("Login Systems");
		lblNewLabel.setFont(new Font("MS UI Gothic", Font.BOLD, 50));
		lblNewLabel.setBounds(73, 10, 351, 55);
		frame.getContentPane().add(lblNewLabel);

		JLabel lblUsername = new JLabel("Username");
		lblUsername.setFont(new Font("MS UI Gothic", Font.BOLD, 30));
		lblUsername.setBounds(34, 92, 145, 31);
		frame.getContentPane().add(lblUsername);

		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("MS UI Gothic", Font.BOLD, 30));
		lblPassword.setBounds(34, 164, 136, 31);
		frame.getContentPane().add(lblPassword);

		txtUsername = new JTextField();
		txtUsername.setFont(new Font("MS UI Gothic", Font.BOLD, 30));
		txtUsername.setBounds(201, 89, 209, 34);
		frame.getContentPane().add(txtUsername);
		txtUsername.setColumns(10);

		txtPassword = new JPasswordField();
		txtPassword.setFont(new Font("MS UI Gothic", Font.BOLD, 30));
		txtPassword.setBounds(201, 164, 209, 31);
		frame.getContentPane().add(txtPassword);

		JButton btnLogin = new JButton("Login");
		btnLogin.setFont(new Font("MS UI Gothic", Font.BOLD, 30));
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				@SuppressWarnings("deprecation")
				String password = txtPassword.getText();
				String username = txtUsername.getText();

				if (password.contains("king") && username.contains("one")){
					txtPassword.setText(null);
					txtUsername.setText(null);

		}
				else
				{
					JOptionPane.showMessageDialog(null, "Invalid Login Details", "Login Error",JOptionPane.ERROR_MESSAGE);
					txtPassword.setText(null);
					txtUsername.setText(null);
				}
			}
		});
		btnLogin.setBounds(34, 213, 122, 38);
		frame.getContentPane().add(btnLogin);

		JButton btnReset = new JButton("Reset");
		btnReset.setFont(new Font("MS UI Gothic", Font.BOLD, 30));
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				txtUsername.setText(null);
				txtPassword.setText(null);
			}
		});
		btnReset.setBounds(195, 214, 145, 37);
		frame.getContentPane().add(btnReset);

		JButton btnExit = new JButton("Exit");
		btnExit.setFont(new Font("MS UI Gothic", Font.BOLD, 30));
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				JFrame frmLoginSystem = new JFrame("Exit");
				if (JOptionPane.showConfirmDialog(frmLoginSystem,  "本当に終了しますか？", "Login Systems",
				JOptionPane.YES_NO_OPTION)== JOptionPane.YES_NO_OPTION) {
				System.exit(0);
				}
			}
		});
		btnExit.setBounds(362, 214, 91, 37);
		frame.getContentPane().add(btnExit);

		JSeparator separator = new JSeparator();
		separator.setBounds(23, 201, 433, 2);
		frame.getContentPane().add(separator);

		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(30, 67, 426, 2);
		frame.getContentPane().add(separator_1);
	}
}
