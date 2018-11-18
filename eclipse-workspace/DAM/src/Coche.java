
public class Coche{
	
	public static void main(String[] args) {
		
		
	}
		Integer cilindrada;
		String color;
		Double precio;
		boolean isArrancado;
		private double milesDriven;
		private double gasInTank;
		private double milesPerGallon;
		/**
		 * Coche con cilindrada, color y precio esfecífico.
		 * 
		 * @param cilindrada la cilindrada del motor
		 * @param color el color del chasis
		 * @param precio el precio de fábrica
		 */
		public Coche(Integer cilindrada, String color, Double precio) {
			cilindrada= 1800;
			color = "plata";
			precio = 25000.0;
		}
		/**
		 * Si está arrancado imprime por pantalla ¡Brrr! y si no imprime ¡Kishc Kisch!
		 * 
		 */
		
		public void arrancar() {
			if (isArrancado != true) {
			isArrancado = true;
			System.out.println ("¡¡¡Brrrrrrr!!! El coche acaba de arrancar.");
			} else {
			System.out.println ("¡¡¡Kisch, kishch!!! El coche ya está arrancado.");
			}
			}
		
		
		public void verCoche() {
			System.out.println("Este coche es de color " + color + " tiene una cilindrada de " +cilindrada  +" y cuesta " + precio + " euros.");
			if (isArrancado == true) {
			System.out.println ("Ahora mismo está arrancado.");
			} else {
			System.out.println ("Ahora mismo está parado.");
			}
			}
		public void drive(double distance) {
			this.milesDriven = this.milesDriven + distance;
			double gasConsumed = distance/this.milesPerGallon;
			this.gasInTank = this.gasInTank - gasConsumed;
		}
		public void addGas(double amount) {
			gasInTank = gasInTank + amount;
		}

	}
	

		

	