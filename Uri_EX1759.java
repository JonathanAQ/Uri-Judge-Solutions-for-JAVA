import java.util.Locale;
import java.util.Scanner;


public class Uri_EX1759 {

	public static void main(String[] args) {
		// Papai Noel est� brincando com seus duendes para entret�-los durante a v�spera do Natal. 
		//A brincadeira consiste nos elfos escreverem n�meros em peda�os de papel e colocarem no gorro do Papai Noel. 
		//Ap�s todos terminarem de colocar os n�meros Noel sorteia um papel e aquele n�mero representa quantos "Ho" o Noel deve falar.
		//Seu trabalho � ajudar o Papai Noel montando um problema que mostre todos os "Ho" que ele deve falar dado o n�mero sorteado.
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner (System.in);
		int N;
		int W;
		
			N = scan.nextInt();
			W = 0;
			
			
			if(N>=0 && N<=Math.pow(10,6)){
				
				while(W<N-1){
					
					if(W<N-1){
						System.out.print("Ho ");
						W++;
					}
				}
				
				if(N>0){
			System.out.println("Ho!");
				}
			}
			
scan.close();			
	}

}
