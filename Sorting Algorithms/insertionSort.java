class Main {
    void insertionSort(int arr[]){
        int n = arr.length;
        for(int i = 1 ;i<n;i++){
            int j=i;
            while (j>0 && arr[j-1]>arr[j]){
                int t = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = t;
            j--;
            }
        }
    }
    
    public static void main(String[] args) {
        int arr[] = {4,5,2,8,6,1};
        Main obj =new Main();
        obj.insertionSort(arr);
        System.out.println("Sorted Array");
        for(int i=0 ; i<arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
