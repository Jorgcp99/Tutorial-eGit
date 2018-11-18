import java.util.*;
public class AñosPeso {
	
	private static int edad ;
	private  static double  peso ;
	
	public static void AñosPeso () {
		
Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduzca su edad por favor.");
		 edad = Integer.parseInt(entrada.nextLine());
		
		System.out.println("Introduzca su peso por favor.");
		  peso = Double.parseDouble(entrada.nextLine());
		
	}
	
	public int getEdad(int edad) {
		return edad;
	}
	public double getPeso(double peso) {
		return peso;
	}

	public static void main(String[] args) {
		
		AñosPeso info=new AñosPeso();
		AñosPeso();
		
		
		System.out.println("Usted tiene " + info.getEdad(edad) + " años y pesa " + info.getPeso(peso) + " kg");
		System.out.printf("Tienes %d años\ty pesas %10.1d kilos\n",edad, peso);

	}

}
