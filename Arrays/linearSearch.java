//This program is used to search a key in an array 
class Main {
    public static boolean linearSearch(int arr[],int k) {
        int n = arr.length;
       for (int i = 0; i < n; i++) {
            if (arr[i] == k) {
               return true;
            }
        }
        return false;
    }

  public static void main(String[] args) {
        int arr[] = {1,2,0,0,0,7,8,9};
        int k = 3;
        boolean res= linearSearch(arr,k);
        System.out.println(res);
    }
}
