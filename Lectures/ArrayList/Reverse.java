import java.util.ArrayList;

public class Reverse {
    public static ArrayList<Integer> reverseList(ArrayList<Integer> list) {
        ArrayList<Integer> reversedList = new ArrayList<>();
        for (int i = list.size()-1; i >= 0; i--) {
            reversedList.add(list.get(i));
        }
        return reversedList;
    }
    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            list.add(i);
        }
        System.out.println("Original List: " + list);
        System.out.println("Reverse List: "+reverseList(list));
    }
}