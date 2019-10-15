import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int N = obj.nextInt();
        int arr[] = new int[N];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = obj.nextInt();
        }
        bubble(arr);
        display(arr);
    }

    public static void bubble(int[] arr) {
        // last element will automatically be sorted
        for (int counter = 0; counter < arr.length - 1; counter++) {
            // watch the range carefully
            // it will sort the element from backward and reduce its value from 1 by each iteration in loop
            for (int j = 0; j < arr.length - 1-counter; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }

            }
        }
    }
        public static void display ( int[] arr){
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i]);
            }
        }
}
