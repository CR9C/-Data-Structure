import java.util.Random;

public class BubbleSort {
    public static void main(String[] args) {
        int[] sort = new int[]{-3,-4,-2,-6};
        bubbleSort(sort);
        System.out.println("排序后的数组为");
        for (int i : sort) {
            System.out.println(i);
        }
    }

    private static void bubbleSort(int[] sort) {
        for (int i = 1; i <= sort.length - 1; i++) {
            for (int j = 1; j <=sort.length - i ; j++) {
                if (sort[j-1]>sort[j]){
                    int temp = sort[j-1];
                    sort[j-1] = sort[j];
                    sort[j] = temp;
                }
            }
        }
    }
}
