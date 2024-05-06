package listaCircular;

public class Program {

	public static void main(String[] args) {
		ListaCircular lista = new ListaCircular();
		
		lista.inserir(1);
		lista.imprimir(); //1
		lista.remover(1);
		lista.imprimir(); //lista vazia
		lista.inserir(2);
		lista.inserir(3);
		lista.inserir(4);
		lista.inserir(5);
		lista.inserir(6);
		lista.inserir(7);
		lista.imprimir(); //7 6 5 4 3 2
		lista.remover(4);
		lista.imprimir(); //7 6 5 3 2
		lista.remover(7);
		lista.remover(2);
		lista.imprimir(); //6 5 3
		lista.inserir(10);
		lista.inserir(11);
		lista.inserir(12);
		lista.imprimir(); //12 11 10 5 3 6
		lista.remover(12);
		lista.remover(11);
		lista.remover(10);
		lista.remover(5);
		lista.remover(6);
		lista.imprimir(); //3
		lista.remover(3);
		lista.imprimir(); //lista vazia
	}

}
