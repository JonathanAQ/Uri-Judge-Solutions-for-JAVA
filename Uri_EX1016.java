import java.util.Locale;
import java.util.Scanner;


public class Uri_EX1016 {

	public static void main(String[] args) {
		// Dois carros (X e Y) partem em uma mesma direção. O carro X sai com velocidade constante de 60 Km/h e o carro Y sai com velocidade constante de 90 Km/h.
		//Em uma hora (60 minutos) o carro Y consegue se distanciar 30 quilômetros do carro X, ou seja, consegue se afastar um quilômetro a cada 2 minutos.
		//Leia a distância (em Km) e calcule quanto tempo leva (em minutos) para o carro Y tomar essa distância do outro carro.

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner (System.in);
		
			//Variaveis e Armazenameto de valores
			int X;
			X = scan.nextInt();
				//Realizando os calculos
				X = X*2;
		//Imprimindo valores		
		 System.out.println(X +" minutos");
		
		
scan.close();		
	}

}
