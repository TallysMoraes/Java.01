
public class TesteDePooII_Nota {

	public static void main(String[] args) {
		double p1 = 8.5;
		double p2 = 5.0;
		double p3 = 9.2;
		
		double notaFinal = p1 +p2 + p3;
		
		if(notaFinal < 7.0) {
			System.out.printf("Sua media foi de: %.1f", (notaFinal /3) + " Infelizmente você foi reprovadpo");
			
		}else if(notaFinal >= 7.0) {
			System.out.printf("Sua nota foi de: %.1f", (notaFinal /3) + " Parabens você foi aprovado!");
			}
		}
	}