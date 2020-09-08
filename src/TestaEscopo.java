
public class TestaEscopo {
	public static void main(String[] args) {
		
		// Variaveis locais, dentro de ume scopo fechado, não possuem valores padrão.
		// Ou seja, o Java nem compila!!! Precisamos atribuir um valor dentro de um escopo para compilar.
		
		
		System.out.println("Testanco condicionais");

		int idade = 15;
		int quantidadePessoas = 3;

		boolean acompanhado;

		// temos o ou = ||; e = &&

		if (quantidadePessoas >= 2) {
			acompanhado = true;
		} else {
			acompanhado = false;
		}

		System.out.println("valor de acompanhado = " + acompanhado);

		if (idade >= 18 && acompanhado) {
			System.out.println("Seja bem vindo");
		} else {
			System.out.println("infelizmente você não pode entrar");
		}

	}
}
