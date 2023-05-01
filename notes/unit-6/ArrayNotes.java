import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayNotes {
    public static void main(String[] args) {
        int[] array = new int[5];

        for (int i = 1; i < array.length + 1; i++) {
            array[i - 1] = i;
        }
        System.out.println(Arrays.toString(array));
    }
}
