public class InsertionSort implements Sorter {

    public void sort(int[] input) {
        System.out.println("Insertion Sort!!!");
        for (int i = 1; i < input.length; i++) {
            int current = input[i];
            int j = i - 1;

            while (j >= 0 && input[j] > current) {
                input[j + 1] = input[j];
                j--;
            }
            input[j + 1] = current;
        }

        System.out.println("Sorted array:");
        for (int num : input) {
            System.out.print(num + " ");
        }
    }

    public static void main(String[] args) {
        InsertionSort sorter = new InsertionSort();
        int[] array = {9, 5, 1, 4, 3};
        System.out.println("Original array:");
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();

        sorter.sort(array);
    }
}
