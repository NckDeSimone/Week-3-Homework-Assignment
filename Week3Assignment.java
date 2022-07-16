
public class Week3Assignment {

	public static void main(String[] args) {}


	// QUESTION 1
//		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
//		
//		for (int age: ages) {
//			System.out.println(age);
//		}

		
		
	// QUESTION 2
//		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
//		System.out.println(ages[ages.length - 1] - ages[0]);

		
		
	// QUESTION 3
//		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93, 103};
//		System.out.println(ages[ages.length - 1] - ages[0]);

		
		
	// QUESTION 4
//		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
//		int sumAge = 0;
//		
//		for (int age : ages) {
//			sumAge = sumAge + age;
//		}
//		System.out.println(sumAge / ages.length);

		
		
	// QUESTION 5
//		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
//		for (String name: names) {
//			System.out.println(name);
//		}

		
		
	// QUESTION 6
//		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
//		int sumLetters = 0;
//		for(String name: names) {
//			sumLetters = sumLetters + name.length();
//		}
//		System.out.println(sumLetters/names.length);

		
		
	// QUESTION 7
//		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
//		for (String name: names) {
//			System.out.print(name + " ");
//		}

		
		
	// QUESTION 8
//		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
//		int[] nameLengths = new int[names.length];
//		for(String name: names) {
//			int i = 0;
//			nameLengths[i] = name.length();
//			System.out.println(nameLengths[i]);
//			i++;
//		}

		
		
	// QUESTION 9
//		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
//		int[] nameLengths = new int[names.length];
//		int sumNameLengths = 0;
//		for (String name: names) {
//			int i = 0;
//			nameLengths[i] = name.length();
//			sumNameLengths = sumNameLengths + nameLengths[i];
//			i++;
//			}
//		System.out.println(sumNameLengths);

		
		
	// QUESTION 10
//		System.out.println(concatenate("Hello", 3));
//	}
//	public static String concatenate(String word, int n) {
//			String result = "";
//			for (int i = 0; i < n; i++) {
//				result += word;
//			}
//			return result;
//	}
		
		
		
//		QUESTION 11
//		System.out.println(fullName("Nicholas", "DeSimone"));
//	}
//	public static String fullName(String firstName, String lastName) {
//		String result = firstName + " " + lastName;
//		return result;
//	}


		
//		QUESTION 12
//		int[]numbers0 = {101};
//		int[]numbers1 = {100};
//		
//		System.out.println(moreThanOneHundred(numbers0));
//		System.out.println(moreThanOneHundred(numbers1));
//	}
//	public static boolean moreThanOneHundred(int[] arrayOfInts) {
//		boolean result;
//		int sumArr = 0;
//		for (int arrayOfInt: arrayOfInts) {
//			sumArr = sumArr + arrayOfInt;
//			}
//		if (sumArr > 100) {
//			result = true;
//		} else
//			result = false;
//		return result;
//	}
		
		
		
//		QUESTION 13
//		double[] numbers0 = {101.1, 221.1, 23.341, 2.43};
//		double[] numbers1 = {100, 13.4, 12.5, 21.9, 1.33};
//		System.out.println(avg(numbers0));
//		System.out.println(avg(numbers1));
//	}
//	
//	public static double avg(double[] arrayOfDoubles) {
//		double sumArr = 0;
//		for (double arrayOfDouble : arrayOfDoubles) {
//			sumArr = sumArr + arrayOfDouble;
//		}
//		return(sumArr / arrayOfDoubles.length);
//	}

		
		
//		QUESTION 14
//		double[] numbers0 = {101.1, 221.1, 23.341, 2.43};
//		double[] numbers1 = {100, 13.4, 12.5, 21.9, 1.33};
//		System.out.println(largerAvg(numbers0, numbers1));
//	}
//	
//	public static boolean largerAvg(double[] arrayOne, double[] arrayTwo) {
//		
//		double sumOne = 0;
//		double sumTwo = 0;
//		for (double i : arrayOne) {
//			sumOne = sumOne + i;
//		}
//		for (double i : arrayTwo) {
//			sumTwo = sumTwo + i;
//		}
//		if (sumOne / arrayOne.length > sumTwo / arrayTwo.length) {
//			return true;
//		}
//		else return false;
//	}

		
		
//		QUESTION 15
//		boolean itsHot0 = true;
//		boolean itsHot1 = false;
//		
//		double pocketCash0 = 1.50;
//		double pocketCash1 = 10.50;
//		double pocketCash2 = 100.50;
//		
//		System.out.println(willBuyDrink(itsHot0, pocketCash0));
//		System.out.println(willBuyDrink(itsHot0, pocketCash1));
//		System.out.println(willBuyDrink(itsHot0, pocketCash2));
//		System.out.println(willBuyDrink(itsHot1, pocketCash0));
//		System.out.println(willBuyDrink(itsHot1, pocketCash1));
//		System.out.println(willBuyDrink(itsHot1, pocketCash2));
//	}
//
//	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
//		if(isHotOutside == true && moneyInPocket > 10.50) {
//			return true;
//		}else return false;
//	}
		
		
		
//		QUESTION 16
//		
//		int[] sallyGrades = { 60, 60 };
//		System.out.println(finalGrade(sallyGrades));
//	}
////This method can be used to determine a students letter grade based off their scores that 
////they have earned so far.
//		
//	public static char finalGrade(int[] grades) {
//		int numericGrade = 0;
//		int sumGrades = 0;
//		char grade;
//		for (int i = 0; i < grades.length; i++) {
//			sumGrades = sumGrades + grades[i];
//		}
//		numericGrade = sumGrades / grades.length;
//		switch (numericGrade / 10) {
//		case 10:
//		case 9:
//			grade = 'A';
//			break;
//		case 8:
//			grade = 'B';
//			break;
//		case 7:
//			grade = 'C';
//			break;
//		case 6:
//			grade = 'D';
//			break;
//		default:
//			grade = 'F';
//			break;
//		}
//		return grade;
//	}
}
