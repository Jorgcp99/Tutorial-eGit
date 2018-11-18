import java.util.*;
public class Switch {

	public static void main(String[] args) {
	
		System.out.println("Elija la figura de la que desea hallar: \n1.Cuandrado \n2.Triángulo \n3.Rectángulo \n4.Círculo");
		Scanner entrada = new Scanner(System.in);
		int eleccion = entrada.nextInt();
		switch(eleccion) {
		
		case 1: 
			System.out.println("Introduzca el lado del cuadrado");
			
			double lado = entrada.nextDouble();
			
			System.out.println("El área del cuadrado de lado " + lado + " es de " + Math.pow(lado, 2));
			
			break;
			
		case 2:
			System.out.println("Introduce la base del tirángulo");
			
			double base = entrada.nextDouble();
			
			System.out.println("Introduce la altura del triángulo");
			
			double altura = entrada.nextDouble();
			
			System.out.println("El área del triángulo de base " + base + "  y altura  " + altura + " es de " + (base*altura/2));
		}

	}

}
