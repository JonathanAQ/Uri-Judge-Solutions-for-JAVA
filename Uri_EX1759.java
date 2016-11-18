import java.util.Locale;
import java.util.Scanner;


public class Uri_EX1759 {

	public static void main(String[] args) {
		// Papai Noel está brincando com seus duendes para entretê-los durante a véspera do Natal. 
		//A brincadeira consiste nos elfos escreverem números em pedaços de papel e colocarem no gorro do Papai Noel. 
		//Após todos terminarem de colocar os números Noel sorteia um papel e aquele número representa quantos "Ho" o Noel deve falar.
		//Seu trabalho é ajudar o Papai Noel montando um problema que mostre todos os "Ho" que ele deve falar dado o número sorteado.
		
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
