import java.util.*;
public class Ejercicio5 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("¿Cuantos numeros quieres introducir?");
		int X = entrada.nextInt();
		System.out.println("Introduce los " + X + " numeros");
		
		int max=-999999;
		int min=999999;
		
		for (int i=0; i<X;i++) {
			
			int num=entrada.nextInt();
			
			
			if(num>max) {
				max=num;
			}
			if(num<min) {
				min=num;
			}
			
		}
		
		System.out.print(max);
		System.out.println(" " + min);
			
					
		

	}

}
