import java.math.BigDecimal;
import java.util.Locale;
import java.util.Scanner;


public class Uri_Ini_EX1040 {

	public static void main(String[] args) {
		// Leia quatro números (N1, N2, N3, N4), 
		//cada um deles com uma casa decimal, correspondente às quatro notas de um aluno.
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner (System.in);
		
			double N1,N2,N3,N4,MEDIA,NF,MF;
			
				//Solicitando os valores;
				N1 = scan.nextDouble();
				N2 = scan.nextDouble();
				N3 = scan.nextDouble();
				N4 = scan.nextDouble();
				
					//calculando as médias;
					N1 = N1*2;
					N2 = N2*3;
					N3 = N3*4;
					N4 = N4*1;
					MEDIA = (N1+N2+N3+N4)/10;
					
						//Método para verificar os resultados;
						if(MEDIA>=7.0){
							//Biblioteca usada para setar a quantidade de caracteres de um double
							BigDecimal bg = new BigDecimal(MEDIA);
							System.out.println("Media: "+bg.setScale(1, BigDecimal.ROUND_DOWN));
							System.out.println("Aluno aprovado.");
							
							}else if(MEDIA<5.00){
								BigDecimal bg = new BigDecimal(MEDIA);
								System.out.println("Media: "+bg.setScale(1, BigDecimal.ROUND_DOWN));
								System.out.println("Aluno reprovado.");
								
								}else if(MEDIA==5.00 && MEDIA<7.00){
									BigDecimal bg = new BigDecimal(MEDIA);
									System.out.println("Media: "+bg.setScale(1, BigDecimal.ROUND_DOWN));
									System.out.println("Aluno em exame.");
							
										//Solicitando a nota do exame final
										NF = scan.nextDouble();
										MF = (NF+MEDIA)/2;
										
											//Método para verificar o resultado da final(dentro do else)
											if(MF>=5.00){
												BigDecimal bh = new BigDecimal(NF);
												BigDecimal bj = new BigDecimal(MF);
												System.out.println("Nota do exame: "+bh.setScale(1, BigDecimal.ROUND_DOWN));
												System.out.println("Aluno aprovado.");
												System.out.println("Media: "+bj.setScale(1, BigDecimal.ROUND_DOWN));
												
												}else {
													BigDecimal bh = new BigDecimal(NF);
													BigDecimal bj = new BigDecimal(MF);
													System.out.println("Nota do exame: "+bh.setScale(1, BigDecimal.ROUND_DOWN));
													System.out.println("Aluno reprovado.");
													System.out.println("Media: "+bj.setScale(1, BigDecimal.ROUND_DOWN));
												}
							
											}
					
scan.close();			
	}

}
