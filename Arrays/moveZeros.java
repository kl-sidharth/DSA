//This program is to move the zeros in an array to the end 
class Main {

    public static void moveZeros(int arr[]) {
        int n = arr.length;
        int j = -1;

        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                j = i;
                break;
            }
        }

        if (j == -1) return;

        for (int i = j + 1; i < n; i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {1,2,0,0,0,7,8,9};

        moveZeros(arr);

        System.out.println("Array after moving all Zero's :");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
