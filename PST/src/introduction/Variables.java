package introduction;

public class Variables {

	public static void main(String[] args) {
		int firstNumber;
		firstNumber = 0;
		System.out.println(firstNumber);

		int secondNumber = 5;
		double sum = (double)firstNumber / secondNumber;
		System.out.println(sum);

		boolean alwaysTrue = true;

		String firstName = "Petar";
		String lastName = "Petrovic";
		char space = ' ';
		System.out.println(firstName + space + lastName + " Njegos");

		if(alwaysTrue)
			System.out.println("Tacno!");

		if(firstNumber > 0)
			System.out.println("Broj je pozitivan!");
		else if(firstNumber < 0)
			System.out.println("Broj je negativan!");
		else
			System.out.println("Broj je nula!");
		
		System.out.println("Pomocu while od 1 do 10");
		
		int i = 1;
		while(i <= 10) {
			System.out.println(i);
			//i = i + 1;
			i++;
		}
		
		System.out.println("Pomocu while ispisati od 8 do 3");
		i = 8;
		while(i > 2) {
			System.out.println(i);
			i--;
		}
		
		System.out.println("Faktorijel broja 5 pomocu while");
		i = 1;
		int factorialNumber = 5;
		int factorial = 1;
		while(i <= factorialNumber) {
			factorial = factorial * i;
			i++;
		}
		System.out.println("Faktorijel broja " + factorialNumber + " je " + factorial);
		
		System.out.println("Pomocu for od 1 do 10");
		for(int j = 1;j<11;j++) {
			System.out.println(j);
		}
		
		System.out.println("Pomocu for ispisati parne brojeve u intervalu od 1 do 20");
	}
}
