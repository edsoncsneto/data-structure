package testeDeSoftware;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class TestPessoa {

	@Test
	void testNomeESobrenomeValidos() throws Exception {
		assertNotNull(new Pessoa("Edson Neto", 20));
	}
	
	@Test
	void testNomeESobrenomeInvalidos() {
		Exception exception = assertThrows(Exception.class, 
				() -> new Pessoa("Adamastor", 70));
		assertEquals("Deve ser informado o sobrenome", exception.getMessage());
	}

	@Test
	void testMaiorQue5Valido() throws Exception {
		assertNotNull(new Pessoa("Francisco Marcondes", 98));
	}
	
	@Test
	void testMaiorQue5Invalido() {
		Exception exception = assertThrows(Exception.class, 
				() -> new Pessoa("Li U", 1));
		assertEquals("Nome e sobrenome devem possuir mais do que 5 caracteres", 
				exception.getMessage());
	}
	
	/*ERRO 1: o código deveria reprovar nesse teste, mas não reprova.
	 *O caracter inválido não é identificado e o objeto é instanciado normalmente
	 */
	@Test
	void testLetrasAlfabetoValido() throws Exception {
		assertNotNull(new Pessoa("Analdo Cés*ar Coelho", 66));
	}
	
	/*ERRO 2: a exceção não é lançada.
	 *O objeto é instanciado normalmente e a exceção não é lançada
	 */
	@Test
	void testLetrasAlfabetoInvalido() {
		Exception exception = assertThrows(Exception.class, 
				() -> new Pessoa("Kleber Al%fredo", 12));
		assertEquals("Caracter inválido encontrado!", 
				exception.getMessage());
	}
	
	@Test
	void idadeValida1() throws Exception {
		assertNotNull(new Pessoa("Fernando Marques", 0));
	}
	
	@Test
	void idadeValida2() throws Exception {
		assertNotNull(new Pessoa("Alexandre Marques", 100));
	}
	
	@Test
	void idadeInvalida1() throws Exception {
		Exception exception = assertThrows(Exception.class, 
				() -> new Pessoa("Ellen Costa", -1));
		assertEquals("Idade não pode ser negativa", 
				exception.getMessage());
	}
	
	@Test
	void idadeInvalida2() throws Exception {
		Exception exception = assertThrows(Exception.class, 
				() -> new Pessoa("Lourdes Costa", 101));
		assertEquals("Idade não pode ser maior que 100", 
				exception.getMessage());
	}
	
}
