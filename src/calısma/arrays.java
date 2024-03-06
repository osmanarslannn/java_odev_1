package calısma;

public class arrays {

	public static void main(String[] args) {
		 String[] ogrenciler = new String[3];
	        ogrenciler[0] = "osman";
	        ogrenciler[1] = "ali";
	        ogrenciler[2] = "enes";
	        for (int i = 0; i < ogrenciler.length; i++) {
	            System.out.println(ogrenciler[i]);
	        }
	        System.out.println("---------------------------");
	        for (String ogrenci : ogrenciler) {
	            System.out.println(ogrenci);
	        }
	        int[] sayilar = new int[]{6, 5, 8, 7};
	        for (int sayi : sayilar) {
	            System.out.println(sayi);
	        }

	        double[] myList = {8.5, 9.6, 5.4, 15.7};
	        double toplam = 0;
	        double max = myList[0];
	        for (double number : myList) {
	            if (max < number) {
	                max = number;

	            }
	            toplam = toplam + number;
	            System.out.println(number);
	        }
	        System.out.println("toplam= " + toplam);
	        System.out.println("max= " + max);


	}

}
