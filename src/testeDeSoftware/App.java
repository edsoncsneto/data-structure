package testeDeSoftware;

public class App {

	public static void main(String[] args) throws Exception {
		Pessoa pessoa = new Pessoa("joão lázaro", 14);
		
		System.out.println(pessoa.getNome() + pessoa.getIdade());
	}
	
}
