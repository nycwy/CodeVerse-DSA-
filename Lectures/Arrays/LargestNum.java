public class LargestNum {
    public static int largerstNum(int arr[]){
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 6, 3, 5};
        int largest = largerstNum(arr);
        System.out.println("Largest number in an array is: "+largest);
    }
}
