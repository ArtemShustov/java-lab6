import java.util.Scanner;

public class Task10 {
	public static void main(String[] args) {
		var scanner = new Scanner(System.in);
		var target = 0;
		var e = 0;

		var base = 1d;

		for (var magic = 1; magic <= 4; magic++) {
			var n = Math.pow(10, magic);
			var h = (2 - base) / n;

			var sum = 0d;
			for (int i = 0; i < n; i++) {
				sum += (Func(base + h * i) + Func(base + h * (i + 1))) / 2 * h;
			}
			sum = Math.abs(sum);
			System.out.println(n + ";	" + h + ";	" + sum + "; 	" + target + ";		" + Math.abs(target - sum));
		}
	}
	private static double Func(double x) {
		return Math.sin(x) - x*x;
	}
}
