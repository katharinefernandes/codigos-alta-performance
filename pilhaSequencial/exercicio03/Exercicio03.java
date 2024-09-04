package pilhaSequencial.exercicio03;

import java.util.Scanner;

public class Exercicio03 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		PilhaInt pilha = new PilhaInt();
		int numDecimal = 0;
		int resto = 0;

		System.out.print("Informe um numero decimal: ");
		numDecimal = sc.nextInt();
		
		pilha.init();

		while (numDecimal != 0) {
			resto = numDecimal % 2;
			pilha.push(resto);
			numDecimal = numDecimal/2;
		}
		
		System.out.println("Numero em binario");
		
		while(!pilha.isEmpty()) {
			System.out.print(pilha.pop() + " ");
		}
		
	}

}
