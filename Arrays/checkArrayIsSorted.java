//This problem checks whether a given array is sorted in non-decreasing order by comparing adjacent elements.
class Main {

    static boolean check(int arr[]) {
        for(int i = 1;i<arr.length;i++){
            if(arr[i]<arr[i-1]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4, 4, 5};
        boolean k = check(arr);
        if(k==true)
        System.out.println("The Array is Sorted");
        else
        System.out.println("The Array is not Sorted");
        
    }
}
