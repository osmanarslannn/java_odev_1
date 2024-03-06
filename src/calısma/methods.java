package calısma;

public class methods {

	public static void main(String[] args) {
	    sayiBulmaca();

	}
	
	
	public static void sayiBulmaca() {
		int[] sayilar = new int[] { 7, 5, 6, 9, 10 };
		int aranacak = 10;
		boolean varMi = false;

		for (int sayi : sayilar) {
			if (sayi == aranacak) {
				varMi = true;

			}
		}
		String mesaj;
		if (varMi) {
			mesaj="sayı mevcuttur.";
			mesajVer(mesaj);
		}
		else {
			mesaj="sayı mevcuttur değildir.";
			mesajVer(mesaj);
		}
		

	}
	
	public static void mesajVer(String mesaj) {
		System.out.println(mesaj);
	}
	

	}


