package listaDupla;

public class ListaDupla {
	
	private No ref;
	
	public ListaDupla() {
		this.ref=null;
	}
	
	public void inserir(int info) {
		//crio um novo no
		No novo = new No(info, ref, null);
		if(!vazia()) {
			//crio item para apontar pra minha ref caso a lista nao esteja vazia
			No item = ref;
			//torno o anterior do item (referencia) o novo no que eu criei
			item.setAnt(novo);
		}
		//minha referencia passa a ser o novo no (ref apontando sempre para o ultimo no criado)
		ref = novo;
	}
	
	public void imprimir() {
		if(vazia()) {
			System.out.println("Lista vazia");
			return;
		}
		
		for(No item = ref; item!=null; item=item.getProx()) {
			System.out.print(item.getInfo()+" ");
		}
		System.out.println();
		
	}
	
	public void imprimir2() {
		if(vazia()) {
			System.out.println("Lista vazia");
			return;
		}
		
		for(No item = ref; item!=null; item=item.getProx()) {
			if (item.getProx()==null) {
				for(No item2 = item; item2!=null; item2=item2.getAnt()) {
					System.out.print(item2.getInfo()+" ");
				}
				System.out.println();
			}
		}
		
	}
	
	public boolean vazia() {
		return ref==null;
	}
	
	public void remover(int item) {
		
		if(vazia()) {
			return;
		}
		
		if (item==ref.getInfo()) {
			ref.setAnt(null);
			ref=ref.getProx();
			return;
		}
		
		for(No aux = ref; aux.getProx()!=null; aux=aux.getProx()) {
			if (aux.getProx().getInfo() == item) {
				
				if (aux.getProx().getProx()==null) {
					aux.setProx(null);
					return;
					
				}else {
					aux.getProx().getProx().setAnt(aux);
					aux.setProx(aux.getProx().getProx());
					return;
				}
			}
		}
		System.out.println("Não há esse item na estrutura");
	}
	
	public No getRef() {
		return ref;
	}

	public void setRef(No ref) {
		this.ref = ref;
	}
}
