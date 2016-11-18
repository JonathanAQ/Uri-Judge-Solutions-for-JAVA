import java.util.Scanner;


public class Uri_EX1013 {

	public static void main(String[] args) {
		// Descobrir o maior valor entre 3 numros utilizando a formula.
		
  Scanner scan = new Scanner (System.in);
  
		
		int a,b, c, maior;
	
		a = scan.nextInt();
		b = scan.nextInt();
		c = scan.nextInt();
		
			//Utilizar a biblioteca Math.abs que retorna o valor absoluto.
			maior = ((a + b + Math.abs(a-b))/2);
		
				maior = ((maior + c + Math.abs(maior - c))/2);
		
		System.out.println(maior+" eh o maior");
		
scan.close();		
	}

}
