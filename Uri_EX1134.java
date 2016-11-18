import java.util.Scanner;


public class Uri_EX1134 {

	public static void main(String[] args) {
		//Exercício 1134 URI
		
	int x, ac = 0, gs = 0, ds = 0, fim = 0;
	Scanner scan = new Scanner (System.in);
	
		for(int i=0;i==0;){
			x = scan.nextInt();
				if(x<=4){
					switch (x){
				
					case 1:
						ac = ac + 1;
					case 2:
						gs = gs + 1;
					case 3:
						ds = ds +1;
					case 4:
						fim = 1;
						i = fim;
					}
				}
			}
		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: "+ac);
		System.out.println("Gasolina: "+gs);
		System.out.println("Diesel: "+ds);
	
scan.close();
	}

}
