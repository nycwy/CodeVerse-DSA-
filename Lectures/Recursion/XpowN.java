// public class XpowN {
//     public static int pow(int x, int n) {
//         if (n == 0) {
//             return 1;
//         }
//         return x * pow(x, n - 1);
//     }
//     public static void main(String args[]) {
//         System.out.println(pow(2,10));
//     }
// }

//Optimized
public class XpowN {
    public static int optimizedPower(int x, int n) {
        if (n == 0) {
            return 1;
        }
        int halfPower = optimizedPower(x, n / 2);
        int halfPowerSq = halfPower * halfPower;

        //when n is odd
        if (n % 2 != 0) {
            halfPowerSq = x * halfPowerSq;
        }

        return halfPowerSq;
    }
    public static void main(String[] args) {
        System.out.println(optimizedPower(2, 10));
    }
}