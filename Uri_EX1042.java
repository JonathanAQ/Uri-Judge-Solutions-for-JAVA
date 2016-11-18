import java.util.Scanner;


public class Uri_EX1042 {

	public static void main(String[] args) {
		//Leia 3 valores inteiros e ordene-os em ordem crescente. No final, 
		//mostre os valores em ordem crescente, uma linha em branco e em seguida, os valores na sequência como foram lidos.
		
		//Class
		Scanner scan = new Scanner (System.in);
				
				//Variavéis e vetores
				int [] numeros = new int [3];
				int [] memoria = new int [3];
				int ordenacao = 0;
				
				//Método para preenchimento do Vetor para ordenação e vetor de memória
				for(int i=0;i<3;i++){
					
					numeros [i] = scan.nextInt();
					memoria [i] = numeros [i];
				}
				//Método de Ordenação (ESTRUTURA DE REPETIÇÃO - BUBBLE SORT)
				for(int i=0;i<3;i++){
					for(int j=0;j<2;j++ ){
						if(numeros[j]>numeros[j+1]){
							
							ordenacao = numeros[j];
							numeros[j] = numeros[j+1];
							numeros[j+1] = ordenacao;
						}
					}
				}
				//Metodo de impressão do vetor ordenado (ESTRUTURA DE REPETIÇÃO)
				for(int i=0;i<3;i++){
					
					System.out.println(numeros[i]);
					
				}
				
				System.out.println();
				
				//Metodo de impressão do vetor digitado (ESTRUTURA DE REPETIÇÃO)
				for(int i=0;i<3;i++){
					
					System.out.println(memoria[i]);
				}
				 
		scan.close();		
	}

}
