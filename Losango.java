package prjFormas;

import javax.swing.JOptionPane;

public class Losango extends Forma {
	private double diagonalMaior;
	private double diagonalMenor;
	
	Losango(double diagonalMaior, double diagonalMenor){
		this.diagonalMaior = diagonalMaior;
		this.diagonalMenor = diagonalMenor;
	}
	
	public double getDiagonalMaior() {
		return diagonalMaior;
	}

	public void setDiagonalMaior(double diagonalMaior) {
		this.diagonalMaior = diagonalMaior ;
	}

	public double getDiagonalMenor() {
		return diagonalMenor;
	}

	public void setDiagonalMenor(double diagonalMaior) {
		this.diagonalMaior = diagonalMaior;
	}

	@Override
	public double calculaArea() {
		return diagonalMaior*diagonalMenor/2;
	}
	
	public static Triangulo criaLosango() {
		double diagonalMaior = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite a diagonal maior: ","LOSANGO",JOptionPane.QUESTION_MESSAGE));
		double diagonalMenor = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite a diagonal menor: ","LOSANGO",JOptionPane.QUESTION_MESSAGE));
		return new Triangulo(diagonalMaior,diagonalMenor);
	}

}
