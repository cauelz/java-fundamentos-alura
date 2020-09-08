
public class TestaCaracteres {

	public static void main(String[] args) {
		// char serve para guardar um caracter
		// e temos que usar ''
		// por mais que possamos guardar uma letra, ele na verdade, guarda um numero.
		char letra = 'a';
		System.out.println(letra);
		
		// Veja que vai retornar uma letra
		char valor = 66;
		System.out.println(valor);
		
		// um detalhe importante, se tentarmos realizar a soma valor = valor + 1, o Java não vai deixar compilar
		// isso acontece porque estamos tentando somar um char com um int.
		// esta soma vai retornar a variavel Maior, que no caso é o Int.
		// Lembre-se que um Char cabe dentro de um Int, mas não o inverso
		
		valor = (char) (valor + 1);
		System.out.println(valor);
		
		// Veja com podemos guardar Strings
		// somos obrigado a utilizar aspas duplas
		// As strings NÃO são do tipo primitivas
		String palavra = "Alura cursos online de tecnologia";
		
		System.out.println(palavra);
		
		// podemos concatenar strings usando o operador +
		
		palavra = palavra + 2020;
		
		System.out.println(palavra);
	}
}
