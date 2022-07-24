package recursion;
import java.util.Scanner;


public class Recursion {

public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduce un número entero: ");
		int num = teclado.nextInt();
		teclado.close();
		int total = sumatorio(num);

		System.out.printf("%nEl sumatorio de 1 a %d es: %d%n", num, total);
	}

	private static int sumatorio(int num){
		if(num==1){
			return 1;
		}
		else{
			return num + sumatorio(num-1);
		}
	}

}
