public class eda6 {
    public static void main(String[] args) {
        Double[] arr = { 3.2, 1.5, 2.7, 1.1, 4.8 };
        System.out.println("Lista desordenada: ");
        for (double num : arr) {
            System.out.print(num + " ");
        }
        insertionSort(arr);
        System.out.println();
        System.out.println("Lista ordenada: ");
        for (double num : arr) {
            System.out.print(num + " ");
        }
    }

    private static void insertionSort(Double[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            double key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
}
