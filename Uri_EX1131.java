import java.util.Scanner;


public class Uri_EX1131 {

	public static void main(String[] args) {
		// A Federação Gaúcha de Futebol contratou você para escrever um programa para fazer uma estatística do resultado de vários GRENAIS.
		
			//Class
			Scanner scan = new Scanner (System.in);
			
				//Variaveis
				int jogos,pinter,pgremio;
				int inter = 0;
				int gremio = 0;
				int empate = 0;
				int sim = 1;
				
					//Metodo para realizar os jogos
					while (sim == 1){
						//Obtendo os placares
						pinter = scan.nextInt();
						pgremio = scan.nextInt();
						
							//Calculando e armazenando a quantidade de vitórias derrotas e empates, e total de jogos.
							if(pinter > pgremio){
								inter = inter +1;
							}else if (pgremio > pinter){
								gremio = gremio +1;
							}else if (pinter == pgremio){
								empate = empate + 1;
							}
								jogos = inter+gremio+empate;
							
									//Solicitando novo grenal
									System.out.println("Novo grenal (1-sim 2-nao)");
										sim = scan.nextInt();
								
										//Metodo para repetição ou exibição dos resustados
										
										//caso seja sim o metodo repete a partir daqui.
										if(sim == 1){
											sim = 1;
										//caso seja não o Método da seguimento e imprime os resultados	
										}else {	
											System.out.println(jogos+" grenais");
											System.out.println("Inter:"+inter);
											System.out.println("Gremio:"+gremio);
											System.out.println("Empates:"+empate);
												
												//Metodo para informar que ganhou mais
												if (inter>gremio){
													System.out.println("Inter venceu mais");
												}else if (gremio>inter){
													System.out.println("Gremio venceu mais");
												}
										}
					}
				
scan.close();
	}

}
