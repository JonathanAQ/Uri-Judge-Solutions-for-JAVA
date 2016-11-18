import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;


public class Uri_EX1183 {

	public static void main(String[] args) {
		// Leia um caractere mai�sculo, que indica uma opera��o que deve ser realizada e uma matriz M[12][12]. 
		//Em seguida, calcule e mostre a soma ou a m�dia considerando somente aqueles elementos que 
		//est�o acima da diagonal principal da matriz, conforme ilustrado abaixo (�rea verde).
		
		
		//Class
		Locale.setDefault(Locale.US);
		DecimalFormat df = new DecimalFormat("0.0");
		Scanner scan = new Scanner (System.in);
				
			//Arrays e Variaveis
			double [][] M = new double [12][12];
			double soma = 0; 
			char O;
			int cont;
			String dx;
				
				//M�todo para armazenar a variavel de calculo
				O = scan.next().charAt(0);
						
				//M�todo para preencher o Array
				for(int i = 0;i<M.length;i++){
					for(int j =0;j<M.length;j++){
								
						M[i][j] = scan.nextDouble();
					}
				}
					//M�todo para executar os calculos (ESTRUTURA DE SELE��O - SWITCH/CASE)
					switch (O){
						//M�todo para realizar soma (ESTRUTURA DE REPETI��O)
						case 'S': 
							for(int i =0;i<12;i++){
								cont = i + 1;
								for(int j = cont; j<12 ;j++){
											
									soma = soma + M[i][j];
								}
							}
							dx = df.format(soma);
							System.out.println(dx);
							break;
								//M�todo para realizar m�dia (ESTRUTURA DE REPETI��O)
						case 'M':
							for(int i =0;i<12;i++){
								cont = i + 1;
								for(int j = cont; j<12 ;j++){
											
									soma = soma + M[i][j];
								}
							}
							soma = soma/66;
							dx = df.format(soma);
							System.out.println(dx);
							break;
					}
						
						
scan.close();
	}

}
