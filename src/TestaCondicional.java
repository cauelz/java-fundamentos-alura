
public class TestaCondicional {

	public static void main(String[] args) {
		System.out.println("Testanco condicionais");
		int idade = 15;
		int quantidadePessoas = 3;
		
		if (idade >= 18) {
			System.out.println("Voc� tem mais de 18 anos");
			System.out.println("Seja bem vindo");
		} else {
			if (quantidadePessoas >= 2) {
				System.out.println("voc� nao tem 18, mas pode entrar, pois est� acompanhado");
			} else {
				System.out.println("infelizmente voc� n�o pode entrar");
			}	
		}
		
		
	}
}
