public class PrintNDecrOrder {
    public static void decrN(int n) {
        if (n == 1) {
            System.out.println(n);
            return;
        }
        System.out.print(n+" ");
        decrN(n - 1);
    }
    public static void main(String args[]) {
        int n = 10;
        decrN(n);
    }
}
