package prjFormas;

import javax.swing.JOptionPane;

public class Triangulo extends Forma {

	private double base;
	private double altura;
	
	Triangulo(double base, double altura){
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
		return base*altura/2;
	}
	
	public static Triangulo criaTriangulo() {
		double base = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite a medida da base do triangulo","TRIANGULO",JOptionPane.QUESTION_MESSAGE));
		double altura = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite a medida da altura do triangulo","TRIANGULO",JOptionPane.QUESTION_MESSAGE));
		return new Triangulo(base, altura);
	}
	
	
}
