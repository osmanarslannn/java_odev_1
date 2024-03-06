package calısma;

public class conditions {

	public static void main(String[] args) {
//	     int sayi1=100;
//        int sayi2=30;
//        int sayi3=120;              hocanın yaptığı algoritma.
//        int enBüyük=sayi1;
//        if (enBüyük<sayi2){
//            enBüyük=sayi2;
//        }
//        if (enBüyük<sayi3){
//            enBüyük=sayi3;
//        }
//        System.out.println(" en büyük sayı= " + enBüyük); 
        int sayi1=180;
        int sayi2=190;
        int sayi3=220;


        if (sayi1>sayi2 && sayi1>sayi3 ){
            System.out.println("en nüyük sayı= " + sayi1);
        } else if (sayi2>sayi1 && sayi2>sayi3) {
            System.out.println("en büyük sayı= " + sayi2);
        }else {
            System.out.println("en büyük sayı= " + sayi3);
        }


	}

}
