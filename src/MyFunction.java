import java.util.Scanner;

public class MyFunction {
    public double FunctionMy(double t, double r, double y) {
        return W(t, r, y);
    }
    private double W(double t, double r, double y) {
        return (4 * Math.pow(t, 3) + Math.log(r)) / (Math.pow(Math.E, y + r) + 7.2d * Math.sin(r));
    }
    private double L(double b, double z, double x, double y, double a) {
        return b * Math.pow(z, 2)
                - 5 * x * y * Math.sin(Math.pow(Math.PI, 2) - 2 * Math.PI * x * y * z)
                - a * ( (Math.abs(x - Math.pow(y, 2) + z * Math.cos(x + y - z)) + Math.E)
                /(Math.pow(z, 3) * (x - 5 * y) + Math.pow(z, x * y)) );
    }
}
