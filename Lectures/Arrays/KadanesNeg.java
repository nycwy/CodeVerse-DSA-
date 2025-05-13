public class KadanesNeg {
    public static void kadanes(int arr[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        boolean isNeg = true;

        for(int i=0; i<arr.length; i++){
            if(arr[i] >= 0){
                isNeg = false;
            }
        }

        maxSum = isNeg ? negValue(arr) : posValue(arr);
    }

    public static int posValue(int arr[]){
        
    }
    public static void main(String args[]){
        int arr[] = {-2, -3, 4, -1, -2, -1, -5, -3};
        kadanes(arr);
    }
}
