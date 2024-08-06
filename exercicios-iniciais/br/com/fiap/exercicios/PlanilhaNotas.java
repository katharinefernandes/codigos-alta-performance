package br.com.fiap.exercicios;

import java.util.Scanner;

public class PlanilhaNotas {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int[] rm = new int[30];
		double[] nota1 = new double[30];
		double[] nota2 = new double[30];
		double[] media = new double[30];

		System.out.print("Informe o valor do rm ou valor negativo para encerrar: ");
		int leitura = sc.nextInt();
		int i = 0;

		while (leitura >= 0 && i < rm.length) {
			rm[i] = leitura;

			System.out.println("------ NOTAS ------");
			System.out.print("Informe a primeira nota do aluno: ");
			nota1[i] = sc.nextDouble();
			System.out.print("Informe a segunda nota do aluno: ");
			nota2[i] = sc.nextDouble();
			media[i] = (nota1[i] + nota2[i]) / 2;
			i++;

			System.out.print("Informe o valor do rm ou valor negativo para encerrar: ");
			leitura = sc.nextInt();
		}

		int n = i;
		for (i = 0; i < n; i++) {
			System.out.println("\nAluno " + (i+1) + " - RM " + rm[i] + " | media " + media[i]);
		}

	}
}
