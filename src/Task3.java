public class Task3 {
	public static void main(String[] args) {
		System.out.println("Sum1: " + Sum1());
		System.out.println("Sum2: " + Sum2());
		System.out.println("Sum3: " + Sum3());
	}
	public static double Sum1() {
		var sum = 0f;
		for (var i = 1; i <= 8; i ++) {
			for (var j = 1; j <= i; j++) {
				sum += j * j;
			}
		}
		return sum;
	}
	public static double Sum2() {
		var sum = 0d;
		for (var i = 1; i <= 8; i++) {
			var localProduct = 1d;
			for (var j = 1; j <= i * 2; j++) {
				localProduct *= (Math.pow(j, 3) + Math.pow(i, 2));
			}
			sum += localProduct;
		}
		return sum;
	}
	public static double Sum3() {
		var sum = 0;
		for (var i = 1; i <= 8; i++) {
			for (var j = 1; j <= i; j++) {
				for (var k = 1; k <= 3; k++) {
					sum += (j * j + i + k);
				}
			}
		}
		return sum;
	}
}