public class Task2 {
	public static void main(String[] args) {
		int count = 0;
		for (int i = 0; i <= 999; i++) {
			for (int j = 0; j <= 999; j++) {
				int firstPart = i;
				int secondPart = j;

				int firstSum = 0;
				int secondSum = 0;

				while (firstPart > 0) {
					firstSum += firstPart % 10;
					firstPart /= 10;
				}

				while (secondPart > 0) {
					secondSum += secondPart % 10;
					secondPart /= 10;
				}
				
				if (firstSum == 13 && secondSum == 13) {
					count++;
				}
			}
		}

		System.out.println("Количество счастливых билетов: " + count);
	}
}