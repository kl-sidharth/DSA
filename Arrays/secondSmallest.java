class Main{
  // Second Smallest
    public static void sSmallest(int arr[]) {
        int smallest = arr[0];
        int sSmallest = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < smallest) {
                sSmallest = smallest;
                smallest = arr[i];
            } 
            else if (arr[i] > smallest && arr[i] < sSmallest) {
                sSmallest = arr[i];
            }
        }
        System.out.println("Second Smallest element: " + sSmallest);
    }

    public static void main(String[] args) {
        int arr[] = {4, 6, 2, 5, 7, 9, 1, 3};

        sSmallest(arr);
    }
}
