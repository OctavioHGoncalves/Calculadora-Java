package br.com.calculadoraoctavio;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Calculadora {

	private JFrame frmCalculadora;
	private JLabel lblA;
	private JLabel lblB;
	private JTextField txtA;
	private JTextField txtB;
	private JButton btnSomar;
	private JButton btnSubtrair;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora window = new Calculadora();
					window.frmCalculadora.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculadora() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCalculadora = new JFrame();
		frmCalculadora.setTitle("Calculadora");
		frmCalculadora.setBounds(100, 100, 450, 300);
		frmCalculadora.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCalculadora.getContentPane().setLayout(null);
		
		lblA = new JLabel("Campo A");
		lblA.setFont(new Font("Arial", Font.PLAIN, 16));
		lblA.setBounds(10, 31, 88, 19);
		frmCalculadora.getContentPane().add(lblA);
		
		lblB = new JLabel("Campo B");
		lblB.setFont(new Font("Arial", Font.PLAIN, 16));
		lblB.setBounds(10, 81, 88, 19);
		frmCalculadora.getContentPane().add(lblB);
		
		txtA = new JTextField();
		txtA.setBounds(108, 30, 167, 20);
		frmCalculadora.getContentPane().add(txtA);
		txtA.setColumns(10);
		
		txtB = new JTextField();
		txtB.setColumns(10);
		txtB.setBounds(108, 80, 167, 20);
		frmCalculadora.getContentPane().add(txtB);
		
		btnSomar = new JButton("Somar");
		btnSomar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String valorA = txtA.getText();
				String valorB = txtB.getText();
				
				double valA = Double.parseDouble(valorA);
				double valB = Double.parseDouble(valorB);		
				double resultado = valA + valB;
				
				
				JOptionPane.showMessageDialog(null, "O resultado �: " + resultado);
				
			}
		});
		btnSomar.setFont(new Font("Arial", Font.PLAIN, 14));
		btnSomar.setBounds(47, 149, 98, 33);
		frmCalculadora.getContentPane().add(btnSomar);
		
		btnSubtrair = new JButton("Subtrair");
		btnSubtrair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String valorA = txtA.getText();
				String valorB = txtB.getText();
				
				double valA = Double.parseDouble(valorA);
				double valB = Double.parseDouble(valorB);		
				double resultado = valA - valB;
				
				JOptionPane.showMessageDialog(null, "O resultado �: " + resultado);
			}
		});
		btnSubtrair.setFont(new Font("Arial", Font.PLAIN, 14));
		btnSubtrair.setBounds(211, 149, 98, 33);
		frmCalculadora.getContentPane().add(btnSubtrair);
	}
}
