package pilhaEmVetor;

public class Program {

	public static void main(String[] args) {
		Pilha p = new Pilha(5);
		p.push(0);
		p.push(1);
		p.push(2);
		p.push(3);
		p.push(4);
		p.push(5);
		
		try {
			System.out.println(p.pop());
			System.out.println(p.pop());
			System.out.println(p.pop());
			System.out.println(p.pop());
			System.out.println(p.pop());
			System.out.println(p.pop());
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		//4 3 2 1 0 msg excp
		
		p.push(10);
		p.push(11);
		p.push(12);
		
		try {
			System.out.println(p.pop());
			System.out.println(p.pop());
			System.out.println(p.pop());
			System.out.println(p.pop());
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

}
