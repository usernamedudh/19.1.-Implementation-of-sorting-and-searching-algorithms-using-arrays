package app;
import java.util.Random;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {

        Random random = new Random();

        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }

        System.out.println("Початковий масив: " + Arrays.toString(array));

        ArrayUtils.mergeSort(array);
        System.out.println("Відсортований масив: " + Arrays.toString(array));
        
        int target = array[5];
        int index = ArrayUtils.binarySearch(array, target);

        if (index != -1) {
            System.out.println("Елемент " + target + " знайдено на позиції " + index);
        } else {
            System.out.println("Елемент " + target + " не знайдено.");
        }
    }
}
