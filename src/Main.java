import other.Util;

public class Main {

	public static void main(String[] args) {		
		Util u = new Util();		
		
		double valor1 = u.LerDouble("Digite o primeiro n�mero: ");
		double valor2 = u.LerDouble("Digite o segundo n�mero: ");
		
		
		// SOMANDO VALORES
		double resultado = u.Soma(valor1, valor2);		
		//u.Imprimir("O resultado da soma �: " + resultado);
		u.Log("O resultado da soma �: " + resultado);
		
		//SUBTRAINDO VALORES
		//resultado = u.Subtrai(4, 3);
		//u.Imprimir("O resultado da subtra��o �: " + resultado);			
		

	}

}
