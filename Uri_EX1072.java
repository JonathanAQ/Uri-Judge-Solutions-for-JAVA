import java.util.Locale;
import java.util.Scanner;


public class Uri_EX1072 {

	public static void main(String[] args) {
		// Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
		//Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando essas informações.
		
		//Class	
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner (System.in);
	
			//Variaveis
			int N;
			int in = 0;
			int out = 0;
		
				//Armazenando valores
				N = scan.nextInt();
			
				int [] n = new int[N];
				
					//metodo para preenchimento do array (casos e numeros de testes)
					for(int i = 0; i<N; i++){
						n[i] = scan.nextInt();
					}
				
					//Metodo para verificar se o numero se encontra dentro ou fora do intervalo
					for(int i = 0; i<N; i++){
						if(n[i]>=10 && n[i]<=20){
							in = in +1;
						}else {
							out = out +1;
						}
					}
				
					//Impressão de resultados
					System.out.println(in + " in");
					System.out.println(out+" out");
scan.close();				
	}

}
