import java.util.Locale;
import java.util.Scanner;


public class Uri_EX1037 {

	public static void main(String[] args) {
		// Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo em qual dos seguintes intervalos 
		//([0,25], (25,50], (50,75], (75,100]) este valor se encontra. 
		//Obviamente se o valor não estiver em nenhum destes intervalos, deverá ser impressa a mensagem “Fora de intervalo”.

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner (System.in);
		
		double A;
		
			A = scan.nextDouble();
			
				if(A>=0 && A<=25.0000){
					System.out.println("Intervalo [0,25]");
					}else if (A>=25.00001 && A<=50.0000){
						System.out.println("Intervalo (25,50]");
						}else if (A>=50.00001 && A<=75.0000){
							System.out.println("Intervalo (50,75]");
							}else if (A>=75.00001 && A<=100.0000){
								System.out.println("Intervalo (75,100]");
								}else{
									System.out.println("Fora de intervalo");
								}
scan.close();				
	}

}
