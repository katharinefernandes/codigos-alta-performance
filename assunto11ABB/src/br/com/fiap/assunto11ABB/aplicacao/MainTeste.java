package br.com.fiap.assunto11ABB.aplicacao;

import java.util.Scanner;

import br.com.fiap.assunto11ABB.arvores.ABBInt;

public class MainTeste {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ABBInt abb = new ABBInt();

		System.out.println("---------- MENU ----------");
		System.out.println("0 - Sair do programa");
		System.out.println("1 - Insere 1 valor na ABB");
		System.out.println("2 - Apresenta em ordem os elementos da ABB");
		System.out.println("3 - Apresenta quantidade de nos na ABB");
		System.out.print("Informe a opcao desejada: ");
		int opcao = sc.nextInt();

		while (opcao != 0) {

			switch (opcao) {
			case 1:
				System.out.print("Informe o dado: ");
				int valor = sc.nextInt();
				// inserir na ABB
				abb.root = abb.inserir(abb.root, valor);
				break;
			case 2:
				// mostra ABB
				abb.mostraEmOrdem(abb.root);
				break;
			case 3:
				// conta nó presentes
				System.out.println("Quantidade de nos = " + abb.contaNos(abb.root, 0));
				break;
			default:
				System.out.println("Opcao Invalida...");
				System.out.print("Informe a opcao desejada: ");
				opcao = sc.nextInt();
			}

			System.out.println("");
			System.out.print("Informe a opcao desejada: ");
			opcao = sc.nextInt();

		}

		System.out.println("Encerrando...");

		sc.close();

	}

}
