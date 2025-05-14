public class RmvDuplicates {
    public int removeDuplicates(int arr[]) {
        if (arr.length == 0) {
            return 0;
        }
        int i = 0;
        for (int j = 1; j < arr.length; j++) {
            if (arr[j] != arr[i]) {
                i++;
                arr[i] = arr[j];
            }
        }
        return i + 1;
    }

    public static void main(String args[]) {
        int arr[] = {4, 4, 5, 6, 6, 6, 7, 9, 9, 12, 14};
        RmvDuplicates obj = new RmvDuplicates();
        int length = obj.removeDuplicates(arr);

        System.out.println("Array after removing duplicates:");
        for (int i = 0; i < length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

