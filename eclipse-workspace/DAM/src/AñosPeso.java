import java.util.*;
public class A�osPeso {
	
	private static int edad ;
	private  static double  peso ;
	
	public static void A�osPeso () {
		
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
		
		A�osPeso info=new A�osPeso();
		A�osPeso();
		
		
		System.out.println("Usted tiene " + info.getEdad(edad) + " a�os y pesa " + info.getPeso(peso) + " kg");
		System.out.printf("Tienes %d a�os\ty pesas %10.1d kilos\n",edad, peso);

	}

}
