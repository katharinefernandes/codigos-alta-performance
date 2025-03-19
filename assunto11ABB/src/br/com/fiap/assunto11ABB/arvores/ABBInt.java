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

}
