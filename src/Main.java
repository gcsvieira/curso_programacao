import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		double x;
		
		Scanner sc = new Scanner(System.in);
		x = sc.nextDouble();
	
		System.out.printf("Você digitou: %.2f%n", x);
		
		sc.close();
	}

}
