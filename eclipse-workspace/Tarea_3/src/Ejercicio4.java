import java.util.*;

public class Ejercicio4 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Introduce la base");
		double base = entrada.nextDouble();

		System.out.println("Introduce el exponente");
		double exponente = entrada.nextDouble();

		double potencial = Math.pow(base, exponente);

		System.out.printf("%.02f", potencial);

	}

}
