package Strategy;

public class Raiz implements Icalcular {

	@Override
	public void fazerOperaçao(double...v) {
		System.out.println("Você escolheu a raiz quadrada do numero");
		System.out.printf("A raiz de %.1f = %.2f", v[0], (Math.sqrt(v[0])));
		
	}


}
