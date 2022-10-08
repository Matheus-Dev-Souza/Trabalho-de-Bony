package Strategy;

public class ContextMath {
	
	private Icalcular opera;

	public void setOpera(Icalcular opera) {
		this.opera = opera;
	}
	
	public void calcular(double n1, double n2) {
		this.opera.fazerOperaçao(n1, n2);
		
	}
	

}
