package Fatorial;

public class Main {

	public static void main(String[] args) {
		
		FatorialRescursivo f = new FatorialRescursivo();
		
		System.out.println("0 = " + f.fat(0));
		System.out.println("1 = " + f.fat(1));
		System.out.println("2 = " + f.fat(2));
		System.out.println("5 = " + f.fat(5));
	}

}
