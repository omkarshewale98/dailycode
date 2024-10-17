import java.util.Arrays;

public class Arrayreverse{
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int[] reversedArray = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            reversedArray[i] = array[array.length - i - 1];
        }
        for(int i=0;i<reversedArray.length;i++){
            System.out.println(reversedArray[i]);
        }
        //System.out.println("Reversed Array: " + Arrays.toString(reversedArray));
    }
}
