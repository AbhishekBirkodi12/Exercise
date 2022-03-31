import java.util.Scanner;

public class ArrayLeftShiftByTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the array elements");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("Enter how many places you want to left shift ");
        int n = scanner.nextInt();
        System.out.println("Original array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        for (int i = 0; i < n; i++) {
            int j, first;

            first = arr[0];
            for (j = 0; j < arr.length - 1; j++) {
                //Shift element of array by one
                arr[j] = arr[j + 1];
            }

            arr[j] = first;
        }
        System.out.println();

        System.out.println("Array after left rotation: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }


    }
}
