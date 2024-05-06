package Pilha;

public class Program {

	public static void main(String[] args) {
		Pilha pilha = new Pilha();
		pilha.push(1);
		pilha.push(2);
		pilha.push(3);
		pilha.imprimir(); //3 2 1
		pilha.pop();
		pilha.imprimir(); //2 1
		pilha.pop();
		pilha.imprimir(); //1
		pilha.pop();
		pilha.imprimir(); //pilha vazia
		pilha.push(10);
		pilha.push(11);
		pilha.imprimir(); //11 10
		pilha.pop();
		pilha.imprimir(); //10
	}

}
