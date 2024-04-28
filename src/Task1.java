import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {
		var scanner = new Scanner(System.in);

		System.out.print("Введите значение x: ");
		double x = scanner.nextDouble();

		System.out.print("Введите количество членов ряда (N): ");
		int N = scanner.nextInt();

		System.out.print("Введите значение M: ");
		double M = scanner.nextDouble();

		double sum = 0.0;
		double sumAnother = 0.0;

		for (int n = 0; n < N; n++) {
			double item = 1.0 / Math.pow(x, 2 * n - 2);
			sum += item;
			if (item < M) {
				sumAnother += item;
			}
		}

		System.out.println("Сумма первых " + N + " членов ряда: " + sum);
		System.out.println("Сумма членов ряда, меньших " + M + ": " + sumAnother);
	}
}