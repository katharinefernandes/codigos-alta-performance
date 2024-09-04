package pilhaSequencial.exercicio04;

import java.util.Scanner;

public class Exercicio04 {

	// palindromo número positivo, se lido de trás para frente continua o mesmo

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		PilhaInt pilha = new PilhaInt();
		int lido[] = new int[pilha.N];
		int digito;
		int n = 0;

		System.out.print("Informe o digito (negativo para encerrar): ");
		digito = sc.nextInt();

		while (digito >= 0) {
			lido[n] = digito;
			n++;
			pilha.push(digito);
			
			System.out.print("Informe o digito (negativo para encerrar): ");
			digito = sc.nextInt();
		}

		n = 0;
		while (!pilha.isEmpty()) {
			if (lido[n] == pilha.pop()) {
				System.out.print("É palindromo!");
			} else {
				System.out.print("Não é palindromo!");
				return;
			}
			n++;
		}

	}
}
