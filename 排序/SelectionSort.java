public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = new int[]{-1,2,6,3};
        selectionSort(arr);
        for (int i : arr) {
            System.out.println(i);
        }

    }
    private static void selectionSort(int[] arr){
        for (int i = 0; i < arr.length -1; i++) {
            for (int j = i; j < arr.length-i-1; j++) {
                if (arr[i]>arr[j+1]){
                    int temp = arr[j];
                    arr[j+1] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }
}
