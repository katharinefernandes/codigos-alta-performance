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
		System.out.println("4 - Verifica a existencia de valor na ABB");
		System.out.println("5 - Apresenta o numero de comparaoes para pesquisas um valor ABB");
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
			case 4:
				System.out.print("Informe o valor a ser procurado: ");
				valor = sc.nextInt();
				// usa metodo consulta
				if (abb.consulta(abb.root, valor)) {
					System.out.println("Valor esta em ABB");
				} else {
					System.out.println("Valor nao esta em ABB");
				}
				break;
			case 5:
				System.out.print("Informe o valor a ser procudado: ");
				valor = sc.nextInt();
				int comparacoes = abb.consultaCont(abb.root, valor, 0);
				System.out.println("Quantidade de comparacoes: " + comparacoes);
			default:
				System.out.println("Opcao Invalida...");
			}

			System.out.println("");
			System.out.print("Informe a opcao desejada: ");
			opcao = sc.nextInt();

		}

		System.out.println("Encerrando...");

		sc.close();

	}

}
