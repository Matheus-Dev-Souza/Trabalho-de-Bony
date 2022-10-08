package Strategy;

public class Soma implements Icalcular {

	@Override
	public void fazerOperaçao(double...v) {
		System.out.println("Você escolheu a soma dos numeros");
		System.out.printf("%.1f + %.1f = %.2f \n", v[0],v[1], (v[0]+v[1]));
		
	}
}
