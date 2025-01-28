import java.util.Random;
public class Main {
    public static void main(String[] args) {
       int[] testInput = generateRandomArray(10); 

        System.out.println("Original array:");
        printArray(testInput);

        TestSuite.run(testInput, 10000);  
    }

    public static int[] generateRandomArray(int size) {
        Random random = new Random();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(100);  
        }
        return array;
    }

    public static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
