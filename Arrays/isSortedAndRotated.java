//This program checks whether an array is sorted and rotated.

class Main {
    public static boolean checkArrSorted(int arr[]){
        int count =0;
        for (int i=0;i<arr.length;i++){
            if(arr[i] > arr[(i+1)%arr.length]){
                count++;
            }
            if(count>1){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int arr[] = {5,6,7,1,2,3};
        boolean res = checkArrSorted(arr);
        System.out.println(res);
    }
}
