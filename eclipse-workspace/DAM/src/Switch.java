import java.util.*;
public class Switch {

	public static void main(String[] args) {
	
		System.out.println("Elija la figura de la que desea hallar: \n1.Cuandrado \n2.Tri�ngulo \n3.Rect�ngulo \n4.C�rculo");
		Scanner entrada = new Scanner(System.in);
		int eleccion = entrada.nextInt();
		switch(eleccion) {
		
		case 1: 
			System.out.println("Introduzca el lado del cuadrado");
			
			double lado = entrada.nextDouble();
			
			System.out.println("El �rea del cuadrado de lado " + lado + " es de " + Math.pow(lado, 2));
			
			break;
			
		case 2:
			System.out.println("Introduce la base del tir�ngulo");
			
			double base = entrada.nextDouble();
			
			System.out.println("Introduce la altura del tri�ngulo");
			
			double altura = entrada.nextDouble();
			
			System.out.println("El �rea del tri�ngulo de base " + base + "  y altura  " + altura + " es de " + (base*altura/2));
		}

	}

}
