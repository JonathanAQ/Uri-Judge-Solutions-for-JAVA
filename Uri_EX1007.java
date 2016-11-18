import java.util.Scanner;


public class Uri_EX1007 {

	public static void main(String[] args) {
		// Leia quatro valores inteiros A, B, C e D. 
		//A seguir, calcule e mostre a diferença do produto de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).
		
		Scanner scan = new Scanner (System.in);
		
			int A,B,C,D,DIFERENCA;
			
				A = scan.nextInt();
				B = scan.nextInt();
				C = scan.nextInt();
				D = scan.nextInt();
			
					DIFERENCA = ((A*B)-(C*D));
					
				System.out.println("DIFERENCA = "+ DIFERENCA);
		
		
scan.close();
	}

}
