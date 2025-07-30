import java.util.*;

public class PairSum2P {
    public static boolean pairSum(ArrayList<Integer> list, int target){
        int lp = 0;
        int rp = list.size() - 1;
        while (lp < rp) {
            if (list.get(lp) + list.get(rp) == target) {
                return true;
            }else if(list.get(lp) + list.get(rp) > target){
                rp--;
            } else {
                lp++;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        System.out.println(pairSum(list, 12));
    }
}