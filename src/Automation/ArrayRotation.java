package Automation;


public class ArrayRotation {

    public static void main(String[] args) {
        int[] num = {2, 4, 2, 5, 6, 4, 7, 7, 3};
        int n = 3; // Number of rotations

        System.out.println("Original Array:");
        printArray(num);

        rotateArray(num, n);

        System.out.println("\nArray after " + n + " rotations:");
        printArray(num);
    }

    // Method to rotate the array to the right n times
    public static void rotateArray(int[] arr, int n) {
        int length = arr.length;
        n = n % length; // To handle cases where n is greater than the array length

        reverseArray(arr, 0, length - 1);
        reverseArray(arr, 0, n - 1);
        reverseArray(arr, n, length - 1);
    }

    // Method to reverse the array within a specified range
    public static void reverseArray(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    // Method to print the array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
