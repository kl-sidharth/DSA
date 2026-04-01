//This program is used to find the union of the array by removing the duplicates from an array 
class Main {

    public static void findUnion(int arr1[], int arr2[]) {
        int n = arr1.length;
        int m = arr2.length;

        int i = 0, j = 0, k = 0;
        int union[] = new int[n + m];

        while (i < n && j < m) {

            if (arr1[i] < arr2[j]) {
                if (k == 0 || union[k - 1] != arr1[i]) {
                    union[k++] = arr1[i];
                }
                i++;
            }

            else if (arr2[j] < arr1[i]) {
                if (k == 0 || union[k - 1] != arr2[j]) {
                    union[k++] = arr2[j];
                }
                j++;
            }

            else { // VERY IMPORTANT
                if (k == 0 || union[k - 1] != arr1[i]) {
                    union[k++] = arr1[i];
                }
                i++;
                j++;
            }
        }

        while (i < n) {
            if (k == 0 || union[k - 1] != arr1[i]) {
                union[k++] = arr1[i];
            }
            i++;
        }

        while (j < m) {
            if (k == 0 || union[k - 1] != arr2[j]) {
                union[k++] = arr2[j];
            }
            j++;
        }

        System.out.print("Union: ");
        for (int x = 0; x < k; x++) {
            System.out.print(union[x] + " ");
        }
    }

    public static void main(String[] args) {
        int arr1[] = {1,2,3,4,5};
        int arr2[] = {2,3,4,6,7};

        findUnion(arr1, arr2);
    }
}
