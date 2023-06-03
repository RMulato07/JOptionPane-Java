package prjFormas;
import javax.swing.JOptionPane;

public class Principal {
		public static void main(String[] args) {
		
			Forma forma = null;
			int resp=0;		
			
			
			while(resp != 7) { 
				resp = Integer.parseInt(JOptionPane.showInputDialog(null,"1-Quadrado \n 2-Retangulo \n 3- Losango \n"
						+ " 4-Losango \n 5-Trapezio \n 6-Hexagono \n 7- Fechar","QUAL FORMA VOCE DESEJA ? ",JOptionPane.QUESTION_MESSAGE));
					switch (resp) {
					case 1:
						forma = Quadrado.criaQuadrado();
						JOptionPane.showMessageDialog(null,"RESULTADO  "+forma.calculaArea()," FORMAS GEOMETRICAS ",JOptionPane.INFORMATION_MESSAGE);
						break;
						
					case 2:
						forma = Retangulo.criaRetangulo();
						JOptionPane.showMessageDialog(null,"RESULTADO  "+forma.calculaArea()," FORMAS GEOMETRICAS ",JOptionPane.INFORMATION_MESSAGE);
						break;
						
					case 3:
						forma = Losango.criaLosango();
						JOptionPane.showMessageDialog(null,"RESULTADO  "+forma.calculaArea()," FORMAS GEOMETRICAS ",JOptionPane.INFORMATION_MESSAGE);
						break;
						
					case 4:
						forma = Hexagono.criaHexagono();
						JOptionPane.showMessageDialog(null,"RESULTADO  "+forma.calculaArea()," FORMAS GEOMETRICAS ",JOptionPane.INFORMATION_MESSAGE);
						break;
						
					case 5:
						forma = Trapezio.criaTrapezio();
						JOptionPane.showMessageDialog(null,"RESULTADO  "+forma.calculaArea()," FORMAS GEOMETRICAS ",JOptionPane.INFORMATION_MESSAGE);
						break;
						
					case 6:
						forma = Triangulo.criaTriangulo();
						break;
					case 7:
						JOptionPane.showMessageDialog(null,"PROGRAMA FECHADO.","",JOptionPane.INFORMATION_MESSAGE);
						break;
						default:JOptionPane.showMessageDialog(null,"digite um numero de 1 a 6 ou 7 para fechar o programa","ERRO",JOptionPane.ERROR_MESSAGE);;
						
		
					}
				
			}
				
			
				}
			
}
