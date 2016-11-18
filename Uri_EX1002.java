import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;


public class Uri_EX1002 {

	public static void main(String[] args) {
		// EXERCICO 1002
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner (System.in);
		DecimalFormat df = new DecimalFormat("0.0000");	
		
			double area,Raio;
			double π = 3.14159;
			
				Raio = scan.nextDouble();
				
					area = π*Math.pow(Raio, 2);
					
					String dx = df.format(area);
		
			System.out.println("A="+dx);
			
		
		
scan.close();

	}

}
