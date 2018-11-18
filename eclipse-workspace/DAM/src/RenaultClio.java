
public class RenaultClio {
	
	private int kilometros;
	private double gasolina;
	static int unidadesVendidas;
	
	public RenaultClio(int kilometros, double gasolina) {
		this.kilometros=kilometros;
		this.gasolina=gasolina;
		unidadesVendidas ++;
	}

	public int getKilometros() {
		return kilometros;
	}

	public void setKilometros(int kilometros) {
		this.kilometros = kilometros;
	}

	public double getGasolina() {
		return gasolina;
	}

	public void setGasolina(double gasolina) {
		this.gasolina = gasolina;
	}

	public static void main(String[] args) {
		
		RenaultClio miCoche = new RenaultClio(0, 10);
		
		System.out.println(miCoche.unidadesVendidas);
		
		RenaultClio miNuevoCoche = new RenaultClio(1000, 5);
		
		System.out.println(RenaultClio.unidadesVendidas);
		
		System.out.println(RenaultClio.unidadesVendidas);

		System.out.println(miCoche + "tiene " + miCoche.getKilometros() + " km y " + miCoche.getGasolina()+ " litros de gasofa");

	}

}
