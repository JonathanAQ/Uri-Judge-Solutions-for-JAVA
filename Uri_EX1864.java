import java.util.Scanner; 
public class Uri_EX1864 {

	public static void main(String[] args) {
		
		//API's
		Scanner scan = new Scanner (System.in);
				
			//Variaveis
			char [] F = {'L','I','F','E',' ','I','S',' ','N','O','T',' ','A',' ','P','R','O','B','L','E','M',' ','T','O',' ','B','E',' ','S','O','L','V','E','D'};
			//FRASE:LIFE IS NOT A PROBLEM TO BE SOLVED
			int N;
					
				//Armazenando valores
				N = scan.nextInt();
					
					//Metodo para realizar a impressão da frase de acordo com a quantidade de caracteres autorizados
					if(N>0 && N<=34){
						for(int i = 0; i<N;i++){
							System.out.print(F[i]);
						}
					System.out.println("");
					}
scan.close();		
	}
}
