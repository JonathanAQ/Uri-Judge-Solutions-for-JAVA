import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;


public class Uri_EX1182 {

	public static void main(String[] args) {
		// Neste problema voc� deve ler um n�mero que indica uma coluna de uma matriz na qual uma opera��o deve ser realizada, 
		//um caractere mai�sculo, indicando a opera��o que ser� realizada, e todos os elementos de uma matriz M[12][12]. 
		//Em seguida, calcule e mostre a soma ou a m�dia dos elementos que est�o na �rea verde da matriz, conforme for o caso. 
		//A imagem abaixo ilustra o caso da entrada do valor 5 para a coluna da matriz, 
		//demonstrando os elementos que dever�o ser considerados na opera��o.

		Locale.setDefault(Locale.US);
		DecimalFormat df = new DecimalFormat("0.0");
		Scanner scan = new Scanner (System.in);
		
			double [][] M = new double [12][12];
			int C;
			double soma = 0; 
			char T;
			String dx;
			
				C = scan.nextInt();
				T = scan.next().charAt(0);
				
				for(int i =0;i<M.length;i++){
					for(int j =0;j<M.length;j++){
						
						M[i][j] = scan.nextDouble();
					}
				}
				
				if(C>=0 && C<C+1){
					switch (T){
					
						case 'S': 
							for(int i = 0; i<M.length ;i++){
								
								soma = soma + M[i][C];
							}	
							dx = df.format(soma);
							System.out.println(dx);
							break;
							
						case 'M':
							for(int i = 0; i<M.length ;i++){
								
								soma = soma + M[i][C];
							}	
							soma = soma/12;
							dx = df.format(soma);
							System.out.println(dx);
							break;
					}
				}
				
scan.close();				

	}
}
