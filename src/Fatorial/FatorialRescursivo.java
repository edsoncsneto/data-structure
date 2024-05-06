package Fatorial;

public class FatorialRescursivo {

	public int fat(int n) {
		if (n == 0 || n == 1) {
			return n;
		}
		
		return n*fat(n-1);
		
	}

}
