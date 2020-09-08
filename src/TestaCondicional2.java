
public class TestaCondicional2 {
	public static void main(String[] args) {
		System.out.println("Testanco condicionais");
		int idade = 15;
		int quantidadePessoas = 3;
		boolean acompanhado = quantidadePessoas >= 2;
		
		// temos o ou = ||; e = &&
		
		if (idade >= 18 && acompanhado) {
			System.out.println("Seja bem vindo");
		} else {
			System.out.println("infelizmente você não pode entrar");
		}
		
	}
}
