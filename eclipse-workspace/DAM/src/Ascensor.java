import java.util.*;
public class Ascensor {
	
	public static void main(String[] args)
	 {
	 Scanner entrada = new Scanner(System.in);
	 System.out.println("Introduce un numero entre 0 y 30");
	int x = entrada.nextInt();
	
	if(x<=10) {
		
		System.out.println("Estas en el azul");
	}else if(x<=20) {
		
		System.out.println("Estas en el blanco");
	}else if(x<=30){
		
		System.out.println("Estas en el rojo");
	}else {
		System.out.println("Número no válido, introduzca un número válido");
	}
	
	 }
}
