import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AddNumbers {

	private JFrame frmAdditionApplication;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddNumbers window = new AddNumbers();
					window.frmAdditionApplication.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AddNumbers() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAdditionApplication = new JFrame();
		frmAdditionApplication.setTitle("Addition Application");
		frmAdditionApplication.setBounds(100, 100, 591, 421);
		frmAdditionApplication.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAdditionApplication.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Enter First Number :");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setBounds(53, 115, 144, 21);
		frmAdditionApplication.getContentPane().add(lblNewLabel);
		
		JLabel lblEnterSecondNumber = new JLabel("Enter Second Number :");
		lblEnterSecondNumber.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblEnterSecondNumber.setBounds(53, 174, 144, 21);
		frmAdditionApplication.getContentPane().add(lblEnterSecondNumber);
		
		JTextPane num1 = new JTextPane();
		num1.setBounds(246, 117, 155, 19);
		frmAdditionApplication.getContentPane().add(num1);
		
		JTextPane num2 = new JTextPane();
		num2.setBounds(246, 176, 155, 19);
		frmAdditionApplication.getContentPane().add(num2);
		
		JLabel lblAddTwoNumbers = new JLabel("Add Two Numbers");
		lblAddTwoNumbers.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		lblAddTwoNumbers.setBounds(131, 44, 224, 35);
		frmAdditionApplication.getContentPane().add(lblAddTwoNumbers);
		
		JButton btnNewButton = new JButton("Add Numbers");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int number1 = Integer.parseInt(num1.getText());
				int number2 = Integer.parseInt(num2.getText());
				int sum = number1 + number2;
				JOptionPane.showMessageDialog(null, sum);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.setBounds(156, 227, 120, 35);
		frmAdditionApplication.getContentPane().add(btnNewButton);
	}
}
