import java.util.Scanner;


public class Uri_EX1071 {

	public static void main(String[] args) {
		// Leia 2 valores inteiros X e Y. A seguir, calcule e mostre a soma dos números impares entre eles.
		
		//Class
		Scanner scan = new Scanner (System.in);
			
			//Variaveis
			int X,Y;
			int soma = 0;
				
				//Armazenando os valores
				X = scan.nextInt();
				Y = scan.nextInt();
			
					//Método para realizar a soma quando X for maior que Y
					if(X>Y){
						for(int i = Y; i<X;i++){
							if(i%2!=0 && i!=Y){
								soma = i + soma;
							}
						}
					}
					
					//Método para realizar a soma quando X for menor que Y
					if(X<Y){
						for(int i = X; i<Y;i++){
							if(i%2!=0 && i!=X){
								soma = i + soma;
							}
						}
					}
					
					System.out.println(soma);
scan.close();					
	}

}
