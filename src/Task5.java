import java.util.Scanner;

public class Task5 {
	public static void main(String[] args) {
		var scanner = new Scanner(System.in);
		var x = scanner.nextDouble();

		var target = Math.pow(Math.cos(x), 3);
		System.out.println("Target: " + target);
		for (double n = Math.pow(10, 2); n <= Math.pow(10, 4); n++) {
			var result = Calc(x, 1/n);
			System.out.println("При погрешности " + (1/n) + "; \n  F = " + result + "; \n  Итоговая погрешность: " + (target - result));
		}
		System.out.println("Target: " + target);
	}
	public static long Factorial(long n) {
		long result = 1;
		for (long i = 1; i <= n; i++) {
			result *= i;
		}
		return result;
	}
	public static double Calc(double x, double e) {
		var target = Math.pow(Math.cos(x), 3);

		var sum = 0d;
		for (int n = 0; Math.abs(target - (sum/4d)) > e; n++) {
			sum += Math.pow(-1, n) * ((Math.pow(3, 2*n) + 3) / Factorial(2 * n)) * Math.pow(x, 2*n);
		}
		return sum / 4d;
	}
}