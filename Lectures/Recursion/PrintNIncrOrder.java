public class PrintNIncrOrder {
    public static void increN(int n) {
        if (n == 1) {
            System.out.print(n+" ");
            return;
        }
        increN(n - 1);
        System.out.print(n+" ");
    }
    public static void main(String args[]) {
        int n = 10;
        increN(n);
    }
}
