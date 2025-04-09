package br.com.fiap.assunto11ABB.arvores;

public class ABBInt {

	private class NO {
		int dado;
		NO esq, dir;
	}

	public NO root = null;

	public NO inserir(NO p, int info) {
		// insere elemento em uma ABB
		if (p == null) {
			p = new NO();
			p.dado = info;
			p.esq = null;
			p.dir = null;
		} else if (info < p.dado)
			p.esq = inserir(p.esq, info);
		else
			p.dir = inserir(p.dir, info);
		return p;
	}

	public void mostraEmOrdem(NO p) {
		if (p != null) {
			mostraEmOrdem(p.esq);
			System.out.println(p.dado + "\t");
			mostraEmOrdem(p.dir);
		}
	}

	public int contaNos(NO p, int cont) {
		if (p != null) {
			cont++;
			cont = contaNos(p.esq, cont);
			cont = contaNos(p.dir, cont);
		}
		return cont;
	}

	public boolean consulta(NO p, int valor) {

		if (p == null)
			return false;
		else {
			if (valor == p.dado)
				return true;
			else if (valor < p.dado)
				return consulta(p.esq, valor);
			else
				return consulta(p.dir, valor);

		}
	}

	public int consultaCont(NO p, int valor, int cont) {
		boolean encontrou = false;

		if (p == null)
			return cont;
		else {
			if (!encontrou) {
				cont++;
			}
			if (valor == p.dado)
				return cont;
			else if (valor < p.dado)
				return consultaCont(p.esq, valor, cont);
			else
				return consultaCont(p.dir, valor, cont);
		}
	}

	public int contaConsulta(NO p, int valor, int cont) {
		if (p != null) {
			cont++;
			if (valor == p.dado)
				return cont;
			else if (valor < p.dado)
				cont = contaConsulta(p.esq, valor, cont);
			else
				cont = contaConsulta(p.dir, valor, cont);
		}
		return cont;
	}

	public NO removeValor(NO p, int info) {
		if (p != null) {
			if (info == p.dado) {
				if (p.esq == null && p.dir == null) // nó a ser removido é nó folha
					return null;
				if (p.esq == null) { // se não há sub-árvore esquerda o ponteiro passa apontar para a sub-árvore
										// direita
					return p.dir;
				} else {
					if (p.dir == null) { // se não há sub-árvore direita o ponteiro passa apontar para a sub-árvore
											// esquerda
						return p.esq;
					} else { /*
								 * o nó a ser retirado possui sub-arvore esquerda e direita, então o nó que será
								 * retirado deve-se encontrar o menor valor na sub-árvore á direita
								 */
						NO aux, ref;
						ref = p.dir;
						aux = p.dir;
						while (aux.esq != null)
							aux = aux.esq;
						aux.esq = p.esq;
						return ref;
					}
				}
			} else { // procura dado a ser removido na ABB
				if (info < p.dado)
					p.esq = removeValor(p.esq, info);
				else
					p.dir = removeValor(p.dir, info);
			}
		}
		return p;
	}

}
