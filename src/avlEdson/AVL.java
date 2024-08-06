package avlEdson;

import java.util.Objects;

public class AVL {

	public No raiz;
	
	public AVL(int info) {
		Objects.requireNonNull(info);
		this.raiz = new No(info);
	}
	
	public AVL() {
		raiz = null;
	}

	public int altura() {
		if (raiz == null)
			return 0;
		return raiz.altura;
	}
	
	public String preOrdem() {
	    StringBuilder sb = new StringBuilder();
	    preOrdemAux(raiz, sb);
	    return sb.toString();
	}

	private static void preOrdemAux(No no, StringBuilder sb) {
	    if (no == null) return;
	    sb.append(no.valor).append("(").append(no.fb).append(") ");
	    preOrdemAux(no.esquerdo, sb);
	    preOrdemAux(no.direito, sb);
	}

	public boolean contem(No no, int valor) {
		if (no == null)
			return false;

		if (no.valor > valor) {
			return contem(no.esquerdo, valor);
		} else if (no.valor < valor) {
			return contem(no.direito, valor);
		}
		return true;
	}

	public void insere(int valor) {
		if (!contem(raiz, valor)) {
			raiz = inserirERebalancear(raiz, valor);
			return;
		}
	}
	
	public void remove(int valor) {
		raiz = removerAux(raiz, valor);
	}
	
	public No removerAux(No no, int info) {
		if (no == null) return null;
		
		if (info < no.valor) {
			no.esquerdo = removerAux(no.esquerdo, info);
			
		} else if (info > no.valor) {
			no.direito = removerAux(no.direito, info);
			
		} else {
			if (no.esquerdo == null && no.direito == null) {
				return null;
				
			} else if (no.direito == null) {
				return no.esquerdo;
				
			} else if (no.esquerdo == null) {
				return no.direito;
				
			} else {
				No sucessor = sucessor(no.direito);
				no.valor = sucessor.valor;
				no.direito = removerAux(no.direito, sucessor.valor);
			}
		}
		atualizar(no);
		return balancear(no);
	}

	private No inserirERebalancear(No no, int valor) {
		if (no == null)
			return new No(valor);

		if (valor < no.valor) {
			no.esquerdo = inserirERebalancear(no.esquerdo, valor);
		} else if (valor > no.valor) {
			no.direito = inserirERebalancear(no.direito, valor);
		} else {
			return no;
		}

		atualizar(no);
		return balancear(no);
	}

	private void atualizar(No no) {
		int alturaNoEsquerdo = (no.esquerdo == null) ? -1 : no.esquerdo.altura;
		int alturaNoDireito = (no.direito == null) ? -1 : no.direito.altura;

		no.altura = 1 + Math.max(alturaNoEsquerdo, alturaNoDireito);
		no.fb = alturaNoEsquerdo - alturaNoDireito;
	}

	private No balancear(No no) {
		if (no.fb == -2) {
			if (no.direito.fb <= 0) {
				return rotacaoEsquerda(no);
			} else {
				no.direito = rotacaoDireita(no.direito);
				return rotacaoEsquerda(no);
			}
		} else if (no.fb == +2) {
			if (no.esquerdo.fb >= 0) {
				return rotacaoDireita(no);
			} else {
				no.esquerdo = rotacaoEsquerda(no.esquerdo);
				return rotacaoDireita(no);
			}
		}
		return no;
	}

	private No rotacaoEsquerda(No no) {
		No novoPai = no.direito;
		no.direito = novoPai.esquerdo;
		novoPai.esquerdo = no;
		atualizar(no);
		atualizar(novoPai);
		return novoPai;
	}

	private No rotacaoDireita(No no) {
		No novoPai = no.esquerdo;
		no.esquerdo = novoPai.direito;
		novoPai.direito = no;
		atualizar(no);
		atualizar(novoPai);
		return novoPai;
	}
	
	public No sucessor(No raiz) {
		while (raiz.esquerdo != null) {
			raiz = raiz.esquerdo;
		}
		return raiz;
	}

}
