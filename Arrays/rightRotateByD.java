//This program rotates an array to the right by d positions by rearranging elements so that the last d elements are moved to the beginning.
class Main {

    public static void rightRotate(int arr[], int d) {
        int n = arr.length;
        d = d % n;
        int temp[] = new int[n];
        for (int i = 0; i < d; i++) {
            temp[i] = arr[n - d + i];
        }
        for (int i = n - d - 1; i >= 0; i--) {
            arr[i + d] = arr[i];
        }
        for (int i = 0; i < d; i++) {
            arr[i] = temp[i];
        }
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9};
        int d = 4;

        rightRotate(arr, d);

        System.out.println("Array after right rotate by d places :");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
