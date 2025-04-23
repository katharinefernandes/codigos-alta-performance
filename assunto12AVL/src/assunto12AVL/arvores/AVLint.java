package assunto12AVL.arvores;

public class AVLint {

	private class NO {
		int dado;
		NO dir;
		NO esq;
		int hEsq;
		int hDir;
	}

	public NO root = null;
	
	public void mostraEmOrdem(NO p) {
		if(p!=null) {
			mostraEmOrdem(p.esq);
			System.out.println(p.dado);
			mostraEmOrdem(p.dir);
		}
	}

	public NO inserirH(NO p, int info) {
		if (p == null) { // nó inserido sempre será nó folha
			p = new NO();
			p.dado = info;
			p.esq = null;
			p.dir = null;
			p.hDir = 0;
			p.hEsq = 0;
		} else if (info < p.dado) {
			p.esq = inserirH(p.esq, info);
			if (p.esq.hDir > p.esq.hEsq) // Altura do nó será a maior
				p.hEsq = p.esq.hDir + 1; // altura dos seus filhos
			else
				p.hEsq = p.esq.hEsq + 1;
		} else {
			p.dir = inserirH(p.dir, info);
			if (p.dir.hDir > p.dir.hEsq)
				p.hDir = p.dir.hDir + 1;
			else
				p.hDir = p.dir.hEsq + 1;
		}
		return p;
	}
	
	public void mostraFB(NO p) {
		if(p!=null) {
			// pós ordem, primeiro acessamos o dado da esquerda e depois da direita e só então apresentamos o dado
			mostraFB(p.dir);
			mostraFB(p.esq);
			// dado + fator de balanceamento
			System.out.println("Dado= " + p.dado + " FB= " + (p.hDir - p.hEsq));
		}
	}
	

}
