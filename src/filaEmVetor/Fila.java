package filaEmVetor;

public class Fila {
	
	private int inicio;
	private int fim;
	private int tamanho;
	private int numIns;
	private int vetor[];
	
	public Fila(int tamanho) {
		this.vetor = new int[tamanho];
		this.inicio = -1;
		this.fim = -1;
		this.tamanho = tamanho;
		this.numIns = 0;
	}
	
	public void enfileirar(int info) {
		if (numIns >= tamanho) {
			System.out.println("fila cheia");
			return;
		}
		this.vetor[fim] = info;
		if (inicio == -1) {
			inicio++;
		}
		fim = (inicio + numIns)%tamanho;
		vetor[fim] = info;
		numIns++;
	}
	
	public int remover() {
		if (inicio == -1 && fim == -1) {
			System.out.println("fila vazia");
			return -1;
		}
		if(inicio == fim) {
			int info1 = vetor[inicio];
			inicio = -1;
			fim = -1;
			numIns = 0;
			return info1;
		}
		int info1 = vetor[inicio];
		inicio = (inicio+1)%tamanho;
		numIns --;
		return info1;
	}

}
