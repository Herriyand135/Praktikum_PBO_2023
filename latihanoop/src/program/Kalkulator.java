package program;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSplitPane;

public class Kalkulator {

	private JFrame frame;
	private JTextField textField;
	double firstnum,secondnum,result;
	String operation,answer;
	/**
	 * @wbp.nonvisual location=71,389
	 */
	private final JSplitPane splitPane = new JSplitPane();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Kalkulator window = new Kalkulator();
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
	public Kalkulator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 507, 372);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number = textField.getText() + btn7.getText();
				textField.setText(Number);
				
			}
		});
		btn7.setBounds(10, 99, 91, 34);
		frame.getContentPane().add(btn7);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number = textField.getText() + btn4.getText();
				textField.setText(Number);
			}
		});
		btn4.setBounds(10, 156, 91, 34);
		frame.getContentPane().add(btn4);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number = textField.getText() + btn1.getText();
				textField.setText(Number);
			}
		});
		btn1.setBounds(10, 201, 91, 38);
		frame.getContentPane().add(btn1);
		
		JButton btnkali = new JButton("x");
		btnkali.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = 	Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "*";
			}
		});
		btnkali.setBounds(360, 99, 104, 34);
		frame.getContentPane().add(btnkali);
		
		JButton btnkurang = new JButton("-");
		btnkurang.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = 	Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "-";
			}
		});
		btnkurang.setBounds(360, 156, 104, 34);
		frame.getContentPane().add(btnkurang);
		
		JButton btntambah = new JButton("+");
		btntambah.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = 	Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "+";
			}
		});
		btntambah.setBounds(360, 201, 104, 38);
		frame.getContentPane().add(btntambah);
		
		JButton btndelate = new JButton("Del");
		btndelate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btndelate.setBounds(10, 250, 91, 41);
		frame.getContentPane().add(btndelate);
		
		JButton btnsamadengan = new JButton("=");
		btnsamadengan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String answer;
				secondnum = Double.parseDouble(textField.getText());
				if(operation == "+") {
					result = firstnum + secondnum;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation == "-") {
					result = firstnum - secondnum;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation == "*") {
					result = firstnum * secondnum;
					answer = String.format("%.2f", result);
					textField.setText(answer);
					
				}else if(operation == "/") {
					result = firstnum / secondnum;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
			}
		});
		btnsamadengan.setBounds(360, 250, 104, 41);
		frame.getContentPane().add(btnsamadengan);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number = textField.getText() + btn8.getText();
				textField.setText(Number);
			}
		});
		btn8.setBounds(131, 99, 91, 34);
		frame.getContentPane().add(btn8);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number = textField.getText() + btn5.getText();
				textField.setText(Number);
			}
		});
		btn5.setBounds(131, 156, 91, 34);
		frame.getContentPane().add(btn5);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number = textField.getText() + btn2.getText();
				textField.setText(Number);
			}
		});
		btn2.setBounds(131, 201, 91, 38);
		frame.getContentPane().add(btn2);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number = textField.getText() + btn0.getText();
				textField.setText(Number);
			}
		});
		btn0.setBounds(131, 250, 91, 41);
		frame.getContentPane().add(btn0);
		
		textField = new JTextField();
		textField.setBounds(10, 11, 473, 60);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number = textField.getText() + btn9.getText();
				textField.setText(Number);
			}
		});
		btn9.setBounds(242, 99, 89, 34);
		frame.getContentPane().add(btn9);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number = textField.getText() + btn6.getText();
				textField.setText(Number);
			}
		});
		btn6.setBounds(242, 156, 89, 34);
		frame.getContentPane().add(btn6);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number = textField.getText() + btn3.getText();
				textField.setText(Number);
			}
		});
		btn3.setBounds(242, 201, 89, 38);
		frame.getContentPane().add(btn3);
		
		JButton btnbagi = new JButton(":");
		btnbagi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = 	Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "/";
			}
		});
		btnbagi.setBounds(242, 250, 89, 41);
		frame.getContentPane().add(btnbagi);
	}
}
