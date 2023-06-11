public class eda {
    public static void main(String[] args) {
        int[] arr = { 8, 3, 1, 5, 2 };
        System.out.println("Lista desordenada: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        insertionSort(arr);
        System.out.println();
        System.out.println("Lista ordenada: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    private static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
}