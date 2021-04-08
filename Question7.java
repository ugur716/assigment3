package assigment3;

public class Question7 {

	public static void main(String[] args) {
		
		int cent=95;
		int dollar=100;
		int nickles=(dollar-cent)/5;
		int dimes=(dollar-cent)/10;
		int quarters=(dollar-cent)/25;
		
		System.out.println(" price in sents :"+cent);
		System.out.println("Your change is "+quarters+" quarters,"+dimes+" dimes,"+" and "+nickles+" nickles");
		
	}

}
