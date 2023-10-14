public class bubble_Sort {
    public static void main(String[] args) {
        int[] inputArray = {64, 34, 25, 12, 22, 11, 90};
        int[] sortedArray = bubble_Sort(inputArray.clone());
        
        System.out.print("Lista ordenada: ");
        for (int num : sortedArray) {
            System.out.print(num + " ");
        }
    }

    public static int[] bubble_Sort(int[] array) {
        int n = array.length;
        boolean swapped;
        int swapCounter = 0;

        do {
            swapped = false;
            for (int i = 1; i < n; i++) {
                if (array[i - 1] > array[i]) {
                    // Swap array[i-1] and array[i]
                    int temp = array[i - 1];
                    array[i - 1] = array[i];
                    array[i] = temp;
                    swapped = true;
                    swapCounter++;
                }
            }
        } while (swapped);

        System.out.println("Numero de trocas: " + swapCounter);
        return array;
    }
}