import java.util.*;

public class MaxNum {
    public static int maxNum(ArrayList<Integer> list) {
        int maxVal = Integer.MIN_VALUE;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > maxVal) {
                maxVal = list.get(i);
            }
        }
        return maxVal;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(2, 5, 9, 3, 6));
        System.out.println(list);
        System.out.println("Maximum Elemment in a list is: "+maxNum(list));;
    }
}
