
public class StringBinaryDemo{

	public static void driverCode(String input) {
		int onesCount = 0;
		int zerosCount = 0;
		boolean isOnesCountMax = true;

		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == '1')
				onesCount = onesCount + 1;
		}

		zerosCount = input.length() - onesCount;

		if (onesCount == 0 || onesCount == input.length())
			System.out.println(input);

		else {
			isOnesCountMax = onesCount >= zerosCount ? true : false;
			int j = isOnesCountMax ? zerosCount : onesCount;

			printData(j, "10");

			if (onesCount != zerosCount) {
				if (isOnesCountMax) {
					printData(onesCount - j, "1");
				} else {
					printData(zerosCount - j, "0");
				}
			}
		}
	}

	public static void printData(int temp, String whatToPrint) {
		while (temp > 0) {
			System.out.print(whatToPrint);
			temp--;
		}
	}

	public static void main(String[] args) {
		String s1 = "000111000111111111111";
		driverCode(s1);
	}

}
