package listaSimples;

public class Program {

	public static void main(String[] args) {
		Lista lista = new Lista();
		lista.inserir(0);
		lista.inserir(1);
		lista.inserir(2);
		lista.imprimir(); //2 1 0
		lista.remover(0);
		lista.remover(1);
		lista.remover(2);
		lista.imprimir(); //lista vazia
		lista.inserir(10);
		lista.inserir(11);
		lista.imprimir(); //11 10
	}

}
