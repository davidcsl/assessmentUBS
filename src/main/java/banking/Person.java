package banking;

import java.util.Arrays;

public class Person {
	private String firstName;
	private String lastName;

	public Person(String firstName, String lastName, int idNumber) {
		// complete the function
	}

	public String getFirstName() {
		// complete the function
        return null;
	}

	public String getLastName() {
		// complete the function
        return null;
	}


//Others for testing and example purpose

	public int[] reSort(int[][] firstArr){
		int[] finalArr = new int[18];
		for (int i = 0; i <firstArr.length ; i++) {
			for (int j = 0; j <firstArr[i].length ; j++) {
				finalArr[i+j]=firstArr[i][j];
			}
		}
		Arrays.sort(finalArr);
		return finalArr;
	}
}
