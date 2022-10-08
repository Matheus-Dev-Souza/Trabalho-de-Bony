package Strategy;

public class Divisao  implements Icalcular {
	@Override
	public void fazerOperaçao(double...v) {
		System.out.println("Você escolheu a divisão dos numeros" );
		System.out.printf("%.1f / %.1f = %.1f \n", v[0],v[1], (v[0]/v[1]));
		
	}

}
