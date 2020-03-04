package Chard.Matt.Chapter6.Java.Project;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Main {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JLabel ResultLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
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
	public Main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(21, 11, 96, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel NumeratorLabel = new JLabel("Numerator");
		NumeratorLabel.setBounds(127, 14, 74, 14);
		frame.getContentPane().add(NumeratorLabel);
		
		textField_1 = new JTextField();
		textField_1.setBounds(21, 44, 96, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel DenominatorLabel = new JLabel("Denominator");
		DenominatorLabel.setBounds(127, 47, 64, 14);
		frame.getContentPane().add(DenominatorLabel);
		
		ResultLabel = new JLabel("Result");
		ResultLabel.setBounds(127, 77, 48, 14);
		frame.getContentPane().add(ResultLabel);
		
		JButton btnNewButton = new JButton("Calculate"); //top of what I cut/pasted
		
		btnNewButton.setBounds(28, 73, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		btnNewButton.addMouseListener(new MouseAdapter() { //start of what I pasted
				@Override
			public void mouseClicked(MouseEvent e) {
					Double numerator= Double.parseDouble(textField.getText()); //section A in instructions
					Double denominator= Double.parseDouble(textField_1.getText()); //section B in instructions 
					SimpleMath Math= new SimpleMath(); //instantiate the SimpleMath class
						double result= Math.divide(numerator, denominator);
						
						try {ResultLabel.setText(Double.toString(result));
						} 
						catch(ArithmeticException error) {
							ResultLabel.setText("Cannot divide by zero");
						}
			}
		});
	}
	
}
