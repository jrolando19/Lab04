public class eda5 {
    public static void insertionSort(String[] array) {
        int n = array.length;

        for (int i = 1; i < n; i++) {
            String key = array[i];
            int j = i - 1;

            // Desplaza los elementos mayores que key hacia la derecha
            // Un valor negativo si la cadena actual es menor que la cadena de comparación.
            // a<b
            // Cero si la cadena actual es igual a la cadena de comparación. a=a
            // Un valor positivo si la cadena actual es mayor que la cadena de comparación.
            // b>a
            while (j >= 0 && array[j].compareTo(key) > 0) {
                array[j + 1] = array[j];
                j--;
            }

            // Inserta key en su posición correcta
            array[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        String[] array = { "zorro", "elefante", "gato", "perro", "ratón" };

        System.out.println("Array original:");
        for (String str : array) {
            System.out.print(str + " ");
        }

        insertionSort(array);

        System.out.println("\nArray ordenado:");
        for (String str : array) {
            System.out.print(str + " ");
        }
    }
}
