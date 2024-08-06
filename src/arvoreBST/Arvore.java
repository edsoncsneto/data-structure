package arvoreBST;

public class Arvore {
	private int info;
	private Arvore direita;
	private Arvore esquerda;
	
	public Arvore(int info) {
		this.info = info;
		this.direita = null;
		this.esquerda = null;
	}
	
	public void inserir(int infoNovo) {
		if (infoNovo >= this.info) {
			
			if (this.direita == null) {
				this.direita = new Arvore(infoNovo);
				return;
				
			} else {
				this.direita.inserir(infoNovo);
			}
		}
		
		else {
			
			if (this.esquerda == null) {
				this.esquerda = new Arvore(infoNovo);
				return;
			
			} else {
				this.esquerda.inserir(infoNovo);
			}	
		}
	}
	
	public static void preOrdem(Arvore arvore) {
		if (arvore == null) return;
		System.out.println(arvore.getInfo());
		preOrdem(arvore.getEsquerda());
		preOrdem(arvore.getDireita());
	}
	
	public static void emOrdem(Arvore arvore) {
		if (arvore!=null) {
			emOrdem(arvore.getEsquerda());
			System.out.println(arvore.getInfo());
			emOrdem(arvore.getDireita());
		}
		return;
	}

	public static void posOrdem(Arvore arvore) {
		if (arvore!=null) {
			posOrdem(arvore.getEsquerda());
			posOrdem(arvore.getDireita());
			System.out.println(arvore.getInfo());
		}
		return;
	}
	
	public void consulta(int valor) {
		if (this.getInfo() == valor) {
			System.out.println(this.getInfo());
			return;
		
		} else if (this.getDireita() == null && this.getEsquerda() == null) {
			System.out.println("Valor não encontrado");
			return;
			
		} else {
			if (valor > this.getInfo()) {
				this.direita.consulta(valor);
			} else {
				this.esquerda.consulta(valor);
			}
		}
	}
	
	public Arvore maior() {
		Arvore arvore = this;
		while (arvore.getDireita() != null) {
			arvore = arvore.getDireita();
		}
		return arvore;
	}
	
	public Arvore menor() {
		Arvore arvore = this;
		while (arvore.getEsquerda() != null) {
			arvore = arvore.getEsquerda();
		}
		return arvore;
	}
	
//	public Integer sucessor(int indice) {
//		if (consulta(indice)) {
//			
//			if (indice == this.getInfo()) {
//				
//				if (this.getDireita() != null) {
//					
//				}
//				
//			}
//		}
//	}
	
	public void antecessor(int indice) {
		
	}
	
	public void  sucessor(int indice) {
	
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
