package Strategy;

import java.util.Scanner;

public class CalcOne {
	public static void main(String [] arg) {
		ContextMath  operacao = new ContextMath ();
		Scanner tela= new Scanner(System.in);
		System.out.println("Bem vindo a calculador");
		System.out.println("Escolha a sua opcção");
		System.out.println("1. somar");
		System.out.println("2. subtrair");
		System.out.println("3. dividir");
		System.out.println("4. multiplicar");
		System.out.println("5. pontencia do numero");
		System.out.println("6. raiz do numero");
		System.out.println("7. Sair");
		
		System.out.print("DIGITE A SUA OPÇÃO:");
		int opc= tela.nextInt();
		
		System.out.print("DIGITE UM VALOR:");
		double n1= tela.nextDouble();
		System.out.print("DIGITE UM VALOR:");
		double n2= tela.nextDouble();
		
		 switch (opc) {
		case 1: {
			operacao.setOpera(new Soma());
			operacao.calcular(n1, n2);
			break;
		}
		case 2: {
			operacao.setOpera(new Subtracao());
			operacao.calcular(n1, n2);
			break;
		}
		
		case 3: {
			operacao.setOpera(new Divisao());
			operacao.calcular(n1, n2);
			break;
		}
		case 4: {
			operacao.setOpera(new Multiplicacao());
			operacao.calcular(n1, n2);
			break;
		}
		
		case 5: {
			operacao.setOpera(new Potencia());
			operacao.calcular(n1, n2);
			break;
		}
		
		case 6: {
			operacao.setOpera(new Raiz() );
			operacao.calcular(n1, n2);
			break;
		}
		case 7: {
			System.out.println("Finalizando Operação");
			break;
		}
			
		}
		
		
	}
}
