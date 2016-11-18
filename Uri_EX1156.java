import java.text.DecimalFormat;
import java.util.Locale;


public class Uri_EX1156 {

	public static void main(String[] args) {
		// Escreva um algoritmo para calcular e escrever o valor de S, sendo S dado pela fórmula:
		//S = 1 + 3/2 + 5/4 + 7/8 + ... + 39/?
		
		//Class
		Locale.setDefault(Locale.US);
		DecimalFormat df = new DecimalFormat("0.00");
		
		
		// Variaveis
		String dx;
		double S =1.00;
		
			//Calculando o valor de S
			for(double i = 3.00, j=2.00;i<40.00;i=i+2,j=j*2){
				S = S + (i/j);
			}
		dx = df.format(S);	
		System.out.println(dx);
	}

}
