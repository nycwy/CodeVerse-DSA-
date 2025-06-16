public class NthFibonacci {
    public static int fibo(int n) {
        if (n == 1 || n == 0) {
            return n;
        }
        int fNm1 = fibo(n - 1);
        int fNm2 = fibo(n - 2);
        int fN = fNm1 + fNm2;
        return fN;
    }
    public static void main(String args[]) {
        int n = 40;
        System.out.println(fibo(n));
    }
}
