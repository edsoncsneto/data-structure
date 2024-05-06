package listaCircularDupla;
public class Lista {

	No ref;

	public Lista() {
		this.ref = null;
	}

	public void insere(int info) {
		No novo = new No(info, null, null);
		if (vazia()) {
			novo.setAnt(novo);
			novo.setProx(novo);
			ref = novo;
			// ref apontará sempre para o primeiro que criei

		} else {
			// as inserções além da primeira terão sempre a ref como antecessora, sendo
			// sempre os proximos de ref
			novo.setProx(ref.getProx());
			novo.setAnt(ref);
			ref.setProx(novo);
			novo.getProx().setAnt(novo);
		}
	}

	public String imprime() {
		StringBuilder sb = new StringBuilder();

		if (vazia()) {
			sb.append("lista vazia");
			return sb.toString();
		}

		sb.append("Sentido normal:");

		for (No item = ref.getProx(); item != ref; item = item.getProx()) {
			sb.append(item.getInfo());
			sb.append(" ");
		}
		sb.append(ref.getInfo());

		sb.append("  Sentido contrário:");
		
		if (ref == ref.getProx()) {
			// if para verificar se há apenas um item na lista, pois se houver o próximo for
			// não é executado como esperado
			sb.append(ref.getInfo());
		}
		
		for (No item = ref.getProx(); item != ref; item = item.getProx()) {
			if (item.getProx() == ref) {
				sb.append(ref.getInfo());
				sb.append(" ");
				for (No item2 = item; item2 != ref; item2 = item2.getAnt()) {
					sb.append(item2.getInfo());
					sb.append(" ");
				}

			}
		}
		
		return sb.toString();
	}

	public void remove(int info, boolean duplicados) {

		if (vazia()) {
			System.out.println("A lista já está vazia.");
			return;
		}

		// se tiver apenas um ou se tiver dois iguais e duplicados for true
		if (ref == ref.getProx() && ref.getInfo() == info || ref.getAnt() == ref.getProx() && duplicados && ref.getInfo() == info) {
			ref.setProx(null);
			ref.setAnt(null);
			ref = null;
			return;
		}

		// aux assume o valor que a ref aponta (primeira inserção)
		No aux = ref;
		do {
			if (aux.getInfo() == info) {
				// achei o item a ser removido
				if (aux == ref) {
					// o item a ser removido é o item apontado pela ref
					ref = retrocederReferencia(ref, duplicados);
					// se duplicado for true, trago a ref para o primeiro item anterior a ele que
					// tenha info diferente ao item que recebi para remover
					// se nao for duplicado, trago a ref para o item anterior a ela independente de
					// sua info
					aux = ref.getProx();
					// meu aux (item que vou remover nas proximas linhas) passar a ser o próximo à
					// ref
				}
				// logica de remover item setando anteriores e proximos
				No auxAnt = aux.getAnt();
				No auxProx = aux.getProx();
				aux.getAnt().setProx(auxProx);
				aux.getProx().setAnt(auxAnt);
				if (!duplicados) {
					return;
				}
			}
			aux = aux.getProx();

		} while (aux != ref);
	}

	public No retrocederReferencia(No ref, boolean duplicados) {
		if (ref.getAnt().getInfo() == ref.getInfo() && duplicados) {
			return retrocederReferencia(ref.getAnt(), duplicados);
		}
		return ref.getAnt();
	}

	public boolean vazia() {
		return ref == null;
	}

}
