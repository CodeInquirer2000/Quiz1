
public class Quiz1Tester {

	public static void main(String[] args) {
		Quiz1 test = new Quiz1();
		int [] grades = new int []{8,7,10,9};
		String [] like = new String [] {"01/23 Lionel", "02/18 Darnold", "06/19 Mike", "06/05 Beverly", "06/26 Frankie", "07/20 Khalil", "01/05 Turtle", "12/16 Gabe", "03/18 Nancy"};
		System.out.println(test.aimToTen(grades));
		System.out.println(test.getNextBirthday("02/19",like));
	}

}
