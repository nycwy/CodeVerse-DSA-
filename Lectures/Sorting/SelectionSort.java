public class SelectionSort {
    public static void sortArr(int arr[]){
        for(int turn=0; turn<arr.length-1; turn++){
            int minPos = turn;
            for(int j = turn+1; j<arr.length; j++){
                if(arr[j] < arr[minPos]){
                    minPos = j;
                }
            }
            //swap
            int temp = arr[minPos];
            arr[minPos] = arr[turn];
            arr[turn] = temp;
        }
        printArr(arr);
    }
    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String args[]){
        int arr[] = {5, 4, 1, 3, 2};
        sortArr(arr);
    }
}
