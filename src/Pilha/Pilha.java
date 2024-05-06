package Pilha;

public class Pilha {
	
	private No ref;

	public Pilha() {
		this.ref = null;
	}
	
	public void push(int info) {
		No novo = new No(info, ref);
		ref = novo;
	}
	
	public void pop() {
		//verificando se está vazia
		if(vazia()) {
			System.out.println("lista vazia");
			return;
		}
		
		ref = ref.getProx();
	}
	
	public void imprimir() {
		if(vazia()) {
			System.out.println("pilha vazia");
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
