import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;


public class Uri_EX1011 {

	public static void main(String[] args) {
		// Faça um programa que calcule e mostre o volume de uma esfera sendo fornecido o valor de seu raio (R).
		//A fórmula para calcular o volume é: (4/3) * pi * R3. Considere (atribua) para pi o valor 3.14159.

		Locale.setDefault(Locale.US);
		DecimalFormat df = new DecimalFormat("0.000");
		Scanner scan = new Scanner (System.in);
		
		double pi = 3.14159;
		double R,VOLUME;
		
		R = scan.nextDouble();
		
			VOLUME = ((4/3.0)*pi*Math.pow(R, 3));
			String dx = df.format(VOLUME);
			
		System.out.println("VOLUME = "+ dx);
		
scan.close();		
	}

}
