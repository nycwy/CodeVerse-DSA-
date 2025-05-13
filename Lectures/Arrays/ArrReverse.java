public class ArrReverse {
    public static void revArr(int arr[]){
        int si=0, ei=arr.length-1;
        while (si < ei) {
            int temp = arr[si];
            arr[si] = arr[ei];
            arr[ei] = temp;
            si++;
            ei--;
        }
    }
    public static void main(String[] args) {
        int arr[] = {2, 4, 6, 8, 10, 12, 14};
        revArr(arr);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
    }
}