package prjFormas;

import javax.swing.JOptionPane;

public class Trapezio  extends Forma {
	private double base;
	private double base2;
	private double altura;
	
	Trapezio(double base,double base2, double altura){
		this.base = base;
		this.base2 = base2;
		this.altura = altura;
	}
	
	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}
	
	public double getBase2() {
		return base2;
	}

	public void setBase2(double base2) {
		this.base2 = base2;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	@Override
	public double calculaArea() {
		return (base+base2)* altura/2;
	}
	
	public static Trapezio criaTrapezio() {
		double base = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite a medida da base do trapezio: ","TRAPEZIO",JOptionPane.QUESTION_MESSAGE));
		double base2 = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite a medida da segunda base do trapezio: ","TRAPEZIO",JOptionPane.QUESTION_MESSAGE));
		double altura = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite a medida da altura do trapezio: ","TRAPEZIO",JOptionPane.QUESTION_MESSAGE));
		return new Trapezio(base,base2, altura);
	}

}
