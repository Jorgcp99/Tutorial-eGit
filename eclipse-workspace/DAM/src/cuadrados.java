import java.util.Scanner;

public class cuadrados {
	
public static void main(String[] args) {
		
		Scanner entrada=new Scanner(System.in);
		System.out.println("Introduzca el ancho");
		int w = entrada.nextInt();
		System.out.println("Introduce el alto");
		int h = entrada.nextInt();
		int a= 0;
		int b= 0;
		int posicion;
		
		posicion=w>3?(w<6?(h>3?(h<6?a:b):b):b):b;
		
		System.out.println(posicion);
		
		
}

}
