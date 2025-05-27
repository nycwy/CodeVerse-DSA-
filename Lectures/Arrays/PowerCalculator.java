public class PowerCalculator {
    public double myPow(double x, int n) {
        long power = n;
        if (power < 0) {
            x = 1 / x;
            power = -power;
        }

        double result = 1.0;
        double currentProduct = x;

        while (power > 0) {
            if ((power & 1) == 1) {
                result *= currentProduct;
            }
            currentProduct *= currentProduct;
            power >>= 1;
        }

        return result;
    }

    public static void main(String[] args) {
        PowerCalculator calc = new PowerCalculator();
        System.out.println(calc.myPow(2.0, 10)); // Output: 1024.0
        System.out.println(calc.myPow(2.1, 3)); // Output: 9.261
        System.out.println(calc.myPow(2.0, -2)); // Output: 0.25
    }
}
