package pilhaSequencial.teste;

import br.com.fiap.pilhaSequencial.pilhas.PilhaInt;

public class MainTeste {

	public static void main(String[] args) {

		PilhaInt pilha = new PilhaInt();

		pilha.init();
		pilha.push(10);
		pilha.push(12);
		pilha.push(14);
		pilha.push(16);
		pilha.push(18);
		pilha.push(20);
		pilha.push(22);

		System.out.println("Valor retirado da pilha: " + pilha.pop());
		System.out.println("Valor retirado da pilha: " + pilha.pop());

	}

}
