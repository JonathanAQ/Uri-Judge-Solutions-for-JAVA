import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;


public class Uri_EX1017 {

	public static void main(String[] args) {
		// Joaozinho quer calcular e mostrar a quantidade de litros de combust�vel gastos em uma viagem, 
		//ao utilizar um autom�vel que faz 12 KM/L. Para isso, ele gostaria que voc� o auxiliasse atrav�s de um simples programa. 
		//Para efetuar o c�lculo, deve-se fornecer o tempo gasto na viagem (em horas) e a velocidade m�dia durante a mesma (em km/h).
		//Assim pode-se obter dist�ncia percorrida e em seguida calcular quantos litros seriam necess�rios. 
		//Mostre o valor com 3 casas decimais ap�s o ponto.
		
		Locale.setDefault(Locale.US);
		DecimalFormat df = new DecimalFormat("0.000");
		Scanner scan = new Scanner (System.in);
		
			int HV,KM;
			double GT;
			double KL = 12.000;
			String dx;
				HV = scan.nextInt();
				KM = scan.nextInt();
				
					GT = ((HV*KM)/KL);
					
					dx = df.format(GT);
						System.out.println(dx);
		
scan.close();		
	}

}
