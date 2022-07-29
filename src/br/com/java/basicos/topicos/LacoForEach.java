package br.com.java.basicos.topicos;

public class LacoForEach {

	public static void main(String[] args) {

		String[] vet = new String[] { "Igor", "Leon", "Ferreira", "Bernardo" };

		for (int i = 0; i < vet.length; i++) {
			System.out.println(vet[i]);
		}
		System.out.println("----------------");
		
		for (String nomes : vet) {
			System.out.println(nomes);
		}

	}

}
