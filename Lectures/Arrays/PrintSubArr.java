public class PrintSubArr {
    public static void printSubArr(int arr[]){
        int sum = 0;
        int minSum  = Integer.MAX_VALUE;
        int maxSum = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr.length; j++){
                for(int k=i; k<=j; k++){
                    System.out.print(arr[k]+ " ");
                    sum+=arr[k];
                }
                System.out.println("(Sum: "+sum+")");
                System.out.println();
                if(sum > maxSum){
                    maxSum = sum;
                }
                if(sum < minSum){
                    minSum = sum;
                }
                sum = 0;
            }
            System.out.println();
        }
        System.out.println("Minimum sum is: "+minSum);
        System.out.println("Maximum sum is: "+maxSum);
    }
    public static void main(String[] args) {
        int arr[] = {2, 4, 6, 8, 10};
        printSubArr(arr);
    }
}
