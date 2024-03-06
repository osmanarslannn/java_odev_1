package calısma;

public class sesliHarfler {

	public static void main(String[] args) {
		char harf='E';
		
		switch (harf) {
		case 'A':
		case 'I':
		case 'O':
		case 'U':
			System.out.println("KALIN SESLİ ÜNKÜLER");
			break;

		default:
			System.out.println("İNCE SESLİ ÜNLÜLER");
			break;
		}

	}

}
