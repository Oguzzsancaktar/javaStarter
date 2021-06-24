package intro;

public class Main {

	public static void main(String[] args) {
		String myName = "Oğuz!";
		String myWomanName = "Damla!";
		double myLength = 1.83;
		double myWomanLength = 1.60;
		int myAge =  22;
		boolean isAlive = true;
		
		System.out.println(isAlive);
		
		if (myLength > myWomanLength) {
			System.out.println(myName);
		}else if(myWomanLength == myLength) {
			System.out.println("eşit");
		}
		else {
			
			System.out.println(myWomanName);
		}
	}

}