package prjFormas;

import javax.swing.JOptionPane;

public class Hexagono extends Forma{
	
	private double lado;

	
	Hexagono(double lado){
		this.lado = lado;

	}
	
	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}



	@Override
	public double calculaArea() {
		return (6*(lado*2) * Math.sqrt(3))/4;
	}
	
	public static Hexagono criaHexagono() {
		double lado = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite a medida do lado do hexagono","HEXAGONO",JOptionPane.QUESTION_MESSAGE));
		return new Hexagono(lado);
	}
}
