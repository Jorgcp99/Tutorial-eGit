import java.util.*;
public class Cuadrado_con_Cuadrado {

	public static void main(String[] args) {
		
		Scanner entrada=new Scanner(System.in);
		System.out.println("Introduzca el ancho");
		int anchura = entrada.nextInt();
		System.out.println("Introduce el alto");
		int altura = entrada.nextInt();
		String salida="";
		if((altura>3&&altura<6)&&(anchura>3&&anchura<6)) {
			salida="azul";
		}else{
			salida="blanco";
		}
		System.out.println("El color es: " + salida);
		
	
		

	}

}
