package listaDupla;

public class Program {

	public static void main(String[] args) {
		ListaDupla lista = new ListaDupla();
		lista.inserir(1);
		lista.inserir(2);
		lista.inserir(3);
		lista.imprimir();
		lista.imprimir2();
		lista.remover(1);
		lista.imprimir();
		lista.remover(2);
		lista.imprimir();
		lista.remover(3);
		lista.imprimir();
		lista.inserir(10);
		lista.inserir(11);
		lista.imprimir();
		lista.imprimir2();
		
	}

}
