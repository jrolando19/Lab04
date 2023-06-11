import java.util.Scanner;

public class Lab4ej2 {
    public static int[] generarPeorCaso(int t) {
        int[] lista = new int[t];
        for (int i = 0; i < t; i++) {
            lista[i] = t - i;
        }
        return lista;
    }

    public static void imprimirArreglo(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + " ");
        }
        System.out.println();
    }

    public static void insertionSort(int[] A) {
        int key;
        int i;
        for (int j = 1; j < A.length; j++) {
            key = A[j];
            i = j - 1;
            while (i >= 0 && A[i] > key) {
                A[i + 1] = A[i];
                i--;
            }
            A[i + 1] = key;
            imprimirArreglo(A);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese tamaño del arreglo: ");
        int t = scan.nextInt();
        int[] peorCaso = generarPeorCaso(t);
        System.out.println();
        System.out.println("Peor caso generado:");
        imprimirArreglo(peorCaso);

        System.out.println("\nIteraciones del algoritmo de ordenamiento por inserción:");
        insertionSort(peorCaso);
    }
}
