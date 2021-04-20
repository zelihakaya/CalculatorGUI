import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JLabel;

public class Calc extends JFrame {

	private JPanel contentPane;
	private JTextField input;
	private double answer, number;
	int operation;
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calc frame = new Calc();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public void addInput(String str) {
		input.setText(input.getText() + str);
	}

	public void calculate() {
		switch(operation) {
		case 1:
			answer = number + Double.parseDouble(input.getText());
			input.setText(Double.toString(answer));
			break;
		case 2:
			answer = number - Double.parseDouble(input.getText());
			input.setText(Double.toString(answer));
			break;
		case 3:
			answer = number * Double.parseDouble(input.getText());
			input.setText(Double.toString(answer));
			break;
		case 4:
			answer = number / Double.parseDouble(input.getText());
			input.setText(Double.toString(answer));
			break;
		}
	}
	
	
	/**
	 * Create the frame.
	 */
	public Calc() {
		setTitle("Calculator");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 410, 500);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 105, 180));
		contentPane.setForeground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel Screen = new JPanel();
		Screen.setBounds(10, 11, 376, 70);
		contentPane.add(Screen);
		Screen.setLayout(null);
		
		input = new JTextField();
		input.setBackground(Color.PINK);
		input.setEditable(false);
		input.setHorizontalAlignment(SwingConstants.RIGHT);
		input.setFont(new Font("Tahoma", Font.BOLD, 23));
		input.setBounds(0, 33, 376, 37);
		Screen.add(input);
		input.setColumns(10);
		
		JLabel label = new JLabel("");
		label.setHorizontalAlignment(SwingConstants.RIGHT);
		label.setFont(new Font("Tahoma", Font.BOLD, 12));
		label.setBounds(0, 0, 376, 14);
		Screen.add(label);
		
		JPanel Control = new JPanel();
		Control.setBackground(new Color(255, 105, 180));
		Control.setBounds(10, 97, 376, 345);
		contentPane.add(Control);
		Control.setLayout(new GridLayout(4, 4, 20, 20));
		
		JButton button = new JButton("7");
		button.setBackground(Color.PINK);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			//	input.setText(input.getText() + e.getActionCommand());
				addInput(e.getActionCommand());
			}
		});
		button.setFont(new Font("Tahoma", Font.BOLD, 23));
		Control.add(button);
		
		JButton button_1 = new JButton("8");
		button_1.setBackground(Color.PINK);
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			//	input.setText(input.getText() + e.getActionCommand());
				addInput(e.getActionCommand());
			}
		});
		button_1.setFont(new Font("Tahoma", Font.BOLD, 23));
		Control.add(button_1);
		
		JButton button_2 = new JButton("9");
		button_2.setBackground(Color.PINK);
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			//	input.setText(input.getText() + e.getActionCommand());
				addInput(e.getActionCommand());
			}
		});
		button_2.setFont(new Font("Tahoma", Font.BOLD, 23));
		Control.add(button_2);
		
		JButton button_3 = new JButton("+");
		button_3.setBackground(Color.PINK);
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			//	input.setText(input.getText() + e.getActionCommand());
				//addInput(e.getActionCommand());
				number = Double.parseDouble(input.getText());
				operation = 1;
				input.setText("");
				label.setText(number + e.getActionCommand());
			}
		});
		button_3.setFont(new Font("Tahoma", Font.BOLD, 23));
		Control.add(button_3);
		
		JButton btnNewButton = new JButton("6");
		btnNewButton.setBackground(Color.PINK);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			//	input.setText(input.getText() + e.getActionCommand());
				addInput(e.getActionCommand());
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 23));
		Control.add(btnNewButton);
		
		JButton button_5 = new JButton("5");
		button_5.setBackground(Color.PINK);
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			//	input.setText(input.getText() + e.getActionCommand());
				addInput(e.getActionCommand());
			}
		});
		button_5.setFont(new Font("Tahoma", Font.BOLD, 23));
		Control.add(button_5);
		
		JButton button_4 = new JButton("4");
		button_4.setBackground(Color.PINK);
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			//	input.setText(input.getText() + e.getActionCommand());
				addInput(e.getActionCommand());
			}
		});
		button_4.setFont(new Font("Tahoma", Font.BOLD, 23));
		Control.add(button_4);
		
		JButton button_6 = new JButton("-");
		button_6.setBackground(Color.PINK);
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			//	input.setText(input.getText() + e.getActionCommand());
				//addInput(e.getActionCommand());
				number = Double.parseDouble(input.getText());
				operation = 2;
				input.setText("");
				label.setText(number + e.getActionCommand());
			}
		});
		button_6.setFont(new Font("Tahoma", Font.BOLD, 23));
		Control.add(button_6);
		
		JButton button_8 = new JButton("3");
		button_8.setBackground(Color.PINK);
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			//	input.setText(input.getText() + e.getActionCommand());
				addInput(e.getActionCommand());
			}
		});
		button_8.setFont(new Font("Tahoma", Font.BOLD, 23));
		Control.add(button_8);
		
		JButton button_7 = new JButton("2");
		button_7.setBackground(Color.PINK);
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			//	input.setText(input.getText() + e.getActionCommand());
				addInput(e.getActionCommand());
			}
		});
		button_7.setFont(new Font("Tahoma", Font.BOLD, 23));
		Control.add(button_7);
		
		JButton button_9 = new JButton("1");
		button_9.setBackground(Color.PINK);
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			//	input.setText(input.getText() + e.getActionCommand());
				addInput(e.getActionCommand());
			}
		});
		button_9.setFont(new Font("Tahoma", Font.BOLD, 23));
		Control.add(button_9);
		
		JButton button_10 = new JButton("*");
		button_10.setBackground(Color.PINK);
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			//	input.setText(input.getText() + e.getActionCommand());
				//addInput(e.getActionCommand());
				number = Double.parseDouble(input.getText());
				operation = 3;
				input.setText("");
				label.setText(number + e.getActionCommand());
			}
		});
		button_10.setFont(new Font("Tahoma", Font.BOLD, 23));
		Control.add(button_10);
		
		JButton button_11 = new JButton("0");
		button_11.setBackground(Color.PINK);
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			//	input.setText(input.getText() + e.getActionCommand());
				addInput(e.getActionCommand());
			}
		});
		button_11.setFont(new Font("Tahoma", Font.BOLD, 23));
		Control.add(button_11);
		
		JButton button_12 = new JButton("=");
		button_12.setBackground(Color.PINK);
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculate();
				label.setText("");
			}
		});
		button_12.setFont(new Font("Tahoma", Font.BOLD, 23));
		Control.add(button_12);
		
		JButton btnC = new JButton("C");
		btnC.setBackground(Color.PINK);
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			//	input.setText(input.getText() + e.getActionCommand());
				input.setText("");
			}
		});
		btnC.setFont(new Font("Tahoma", Font.BOLD, 23));
		Control.add(btnC);
		
		JButton button_14 = new JButton("/");
		button_14.setBackground(Color.PINK);
		button_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			//	input.setText(input.getText() + e.getActionCommand());
				//addInput(e.getActionCommand());	
				number = Double.parseDouble(input.getText());
				operation = 4;
				input.setText("");
				label.setText(number + e.getActionCommand());
			}
		});
		button_14.setFont(new Font("Tahoma", Font.BOLD, 23));
		Control.add(button_14);
	}
}
