import java.util.*;
public class Elevator {
	
	public static void main(String[] args)
	 {
	 Scanner entrada = new Scanner(System.in);
	 System.out.print("Floor: ");
	 int planta = entrada.nextInt();
	 int plantaReal;
	if (planta>13){
		plantaReal = planta -1;
		
	}else{
		plantaReal=planta;
	}
	 {
	 // Now we know that the user entered an integer
	int floor = entrada.nextInt();
	if (planta==13)
	 {
	 System.out.println("Error: There is no thirteenth floor.");
	 }
	else if (planta <=0 || floor > 18)
	 {
	 System.out.println("Error: The floor must be between 1 and 18.");
	 }
	 else
	 {
	 
	int actualFloor = floor;
	if (entrada.hasNextInt())
	 {
	 plantaReal = planta - 1;
	 }
	System.out.println("The elevator will travel to the actual floor "
	 + plantaReal);
	 }
	 }
	else{
	 System.out.println("Error: Not an integer.");
	 }
	 }

}
