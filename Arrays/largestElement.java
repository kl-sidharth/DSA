//This program finds the largest element in a given array using a simple linear search approach.
class Main {

    public static void main(String[] args) {
        int arr[] = {4, 6, 2, 5, 7, 9, 1, 3};
        int largest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (largest < arr[i]) {
                largest = arr[i];
            }
        }
        System.out.print("Largest element: " + largest);
    }
}
