package br.senai.sp.jandira.model;

public class Imc {

	private double altura;
	private double peso;
	
	
	public void setAltura(String altura) {
		this.altura = Double.parseDouble(altura);
	}
	
	public double getAltura() {
		return this.altura;
	}
	
	public void setPeso(String peso) {
		this.peso = Double.parseDouble(peso);
	}
	
	public double getPeso() {
		return this.peso;
	}

	public double calcularImc() {
		double imc = peso / Math.pow(altura, 2);
		return imc;
	}
	
	public String mostrarImcString() {
		return String.valueOf(calcularImc());
	}
	
	public String MostrarStatusImc() {
		
		if (calcularImc() < 18.5) {
			return "Abaixo do Peso!";
		} else if ( calcularImc() >= 18.6 && calcularImc() < 25) {
			return "Peso ideal";
		} else if (calcularImc() >= 25.0 && calcularImc() < 30) {
			return "Acima do Peso";
		} else if (calcularImc() >= 30 && calcularImc() < 35) {
			return "Obesidade Grau I";
		} else if (calcularImc() >= 35.0 && calcularImc() < 40) {
			return "Obesidade Grau II";
		} else {
			return "Obesidade Grau III";
		}
	}
}
