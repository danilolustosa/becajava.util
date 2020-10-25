import other.Util;

public class Main {

	public static void main(String[] args) {		
		Util u = new Util();		
		
		double valor1 = u.LerDouble("Digite o primeiro número: ");
		double valor2 = u.LerDouble("Digite o segundo número: ");
		
		
		// SOMANDO VALORES
		double resultado = u.Soma(valor1, valor2);		
		//u.Imprimir("O resultado da soma é: " + resultado);
		u.Log("O resultado da soma é: " + resultado);
		
		//SUBTRAINDO VALORES
		//resultado = u.Subtrai(4, 3);
		//u.Imprimir("O resultado da subtração é: " + resultado);			
		

	}

}
