public class FactorialOfN {
    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        int fNm1 = factorial(n - 1);
        int fN = n * fNm1;
        return fN;
    }
    public static void main(String args[]) {
        int n = 5;
        System.out.println(factorial(n));
    }
}
