package recordacaoAlocacao;

public class Aplicacao {

	public static void main(String[] args) {

		// possui o endereço que caracteriza a informação que está armazenada na heap
		// dado e prox
		NO novo1 = new NO();
		// dado = 2
		novo1.dado = 2;
		// prox = null -> não possui um sucessor
		novo1.prox = null;
		System.out.println("Novo 1: " + novo1); // está no endereço da heap que aparece no sysout
		System.out.println("dado: " + novo1.dado + "\t prox: " + novo1.prox);

		NO novo2 = new NO();
		novo2.dado = 5;
		// agora o próximo valor é o nó novo1 - passa a referenciar o novo1
		novo2.prox = novo1;
		System.out.println("Novo 2: " + novo2); // está no endereço da heap que aparece no sysout
		System.out.println("dado: " + novo2.dado + "\t prox: " + novo2.prox);
		
		
	}

}
