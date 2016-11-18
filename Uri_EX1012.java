import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;


public class Uri_EX1012 {

	public static void main(String[] args) {
		//Escreva um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e mostre: 
		//a) a área do triângulo retângulo que tem A por base e C por altura. 
		//b) a área do círculo de raio C. (pi = 3.14159) 
		//c) a área do trapézio que tem A e B por bases e C por altura. 
		//d) a área do quadrado que tem lado B. 
		//e) a área do retângulo que tem lados A e B. 
		
		Locale.setDefault(Locale.US);
		DecimalFormat df = new DecimalFormat ("0.000");
		Scanner scan = new Scanner (System.in);
		
		double A,B,C;
		String D,E,F,G,H;
		
			A = scan.nextDouble();
			B = scan.nextDouble();
			C = scan.nextDouble();
			
				D = df.format(((A*C)/2));
				E = df.format((3.14159*Math.pow(C,2)));
				F = df.format(((C*(A+B))/2));
				G = df.format((Math.pow(B,2)));
				H = df.format((B*A));
		
		System.out.println("TRIANGULO: "+ D );
		System.out.println("CIRCULO: "+ E);
		System.out.println("TRAPEZIO: "+ F);
		System.out.println("QUADRADO: "+ G);
		System.out.println("RETANGULO: "+ H);
			
		
scan.close();		
	}

}
