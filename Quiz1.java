import java.util.Arrays;

/** CSC 221 Quiz 1
 * 
 * @author: Khalil Adams
 * 
 */

public class Quiz1 {	
	/**
	 * Gets the next birthday starting today, using a list of friends 
	 * and their birthdates.
	 * 
	 * @param todaysDate - a string
	 * @param friends - an array of strings
	 * @return - name of the friend with the next birthday starting from today's date
	 */
	public String getNextBirthday(String todaysDate, String[] friends) {
		// fill in code here
		int bMonth = Integer.parseInt(todaysDate.substring(0, 2));
		int bDay = Integer.parseInt(todaysDate.substring(3));
		Arrays.sort(friends);
		for(int i = 0; i < friends.length; i++) {
			if(Integer.parseInt(friends[i].substring(0,2)) == bMonth) {
				if(Integer.parseInt(friends[i].substring(3,5)) > bDay) {
					return friends[i].substring(5);
				}
			}
				
				if(Integer.parseInt(friends[i].substring(0,2)) > bMonth)
					return friends[i].substring(5);
		}
		
		return friends[0].substring(0);
	}

	/**
	 * Determine how many more perfect grades you need 
	 * to earn a 10 in the class.
	 * 
	 * @param marks - an integer array of current grades 
	 * with values 0 to 9
	 * @return the integer number of perfect 10s needed to 
	 * earn a 10
	 */
	public int aimToTen(int[] marks) {
		int sum = 0;
		for(int i = 0; i < marks.length; i++) {
			sum +=  marks[i];
		}
		int ideal = marks.length*10;
		int gap = ideal-sum;
		double perfAssignments = gap/0.5;
		if(perfAssignments-(int)perfAssignments >= 0.5)
			return (int)perfAssignments + 1;
		else
			return (int)perfAssignments;
	}
	

	
}

