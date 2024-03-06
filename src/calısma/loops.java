package calısma;

public class loops {

	public static void main(String[] args) {
		for (int i=0;i<=10;i+=2){
		    System.out.println(i);
		}
		        System.out.println("for föngüsü bitti");
		int j=1;
		while (j<10){
		    System.out.println(j);
		    j+=2;
		}
		        System.out.println("while döngüsü bitti");
		int x=100;
		do {
		    System.out.println(x);   // do-while döngüsü şart sağlanmasa bile bir kere çalışır.log atmada işimize yarar.
		    x+=2;
		}while (x<=50);

	}

}
