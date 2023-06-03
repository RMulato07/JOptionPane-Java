package prjFormas;

import java.util.Scanner;

public abstract class Leitura {
	
	
	public static int lerInt() {
		Scanner in = new Scanner(System.in);
		int valor = in.nextInt();
		return valor; 
	}
	
	public static double lerDouble() {
		Scanner in = new Scanner(System.in);
		double valor = in.nextDouble();
		return valor; 
	}
	
}
