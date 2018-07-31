import static java.util.Arrays.binarySearch;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = new int[]{-1,2,6,3};
        int ser = binarySearch(arr,2);
        System.out.println(ser);

    }
    private static int binarySearch(int[] arr,int key){
        int low = 0;
        int high = arr.length-1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] > key) {
                high = mid -1;
            } else if(arr[mid] < key) {
                low = mid + 1;
            } else {
                return mid;
            }
        }
        return  -1;
    }
}
