package br.com.oo.java.introducao;

import java.util.Locale;
import java.util.Scanner;

import br.com.oo.java.introducao.entities.Aluno;

public class ProgramAluno {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		Aluno aluno = new Aluno();

		aluno.nome = sc.nextLine();
		aluno.nota1 = sc.nextDouble();
		aluno.nota2 = sc.nextDouble();
		aluno.nota3 = sc.nextDouble();

		System.out.printf("FINAL GRADE = %.2f%n", aluno.mediaFinal());
		if (aluno.mediaFinal() >= 60.00) {
			System.out.println("PASS");
		} else {
			System.out.println("FAILED");
			double missing = 60.00 - aluno.mediaFinal();
			System.out.printf("MISSING %.2f POINTS", missing);
		}

		sc.close();

	}

}
