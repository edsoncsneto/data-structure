package listaCircular;

public class ListaCircular {
	
	No ref;
	
	public ListaCircular() {
		this.ref = null;
	}
	
	public void inserir(int info) {
		if(vazia()) {
			No no = new No(info, ref);
			no.setProx(no);
			ref=no;
			
		} else {
			No aux = ref.getProx();
			No no = new No(info, null);
			ref.setProx(no);
			no.setProx(aux);
			
		}
	}
	
	public void imprimir() {
		if (vazia()) {
			System.out.println("lista vazia");
			return;
		}
		
		for(No item = ref.getProx(); item!=ref; item=item.getProx()) {
			System.out.print(item.getInfo()+" ");
		}
		System.out.println(ref.getInfo());
	}
	
	public void remover(int item) {
		
		if (vazia()) {
			System.out.println("lista já está vazia");
			return;
		}
		
		if(ref==ref.getProx()) {
			ref.setProx(null);
			ref=null;
			return;
		}
		
		No aux = ref;
		do {
			if(aux.getProx().getInfo() == item) {
				if (item==ref.getInfo()) {
					ref = ref.getProx();
				}
				aux.setProx(aux.getProx().getProx());
				return;
			}
			aux=aux.getProx();
			
		} while(aux!=ref);
	}
	
	public boolean vazia() {
		return ref==null;
	}

}
