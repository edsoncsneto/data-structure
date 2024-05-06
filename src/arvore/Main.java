package arvore;

public class Main {
	
	public static void main(String[] args) {
		Arvore a = new Arvore(0);
		Arvore b = new Arvore(1);
		Arvore c = new Arvore(2);
		a.setDireita(c);
		a.setEsquerda(b);
		
	}

	
	
}
