package lab8;

import java.util.ArrayList;
import java.util.Random;

public class Arrays {
	public static void main(String[] args) {
		// getodds
		getOdds();

		// merge array
		String[] merger = new String[5];
		merger[0] = "value0";
		merger[1] = "value1";
		merger[2] = "value2";
		merger[3] = "value3";
		merger[4] = "value4";
		System.out.println(join(merger));

		// pick 5
		ArrayList<String> stringArray = new ArrayList<String>();
		stringArray.add("a");
		stringArray.add("b");
		stringArray.add("c");
		stringArray.add("d");
		stringArray.add("e");
		stringArray.add("f");
		stringArray.add("g");
		stringArray.add("h");
		stringArray.add("i");

		Random gen1 = new Random();

		for (int i = 0; i < 5; i++) {
			int mySelection = gen1.nextInt(stringArray.size());
			System.out.println(stringArray.get(mySelection));
			stringArray.remove(mySelection);
		}
	}

	public static String join(String[] merger) {
		// merge array values into one string
		String merged = "";
		for (int i = 0; i < merger.length; ++i) {
			merged = merged + merger[i] + ",";
		}
		merged = merged.substring(0, merged.length() - 1);
		return merged;
	}

	public static void getOdds() {
		// rolls 1-6 a lot and then prints out the results
		Random generator = new Random();
		int rollCount = 100000;
		// [0] = random number, [7] = total, [1-6] = dice numbers
		int[] diceArray = new int[8];

		for (int i = 0; i < rollCount; i++) {
			diceArray[0] = generator.nextInt(6) + 1;
			if (diceArray[0] == 1) {
				diceArray[1] = diceArray[1] + 1;
			} else if (diceArray[0] == 2) {
				diceArray[2] = diceArray[2] + 1;
			} else if (diceArray[0] == 3) {
				diceArray[3] = diceArray[3] + 1;
			} else if (diceArray[0] == 4) {
				diceArray[4] = diceArray[4] + 1;
			} else if (diceArray[0] == 5) {
				diceArray[5] = diceArray[5] + 1;
			} else {
				diceArray[6] = diceArray[6] + 1;
			}
			diceArray[7] = diceArray[7] + 1;
		}
		// output
		for (int i = 1; i < diceArray.length; ++i) {
			System.out.println(diceArray[i]);
		}
	}
}
