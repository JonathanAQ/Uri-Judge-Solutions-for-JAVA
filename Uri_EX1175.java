import java.util.Scanner;


public class Uri_EX1175 {

	public static void main(String[] args) {
		// Fa�a um programa que leia um vetor N[20]. 
		//Troque a seguir, o primeiro elemento com o �ltimo, o segundo elemento com o pen�ltimo, 
		//etc., at� trocar o 10� com o 11�. Mostre o vetor modificado.
		
		Scanner scan = new Scanner (System.in);
		int [] N = new int [6];
		int troca;
		
		
			for (int i = 0; i<N.length;i++){
				N[i]=scan.nextInt();
			}
			for(int i = 0,j = 5;i<6 && j>0;i++,j--){
				
					if(i<j){
						
						troca = N[i];
						
						N[i]=N[j];
						
						N[j]=troca;
							
					}
			}
			for(int i = 0; i<6;i++){
				System.out.println("N ["+i+"] = "+N[i]);
			}
scan.close();			
	}

}
