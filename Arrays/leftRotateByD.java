//This program rotates an array to the left by d positions by rearranging elements so that the first d elements are moved to the end.
class Main {

    public static void leftRotate(int arr[],int d) {
       int n =arr.length;
       d=d%n;
       int temp[]=new int[n];
       for(int i =0;i<d;i++){
           temp[i] = arr[i];
       }
       for(int i =d;i<n;i++){
           arr[i-d]=arr[i];
       }
       for(int i = n-d;i<n;i++){
           arr[i]=temp[i-(n-d)];
       }
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9};
        int d =4;
        leftRotate(arr,d);
        System.out.println("Array after left rotate by d places :");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
