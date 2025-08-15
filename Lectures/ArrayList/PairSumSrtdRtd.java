import java.util.*;

public class PairSumSrtdRtd {
    public static boolean pairSum(ArrayList<Integer> list, int target) {
        //Breaking point
        int pivot = -1;
        int n = list.size();
        for (int i = 0; i < list.size()-1; i++) {
            if (list.get(i) > list.get(i + 1)) {
                pivot = i;
                break;
            }
        }
        int lp = pivot + 1;
        int rp = pivot;

        while (lp != rp) {
            if(list.get(lp) + list.get(rp) == target){
                return true;
            }
            if(list.get(lp) + list.get(rp) < target){
                lp = (lp + 1) % n;
            } else {
                rp = (n + rp -1) % n;
            }
        }
        return false;
    }
    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(11, 15, 6, 8, 9, 10));
        System.out.println(pairSum(list, 17));
    }
}
