class Main {
    void mergeSort(int arr[],int low,int high){
        if(low >= high){
            return;
        }
        int mid = (low+high)/2;
        mergeSort(arr,low,mid);
        mergeSort(arr,mid+1,high);
        merge(arr,low,mid,high);
    }
    void merge(int arr[],int low,int mid,int high){
        int temp[] = new int[high - low + 1];
        int left =low;
        int right =mid+1;
        int k=0;
        while(left<=mid && right<=high){
            if(arr[left] <= arr[right]){
                temp[k] =arr[left];
                left++;
                k++;
            }
            else{
                temp[k] = arr[right];
                right++;
                k++;
            }
        }
        while(left<= mid){
            temp[k] = arr[left];
            left++;
            k++;
            }
        while(right<= high ){
            temp[k] = arr[right];
            right++;
            k++;
            }
        for(int i =low;i<=high;i++){
            arr[i] = temp[i-low];
        }
    }
    public static void main(String[] args) {
        int arr[] = {3,1,2,4,1,5,2,6,4};

        Main obj = new Main();
        obj.mergeSort(arr, 0, arr.length - 1);

        System.out.println("Sorted Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
       
    }
}
