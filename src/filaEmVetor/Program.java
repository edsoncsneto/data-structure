package filaEmVetor;

public class Program {

	public static void main(String[] args) {
		
		Fila f = new Fila(5);
		f.enfileirar(0);
		f.enfileirar(1);
		f.enfileirar(2);
		f.enfileirar(3);
		System.out.println(f.remover());
		System.out.println(f.remover());
		f.enfileirar(4);
		f.enfileirar(5);
		f.enfileirar(6);
		System.out.println(f.remover());
		System.out.println(f.remover());
		System.out.println(f.remover());
		System.out.println(f.remover());
	}

}
