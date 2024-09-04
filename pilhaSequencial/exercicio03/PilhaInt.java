package pilhaSequencial.exercicio03;

public class PilhaInt {
	
	final int N = 9;
	int dados[] = new int[N];
	int topo;

	public void init() {
		topo = 0;
	}

	public boolean isEmpty() {
		return topo == 0;
	}

	public boolean isFull() {
		return topo == N;
	}

	public void push(int elem) {
		if (isFull()) {
			System.out.println("Stack Overflow! | Pilha cheia!");
		} else {
			dados[topo] = elem;
			topo++;			
		}
	}

	public int pop() {
		topo--;
		return dados[topo];
	}

}
