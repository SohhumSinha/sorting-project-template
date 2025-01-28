public class SelectionSort implements Sorter {

    public void sort(int[] input) {
        System.out.println("Selection Sort!!!");
         for (int i = 0; i < input.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < input.length; j++) {
                if (input[j] < input[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = input[minIndex];
            input[minIndex] = input[i];
            input[i] = temp;
        }

        System.out.println("Sorted array:");
        for (int num : input) {
            System.out.print(num + " ");
        }
    }

    public static void main(String[] args) {
        SelectionSort sorter = new SelectionSort();
        int[] array = {64, 25, 12, 22, 11};
        System.out.println("Original array:");
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();

        sorter.sort(array);
    }
}
