package br.senai.sp.jandira.ui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Tela {

	public void criarTela() {
		
		JFrame minhaTela = new JFrame();
		minhaTela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		minhaTela.setSize(400, 600);
		minhaTela.setTitle("Calculadora de IMC");
		minhaTela.setLayout(null);
		
		JLabel lblTitulo = new JLabel();
		lblTitulo.setText("Cálculo de IMC");
		lblTitulo.setBounds(40, 20, 300, 30);
		lblTitulo.setForeground(Color.blue);
		lblTitulo.setFont(new Font("Monospace", Font.BOLD,30));
		
		
		JLabel lblPeso = new JLabel();
		lblPeso.setText("Seu peso:");
		lblPeso.setBounds(40, 100, 150, 30);
		lblPeso.setFont(new Font("Monospace", Font.PLAIN,15));
		
		
		JTextField txtPeso = new JTextField();
		txtPeso.setText("00");
		txtPeso.setBounds(120, 95, 100, 40);
		
		
		JLabel lblAltura = new JLabel();
		lblAltura.setText("Sua altura:");
		lblAltura.setBounds(40, 175, 150, 30);
		lblAltura.setFont(new Font("Monospace", Font.PLAIN,15));
		
		
		JTextField txtAltura = new JTextField();
		txtAltura.setText("1.70");
		txtAltura.setBounds(120, 170, 100, 40);
		
		
		JButton btnCalcular = new JButton();
		btnCalcular.setText("CALCULAR");
		btnCalcular.setBounds(40, 250, 250, 50);
		btnCalcular.setBackground(Color.lightGray);
		btnCalcular.setFont(new Font("Monospace", Font.PLAIN,20));
		//btnCalcular.setBorder(new Border(10));
		
		Color LightGreen = new Color(26, 164, 0);
		
		JLabel lblImc = new JLabel();
		lblImc.setText("");
		lblImc.setBounds(150, 400, 100, 30);
		lblImc.setFont(new Font("Monospace", Font.BOLD,20));
		lblImc.setForeground(LightGreen);
		
		Color DarkGreen = new Color(26, 129, 0);
		
		JLabel lblEstadoPessoa = new JLabel();
		lblEstadoPessoa.setText("");
		lblEstadoPessoa.setBounds(150, 450, 200, 30);
		lblEstadoPessoa.setFont(new Font("Monospace", Font.BOLD,20));
		lblEstadoPessoa.setForeground(DarkGreen);
		
		JLabel lblResultado = new JLabel();
		lblResultado.setText("Resultados:");
		lblResultado.setBounds(40, 350, 150, 30);
		lblResultado.setFont(new Font("Monospace", Font.BOLD,22));
		
		JLabel lblValorImc = new JLabel();
		lblValorImc.setText("Valor IMC:");
		lblValorImc.setBounds(40, 400, 100, 30);
		lblValorImc.setFont(new Font("Monospace", Font.PLAIN,15));
		
		
		JLabel lblEstado = new JLabel();
		lblEstado.setText("Estado IMC:");
		lblEstado.setBounds(40, 450, 100, 30);
		lblEstado.setFont(new Font("Monospace", Font.PLAIN,15));
		
		
		btnCalcular.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				String Peso = txtPeso.getText();
				String Altura = txtAltura.getText();
				
				double peso = Double.parseDouble(Peso);
				double altura = Double.parseDouble(Altura);
				
				double imc = peso / (altura * altura );
				
				lblImc.setText(String.valueOf(imc));
				
				
				if (imc < 18.5) {
					lblEstadoPessoa.setText("Abaixo do peso");
				} else if (imc >= 18.6 && imc <= 24.9) {
					lblEstadoPessoa.setText("Peso ideal");
				} else if (imc >= 25.0 && imc <= 29.9) {
					lblEstadoPessoa.setText("Acima do peso");
				} else if (imc >= 30 && imc <= 34.9) {
					lblEstadoPessoa.setText("Obesidade grau I");
				} else if (imc >= 35.0 && imc <= 39.9) {
					lblEstadoPessoa.setText("Obesidade grau II");
				} else {
					lblEstadoPessoa.setText("Obesidade grau III");
				}
				
			}
		});
		
		
		minhaTela.getContentPane().add(lblEstadoPessoa);
		minhaTela.getContentPane().add(lblEstado);
		minhaTela.getContentPane().add(lblImc);
		minhaTela.getContentPane().add(lblValorImc);
		minhaTela.getContentPane().add(lblResultado);
		minhaTela.getContentPane().add(btnCalcular);
		minhaTela.getContentPane().add(txtAltura);
		minhaTela.getContentPane().add(lblAltura);
		minhaTela.getContentPane().add(txtPeso);
		minhaTela.getContentPane().add(lblPeso);
		minhaTela.getContentPane().add(lblTitulo);
		
		
		
		
		minhaTela.setVisible(true);
	}
}
