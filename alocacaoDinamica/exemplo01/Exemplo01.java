package alocacaoDinamica.exemplo01;

public class Exemplo01 {
	public static void main(String[] args) {
		// p1 fica na área de stack
		// dado fica no heap
		Elemento p1 = new Elemento(); 
		p1.dado = 1;
		// base escrita em hexa = endereço de memória
		System.out.println(p1);
		Elemento p2 = new Elemento();
		p2.dado = 2;
		System.out.println(p2);
	}
}
