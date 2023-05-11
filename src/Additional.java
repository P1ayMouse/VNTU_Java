import java.util.Arrays;
import java.util.Random;

public class Additional {
    public static int getRandomNumber(int a, int b) {
        Random rand = new Random();
        return rand.nextInt(b - a + 1) + a;
    }

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }


    public static void main(String[] args) {
        int[] arr = new int[20];
        System.out.println("Simple array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = getRandomNumber(1, 100);
            System.out.print(arr[i] + " ");
        }

        System.out.println("\n\nSorted array: ");
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
