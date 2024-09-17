package filaSequencial.introducao;

public class FilaInt {

	public final int N = 3;
	int dados[] = new int[N];
	int inicio, fim, cont;

	public void init() {
		inicio = fim = cont = 0;
	}

	public boolean isEmpty() {
		return cont == 0;
	}

	public boolean isFull() {
		return cont == N;
	}

	public void enqueue(int valor) {
		if (isFull()) {
			System.out.println("Sua fila está cheia!");
		} else {
			dados[fim] = valor;
			// Possibilidade 1
			// fim = (fim + 1) % N;
			// Possibilidade 2
			fim++;
			if (fim == N) {
				fim = 0;
			}
			cont++;
		}
	}

	public int dequeue() {
		int valor = dados[inicio];
		inicio++;
		return valor;
	}

}
