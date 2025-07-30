import java.util.*;

public class MultiDarrayList {
    public static ArrayList<ArrayList<Integer>> mulArrLst(ArrayList<ArrayList<Integer>> mulArrayLst) {
        // ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        // ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(2, 4, 6, 8, 10));
        // ArrayList<Integer> list3 = new ArrayList<>(Arrays.asList(3, 6, 9, 12, 15));

        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();

        for (int i = 1; i <= 5; i++) {
            list1.add(i * 1);
            list2.add(i * 2);
            list3.add(i * 3);
        }
        mulArrayLst.add(list1);
        mulArrayLst.add(list2);
        mulArrayLst.add(list3);

        list2.remove(2);
        list3.remove(1);

        return mulArrayLst;
    }
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mulArrayLst = new ArrayList<>();
        // System.out.println(mulArrLst(mulArrayLst));
        mulArrLst(mulArrayLst);
        for (int i = 0; i < mulArrayLst.size(); i++) {
            System.out.println(mulArrayLst.get(i));
        }
    }
}
