package prjFormas;

import javax.swing.JOptionPane;

public class Retangulo extends Forma {
	
	private double base;
	private double altura;
	
	Retangulo(double base, double altura){
		this.base = base;
		this.altura = altura;
	}
	
	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	@Override
	public double calculaArea() {
		return base*altura;
	}
	
	public static Triangulo criaRetangulo() {
		double base = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite a Base","RETANGULO",JOptionPane.QUESTION_MESSAGE));
		double altura = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite a Altura","RETANGULO",JOptionPane.QUESTION_MESSAGE));
		return new Triangulo(base, altura);
	}

}
