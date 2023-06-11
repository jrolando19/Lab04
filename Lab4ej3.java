import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Lab4ej3 {
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

    public static long insertionSort(int[] A) {
        int key;
        int i;
        long nano_StartTime = System.nanoTime();
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
        long nano_EndTime = System.nanoTime();
        return nano_EndTime - nano_StartTime;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese tamaño del arreglo: ");
        int t = scan.nextInt();
        ArrayList<int[]> casos = new ArrayList<int[]>();
        for (int n = 1; n <= t; n++) {
            casos.add(generarPeorCaso(n));
        }
        System.out.println("******************");
        imprimirCasos(casos);
        System.out.println("******************");
        Iterator<int[]> puntero = casos.iterator();
        while (puntero.hasNext()) {
            System.out.println(insertionSort(puntero.next()));
        }
    }

    private static void imprimirCasos(ArrayList<int[]> casos) {
        int i = 1;
        for (int[] caso : casos) {
            System.out.println("Caso: " + i);
            imprimirArreglo(caso);
            i++;
        }
    }
}
