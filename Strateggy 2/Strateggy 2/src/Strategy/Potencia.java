package Strategy;

public class Potencia implements Icalcular {

	@Override
	public void fazerOperaçao(double...v) {
		System.out.println("Você escolheu a pontencia dos numeros");
		System.out.printf("A potencia de %.1f= %.2f ",v[0],Math.pow(v[0], v[1]));
		
	}
		

}
