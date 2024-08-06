package avlEdson;

public class Main {
	
	public static void main(String[] args) {
	    AVL arvore = new AVL();

	    arvore.insere(10);
	    arvore.insere(20);
	    arvore.insere(30);

	    //árvore em pré-ordem
	    System.out.println(arvore.preOrdem());
	  }

}
