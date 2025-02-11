# Recordação - Alocação Dinâmica 11/02/2025

1. Listas Lineares -> Pilhas e Filas
   - Vetores 
   - Alocação Dinâmica
2. Árvores
   - Implementaremos alocação dinâmica
   
   
Como alocar memória em tempo de execução:
- Alocação dinâmica ocorre quando instanciamos um novo objeto, ou seja, new Objeto();

Existe uma área da memória chamada stack - é nela que as variáveis são armazenadas
                                   heap  - utilizada para reservar espaço durante o momento de exeção, para poder utilizar precisamos de alguém que saiba onde essa variável está armazenada, ou seja, o nome da variável.
								         - Na stack temos a referência da variável, o "nome" dela, que apontará para a heap, que tem o valor da variável de fato
										 
No vetor definimos ao compilar o programa o tamanho, assim ele aloca o tamanho desejado na memória.

Alocação Dinâmica: O objetivo é não se restringir ao tamanho no momento de instânciar uma pilha ou fila!
- Lista linear - Sempre mantem a ordem. 
			   - Cada elemento que entra aponta da o seu sucessor. 
			   - Uma referência que localiza o seu próximo nó.
			   - prox é a referência do seu próximo nó, tornando o código recursivo.

Fila - precisa da indicação do inicio e fim
- enqueue(2)
  1. Instânciação de um novo nó.
  2. O valor passado como parâmetro será o dado, nesse caso o 2.
  3. Como é um novo elemento, seu próximo valor será o null.
  4. Se a fila está vazia, o seu inicio será o primeiro valor, ou seja, será o próprio nó. ini = novo.
  5. Caso ela não esteja vazia, o seu fim será o nó novo. fim.prox = novo (para que os nós sejam encadeados/ligados) e fim = novo.
  