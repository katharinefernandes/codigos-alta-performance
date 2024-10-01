package alocacaoDinamica.exemplo02;

public class Exemplo02 {
	
	public static void main(String[] args) {
		
		NoLista lista = new NoLista();
		lista.dado = 1;
		lista.prox = null;
		System.out.println("Lista: " + lista);
		NoLista novo = new NoLista();
		novo.dado = 2;
		novo.prox = null;		
		System.out.println("Novo: " + novo);
		
		lista.prox = novo;
		
		System.out.println("Proximo item do no que a lista aponta " + lista.prox);
	}

}
