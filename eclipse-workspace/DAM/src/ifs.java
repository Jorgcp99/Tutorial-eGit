import java.util.*;
public class ifs {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.print("Introduzca un entero positivo: ");
		int numero = entrada.nextInt();
		String resultado="";
		
		if(numero<10) {
			resultado="1 cifra";
		}else if(numero<100) {
			resultado="2 cifras";
		}else {
			resultado="más de dos cifras";
		}
		System.out.println("El número tiene " + resultado);
		

	}

}
