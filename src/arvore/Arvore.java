package arvore;

public class Arvore {
	int info;
	Arvore direita;
	Arvore esquerda;
	
	public Arvore(int info) {
		this.info = info;
		this.direita = null;
		this.esquerda = null;
	}

	public int getInfo() {
		return info;
	}

	public void setInfo(int info) {
		this.info = info;
	}

	public Arvore getDireita() {
		return direita;
	}

	public void setDireita(Arvore direita) {
		this.direita = direita;
	}

	public Arvore getEsquerda() {
		return esquerda;
	}

	public void setEsquerda(Arvore esquerda) {
		this.esquerda = esquerda;
	}
	
	
}
