import java.util.Scanner;


public class Uri_EX1173 {

	public static void main(String[] args) {
		//Leia um valor e fa�a um programa que coloque o valor lido na primeira posi��o de um vetor N[10]. Em cada posi��o subsequente, 
		//coloque o dobro do valor da posi��o anterior. Por exemplo, se o valor lido for 1, os valores do vetor devem ser 1,2,4,8 e assim sucessivamente. 
		//Mostre o vetor em seguida.

		//Class
		Scanner scan = new Scanner (System.in);

			//Variaveis
			int V;
			int [] N = new int [10];
			
				//Armazenamento de valores
				V = scan.nextInt();
				N[0] = V;
				
					//Metodo para o restante do vetor com os valores (ESTRUTURA DE SELE��O - ESTRUTURA DE REPETI��O)
					if (V<=50){
						for(int i = 1; i<10; i++){
							N[i] = N[i-1]*2;
						}
					}
		
						//Metodo para imprimir o vetor (ESTRUTURA DE REPETI��O)
					for(int i = 0; i<10; i++){
						System.out.println("N["+i+"] = "+N[i]);
					}
		
		
scan.close();		
	}

}
