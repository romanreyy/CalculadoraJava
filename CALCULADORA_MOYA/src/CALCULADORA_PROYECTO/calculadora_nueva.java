package CALCULADORA_PROYECTO;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class calculadora_nueva {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculadora_nueva window = new calculadora_nueva();
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
	public calculadora_nueva() {
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

		

		

		

		JLabel lblResult = new JLabel("Resultado");

		lblResult.setFont(new Font("Times New Roman", Font.PLAIN, 20));

		lblResult.setHorizontalAlignment(SwingConstants.CENTER);

		lblResult.setBounds(283, 188, 46, 14);

		frame.getContentPane().add(lblResult);

		

		

		JButton btnSuma = new JButton("SUMA");

		btnSuma.setBounds(47, 55, 89, 23);

		frame.getContentPane().add(btnSuma);

		btnSuma.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				float num1=Float.parseFloat(textField.getText());

				float num2=Float.parseFloat(textField_1.getText());

				float suma= num1 + num2;

				lblResult.setText(String.valueOf(suma));

			}

		});

		

		JButton btnResta = new JButton("RESTA");

		btnResta.setBounds(161, 55, 89, 23);

		frame.getContentPane().add(btnResta);

		btnResta.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				float num1=Float.parseFloat(textField.getText());

				float num2=Float.parseFloat(textField_1.getText());

				float resta= num1 - num2;

				lblResult.setText(String.valueOf(resta));

			}

		});

		

		JButton btnMult = new JButton("MULT");

		btnMult.setBounds(260, 55, 89, 23);

		frame.getContentPane().add(btnMult);

		btnMult.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				float num1=Float.parseFloat(textField.getText());

				float num2=Float.parseFloat(textField_1.getText());

				float mult= num1 * num2;

				lblResult.setText(String.valueOf(mult));

			}

		});

		

		JButton btnDiv = new JButton("DIV");

		btnDiv.setBounds(47, 122, 89, 23);

		frame.getContentPane().add(btnDiv);

		btnDiv.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				try {

					float num1=Float.parseFloat(textField.getText());

					float num2=Float.parseFloat(textField_1.getText());

					

					if (num2 == 0) {

						lblResult.setText("Error: Division por cero");

					} else {

						float Divi= (float)num1 / num2;

						lblResult.setText(String.valueOf(Divi));

					}

				} catch (NumberFormatException ex) {

					lblResult.setText("Error: Entrada no valida");

				}

			}

		});
		
		JButton btnPotencia = new JButton("POTENCIA");
		btnPotencia.setBounds(32, 183, 117, 29);
		frame.getContentPane().add(btnPotencia);
		btnPotencia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double num1=Double.parseDouble(textField.getText());
				
				double num2=Float.parseFloat(textField_1.getText());
				
				double potencia= Math.pow(num1, num2);
				
				lblResult.setText(String.valueOf(potencia));
			}
		});
		
		JButton btnRaiz = new JButton("RAIZ");
		btnRaiz.setBounds(32, 224, 117, 29);
		frame.getContentPane().add(btnRaiz);
		btnRaiz.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double num1=Double.parseDouble(textField.getText());
				double num2=Double.parseDouble(textField_1.getText());
				
				
				double raiz= Math.pow(num1, 1 / num2);
				
				lblResult.setText(String.valueOf(raiz));
			}
		});
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setText("0");
		textField.setBounds(148, 119, 130, 26);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_1.setText("0");
		textField_1.setBounds(286, 119, 130, 26);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);

	}
}