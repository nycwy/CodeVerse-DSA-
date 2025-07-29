import java.util.*;

public class Swapping {
    public static ArrayList<Integer> swap(ArrayList<Integer> list, int idx1, int idx2) {
        for (int i = 0; i < list.size(); i++) {
            int temp = list.get(idx1);
            list.set(idx1, list.get(idx2));
            list.set(idx2, temp);
        }
        return list;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(2, 5, 9, 3, 6));
        System.out.println(swap(list, 1, 3));
    }
}
