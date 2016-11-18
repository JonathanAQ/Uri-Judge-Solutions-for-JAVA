import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;


public class Uri_EX1182 {

	public static void main(String[] args) {
		// Neste problema você deve ler um número que indica uma coluna de uma matriz na qual uma operação deve ser realizada, 
		//um caractere maiúsculo, indicando a operação que será realizada, e todos os elementos de uma matriz M[12][12]. 
		//Em seguida, calcule e mostre a soma ou a média dos elementos que estão na área verde da matriz, conforme for o caso. 
		//A imagem abaixo ilustra o caso da entrada do valor 5 para a coluna da matriz, 
		//demonstrando os elementos que deverão ser considerados na operação.

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
