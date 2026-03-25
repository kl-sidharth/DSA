class Main {
    static void bubbleSort(int arr[]){
        int n = arr.length;
        for(int i=n-1;i>=1;i--){
            for(int j =0;j<i;j++){
                if(arr[j]>arr[j+1]){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {15,16,6,8,5};
        bubbleSort(arr);
        System.out.println("Sorted Array Using Bubble Sort : ");
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
       
    }
}
