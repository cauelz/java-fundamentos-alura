
public class TestaPontoFlutuante {
	
	public static void main(String[] args) {
		
		double salario;
		salario = 1250.70;
		System.out.println("meu salario � " + salario);
		
		double idade = 28;
		
		double divisao = 3.14 / 2;
		
		System.out.println("a minha idade � " + idade);
		System.out.println("a divis�o � " + divisao);
		
		// ele vai truncar e retornar um n�mero inteiro
		int outraDivisao = 5 / 2;
		System.out.println(outraDivisao);
		
		// veja que esquisito, ele ainda retorna inteiro
		// para arrumar, basta ajustar um dos numeros para double
		double novaTentativa = 5.0 / 2;
		System.out.println(novaTentativa);
		
		
	}
}
