class Main {

    // Second Largest
    public static void slargest(int arr[]) {
        int largest = arr[0];
        int slargest = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                slargest = largest;//if some one become the largest then the previous one is the second largest
                largest = arr[i];
            } 
            else if (arr[i] < largest && arr[i] > slargest) {
                slargest = arr[i];
            }
        }
        System.out.println("Second Largest element: " + slargest);
    }

    public static void main(String[] args) {
        int arr[] = {4, 6, 2, 5, 7, 9, 1, 3};
        slargest(arr);
    }
}
