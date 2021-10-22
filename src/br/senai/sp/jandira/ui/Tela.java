package br.senai.sp.jandira.ui;


import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import br.senai.sp.jandira.model.Imc;


public class Tela {

	public void iniciar() {
		
		JFrame iniciar = new JFrame();
		iniciar.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		iniciar.setSize(400, 600);
		iniciar.setTitle("Calculadora de IMC");
		iniciar.setLayout(null);
		
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
				
				Imc imc = new Imc();
				
				imc.setPeso(txtPeso.getText());
				imc.setAltura(txtAltura.getText());
				
				lblImc.setText(imc.mostrarImcString());
				lblEstadoPessoa.setText(imc.MostrarStatusImc());

			}
		});
		
		iniciar.getContentPane().add(lblEstadoPessoa);
		iniciar.getContentPane().add(lblEstado);
		iniciar.getContentPane().add(lblImc);
		iniciar.getContentPane().add(lblValorImc);
		iniciar.getContentPane().add(lblResultado);
		iniciar.getContentPane().add(btnCalcular);
		iniciar.getContentPane().add(txtAltura);
		iniciar.getContentPane().add(lblAltura);
		iniciar.getContentPane().add(txtPeso);
		iniciar.getContentPane().add(lblPeso);
		iniciar.getContentPane().add(lblTitulo);
		
		
		
		
		iniciar.setVisible(true);
	}
}
