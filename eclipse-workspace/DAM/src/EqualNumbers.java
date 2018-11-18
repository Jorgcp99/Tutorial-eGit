
public class EqualNumbers {

	public static void main(String[] args) {
		
		String first = "Uda";
		String second = "City";
		String firstAndSecond = first + second;
		String thrird = "Udacity";
		
		if(firstAndSecond.equalsIgnoreCase(thrird)) {
			
			System.out.println("They are the same");
		}else {
			
			System.out.println("firstAndSecond is " + firstAndSecond);
		}
	
	}

}
