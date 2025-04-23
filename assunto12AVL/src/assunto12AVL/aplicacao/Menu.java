package assunto12AVL.aplicacao;

import java.util.Scanner;

import assunto12AVL.arvores.AVLint;

public class Menu {

	public static void main(String[] args) {
		Scanner le = new Scanner(System.in);
		int opcao;
		AVLint avl = new AVLint();

		do {
			System.out.println("----- MENU -----");
			System.out.println("0 - Sair do programa.");
			System.out.println("1 - Insere 1 valor na ABB.");
			System.out.println("2 - Apresenta pos ordem os nos da ABB apresentando tambem o FB do no.");
			System.out.print("Informe a opcao desejada: ");
			opcao = le.nextInt();
			System.out.println("");

			switch (opcao) {
			case 0: {
				System.out.println("Encerrando...");
			}
			case 1: {
				System.out.print("Informe um valor: ");
				int valor = le.nextInt();
				avl.root = avl.inserirH(avl.root, valor);
				break;
			}
			case 2: {
				System.out.println("--- APRESENTACAO DA ARVORE AVL ---");
				avl.mostraFB(avl.root);
				break;
			}
			default:
				System.out.println("Opcao invalida!");
			}
		} while (opcao != 0);

		le.close();
	}

}
