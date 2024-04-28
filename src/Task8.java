import java.util.Scanner;

public class Task8 extends MyFunction {
	public static void main(String[] args) {
		var scanner = new Scanner(System.in);
		var task = new Task8();

		final var r = 1d;
		final var y = 1d;

		var sum = 0d;
		for (var i = 0; i < 10; i++) {
			System.out.print("["+(i+1)+"] Enter value: ");
			var t = scanner.nextDouble();
			var result = task.FunctionMy(t, r, y);
			sum += result;
		}
		System.out.println("Sum: " + sum);
	}
}