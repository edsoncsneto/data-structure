package listaCircularDupla;
public class Program {

	public static void main(String[] args) {
		Lista lista = new Lista();
		
		lista.insere(5);
		lista.insere(5);
	
		System.out.println(lista.imprime());
		lista.remove(5, true);
		System.out.println(lista.imprime());
	}
}
