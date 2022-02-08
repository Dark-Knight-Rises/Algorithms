import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int arr[] = new int[5];
        System.out.println("Hello, World!");
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the 5 random numbers: ");
        for (int i = 0; i < 5; i++) {
            arr[i] = in.nextInt();
        }
        App obj = new App();
        obj.bBsort(arr);
        in.close();
    }

    public void displayArray(int[] arr) {
        System.out.println("the sorted array is: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public void bBsort(int[] arr) {
        int temp;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        displayArray(arr);
    }
}
