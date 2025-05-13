public class BinarySearch {
    public static int binSearch(int arr[], int key){
        int si = 0, ei = arr.length-1;
        while (si <= ei) {
            int mid = (ei + si) / 2;
            
            if(arr[mid] == key){
                return mid;
            }
            
            if(key < arr[mid]){
                ei = mid-1;
            }else{
                si = mid+1;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int arr[] = {2, 4, 6, 8, 10, 12, 14};
        int key = 12;
        int idx = binSearch(arr, key);
        if(idx == -1){
            System.out.println("Key does not found");
        }else{
            System.out.println("Key found at index: "+idx);
        }
    }
}
