package Strategy;

public class Multiplicacao  implements Icalcular {
	@Override
	public void fazerOperaçao(double...v) {
		System.out.println("Você escolheu a multiplicação dos numeros");
		System.out.printf("%.1f x %.1f = %.2f \n", v[0],v[1], (v[0]*v[1]));
		
	}
}
