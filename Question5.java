package assigment3;

public class Question5 {

	public static void main(String[] args) {
		
		int inputsecond,hours,minutes,seconds;
		inputsecond=7695;
		
		hours=inputsecond/3600;
		minutes=(inputsecond%3600)/60;
		seconds=(inputsecond%3600)%60;
		
		System.out.println(" input second is "+inputsecond);
		System.out.println(hours+" hours,"+minutes+" minutes, and "+seconds+" seconds");
		

	}

}
