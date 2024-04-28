import java.util.Scanner;

public class Task9 {
	public static void main(String[] args) {
		var scanner = new Scanner(System.in);

		System.out.print("Enter x: ");
		var x = scanner.nextInt();
		System.out.print("Enter p: ");
		var p = scanner.nextInt();

		System.out.println("Точность;	Результат;	Итераций;");
		for (double n = -2; n >= -6; n--) {
			var e = Math.pow(10, n);

			var y = Math.exp(Math.log(x * (p + 1)) / p); // y0
			var yLast = 0d + e * 2;
			var iterCount = 0;
			while (Math.abs(y - yLast) > e) {
				yLast = y;
				y = Func(p, x, y);
				iterCount++;
			}
			System.out.println(e + ";	" + y + ";	" + iterCount);
		}
	}
	private static double Func(double p, double x, double y) {
		return (1/p) * ((p - 1) * y + (x / Math.pow(y, p - 1)));
	}
}
