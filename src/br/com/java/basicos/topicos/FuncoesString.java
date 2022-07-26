package br.com.java.basicos.topicos;

public class FuncoesString {

	public static void main(String[] args) {

		String nome = "igorleon FERREIRA BERNARDO";
		String lower = nome.toLowerCase(); // função pra deixar uma String completamente minuscula
		String Upper = nome.toUpperCase(); // função pra deixar uma String completamente MAIUSCULA
		String trim = nome.trim(); // função para eliminar todos os espaços
		String subString = nome.substring(2); // função para iniciar String a partir da posição escolhida
		String subString2 = nome.substring(0, 9); // recortar a partir do inicio ao fim escolhidos
		String replace = nome.replace('i', 'a'); // troca de letra para outra
		String replace2 = nome.replace("igor", "DEUS"); // troca de palavra pra outra
		int index = nome.indexOf("leon"); // primeira posição da palavra mencionada
		int index2 = nome.lastIndexOf("FERREIRA"); // ultima posição da palavra mencionada
		String split = "potato apple lemon";
		System.out.println("nome original: " + nome);
		System.out.println("toLowerCase: " + lower);
		System.out.println("toUpperCase: " + Upper);
		System.out.println("Trim: " + trim);
		System.out.println("subString: " + subString);
		System.out.println("subString2: " + subString2);
		System.out.println("replace 'i' to 'a': " + replace);
		System.out.println("replace 'igor to 'DEUS': " + replace2);
		System.out.println("First indexOf: " + index);
		System.out.println("Last indexOf: " + index2);
		String[] vet = split.split(" "); // vetor split para armazenar cada palavra de uma String
		System.out.println(vet[0]);
		System.out.println(vet[1]);
		System.out.println(vet[2]);
	}

}
