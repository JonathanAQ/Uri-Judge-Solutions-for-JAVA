import java.text.DecimalFormat;
import java.util.Locale;


public class EX_EX1155 {

	public static void main(String[] args) {
		// Escreva um algoritmo para calcular e escrever o valor de S, sendo S dado pela fórmula:
		//S = 1 + 1/2 + 1/3 + … + 1/100

		//Class
        Locale.setDefault(Locale.US);
        DecimalFormat df = new DecimalFormat("0.00");
         
         
        // Variaveis
        String dx;
        double S = 1.00;
         
            //Calculando o valor de S
            for(int i = 2;i<101;i++){
                S = S + (1.00/i);
            }
            
        dx = df.format(S);
        System.out.println(dx);
        
	}

}
