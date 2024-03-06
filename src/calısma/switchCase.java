package calısma;

public class switchCase {

	public static void main(String[] args) {
		  char grade='P';

	        switch (grade){
	            case 'A':
	                System.out.println("mükemmel geçtiniz");
	                break;
	            case 'B':
	                System.out.println("çok güzel geçtiniz.");
	                break;
	            case 'C':
	                System.out.println("iyi geçtiniz");
	                break;
	            case 'D':
	                System.out.println("fena değil geçtiniz");
	                break;
	            case 'F':
	                System.out.println("kaldınız");
	                break;
	            default:
	                System.out.println("geçersiz not girdiniz");

	        }

	        int a=4;
	         System.out.println(a>3?"a büyüktür 10" : a+10);  // ternary operatörü
	       // a=a>5?a+15: a*8;

	}

}
