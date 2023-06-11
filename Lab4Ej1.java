
public class Lab4Ej1 {
    public static void main(String[] args) {
        int[] lista = { 5, 2, 4, 6, 1, 3 };
        System.out.print("Se imprime la lista en desorden:");
        imprimirArreglo(lista);
        System.out.print("\nSe imprimen las iteraciones: ");
        insertionSort(lista);
    }

    public static void insertionSort(int[] A) {
        int key;
        int i;
        for (int j = 1; j < A.length; j++) {
            key = A[j];
            // Insertar A[j] en la secuencia odenada A[1..j-1]
            i = j - 1;
            while (i > -1 && A[i] > key) {
                A[i + 1] = A[i];
                i--;
            }
            A[i + 1] = key;
            imprimirArreglo(A);
        }
    }

    private static void imprimirArreglo(int[] lista) {
        System.out.println("");
        for (int x = 0; x < lista.length; x++) {
            System.out.print(lista[x] + " ");
        }
    }
}