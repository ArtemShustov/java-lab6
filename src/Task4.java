import java.util.Scanner;

public class Task4 {
	public static void main(String[] args) {
		var scanner = new Scanner(System.in);

		while (true) {
			System.out.print("Enter decimal number: ");
			var number = scanner.nextInt();

			var base = 1;
			while (true) {
				System.out.print("Enter base: ");
				base = scanner.nextInt();
				if (base >= 2 && base <= 35) { // 9 numbers + 26 letters
					break;
				}
				System.out.println("Error!");
			}
			System.out.println(DecimalToBase(number, base));

			System.out.println("Do you want to continue? (true/false)");
			if (!scanner.nextBoolean()) {
				break;
			}
		}
	}
	public static String DecimalToBase(int decimalNumber, int base) {
		var result = "";
		while (decimalNumber != 0) {
			var shit = (decimalNumber % base);
			result = (shit < 10 ? Integer.toString(shit) : ((char)((int)'A' + shit - 10)) ) + result;
			decimalNumber /= base;
		}
		return result;
	}
}