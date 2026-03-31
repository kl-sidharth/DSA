//This program rotates an array to the left by one position by shifting elements and placing the first element at the end.
class Main {

    public static void leftRotate(int arr[]) {
        int n = arr.length;
       int temp = arr[0];
        for (int j = 1; j < n; j++) {
            arr[j-1]=arr[j];
        }
        arr[n-1]=temp;

    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        leftRotate(arr);
        System.out.println("Array after left rotate by one place:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
