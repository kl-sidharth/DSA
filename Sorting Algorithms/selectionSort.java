class Main {
    public void selectionSort(int arr[]){
        int n = arr.length;
        for (int i=0;i<=n-2;i++){
            int minPos =i;
            for(int j=i;j<=n-1;j++){
                if(arr[j]<arr[minPos]){
                    minPos = j;
                }
            }
            int t = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = t;
        }
    }
    public static void main(String[] args) {
        int arr[]={10,4,15,7,23,6};
        Main obj = new Main();
        obj.selectionSort(arr);
        
        System.out.println("Sorted Array :");
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
