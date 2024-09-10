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

		int invertido[] = new int[n];

		for (int i = 0; !pilha.isEmpty(); i++) {
			invertido[i] = pilha.pop();
		}

		boolean isPalindromo = true;
		for (int i = 0; i < n && isPalindromo; i++) {
			if (lido[i] != invertido[i]) {
				isPalindromo = false;
			}
		}

		if (isPalindromo) {
			System.out.print("Eh palindromo!");
		} else {
			System.out.print("Nao e palindromo!");
		}
	}
}
