package Strategy;

public class Subtracao implements Icalcular {

	@Override
	public void fazerOperaçao(double...v) {
		System.out.println("Você escolheu a subtração dos numeros");
		System.out.printf("%.1f - %.1f = %.1f \n", v[0],v[1], (v[0]-v[1]));
		
	}

	

}
