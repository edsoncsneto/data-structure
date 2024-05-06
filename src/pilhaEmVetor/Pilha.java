package pilhaEmVetor;

public class Pilha {

	private int capacidade;
	private int vetor[];
	private int topo;
	
	public Pilha(int capacidade) {
		this.topo = -1;
		this.capacidade = capacidade;
		this.vetor = new int[this.capacidade];
	}
	
	public void push(int info) {
		if (topo == capacidade-1) {
			System.out.println("pilha cheia");
			return;
		}
		++topo;
		vetor[topo] = info;
	}
	
	public int pop() throws Exception{
		if(topo<0) {
			throw new Exception("pilha vazia");
		}
		
		topo--;
		return vetor[this.topo + 1];
	}
	
}
