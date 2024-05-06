package listaSimples;

public class Lista {
	
	private No ref;

	public Lista() {
		this.ref = null;
	}
	
	public void inserir(int info) {
		No novo = new No(info, ref);
		ref = novo;
	}
	
	public void remover(int item) {
		//verificando se está vazia
		if(vazia()) {
			System.out.println("lista vazia");
			return;
		}
		
		//verificando se o item a ser removido é o primeiro
		if(item == ref.getInfo()) {
			ref = ref.getProx();
			return;
		}
		
		for (No aux = ref; aux!=null; aux = aux.getProx()) {
			if (aux.getProx().getInfo() == item) {
				
				if (aux.getProx().getProx() == null) {
					aux.setProx(null);
					return;
				}
				aux.setProx(aux.getProx().getProx());
			}
		}
	}
	
	public void imprimir() {
		if(vazia()) {
			System.out.println("lista vazia");
			return;
		}
		for (No aux = ref; aux!=null; aux=aux.getProx()) {
			System.out.print(aux.getInfo() + " ");
		}
		System.out.println();
	}

	public boolean vazia() {
		return this.ref == null;
	}
	
}
