import java.util.Arrays;
import java.util.Random;

/**
 * Created by Dimandus on 07.11.2015.
 */
public class ArrayTools {

    public static int[] changeLength(int[] array, int newLength) {
        if (array == null) {
            return null;
        }
        int[] newArray = new int[newLength];

        for (int i = 0; i < newLength; i++) {
            if (i < array.length) {
                newArray[i] = array[i];
            } else {
                newArray[i] = 0;
            }

        }

        return newArray;
    }

    /**
     * @param firstArray
     * @param secondArray
     * @return return true, if arrays are equalent
     */
    public static boolean compare(int[] firstArray, int[] secondArray) {

        if (firstArray.length != secondArray.length) {
            return false;
        }

        for (int i = 0; i < firstArray.length; i++) {
            if (Arrays.binarySearch(secondArray, firstArray[i]) == -1) {
                return false;
            }

        }

        return true;
    }

    public static int[] shuffle(int[] array) {
        Random rnd = new Random();
        int[] newArray = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }


        for (int i = 0; i < newArray.length; i++) {
            int oneIndex = rnd.nextInt(newArray.length);
            int anotherIndex = rnd.nextInt(newArray.length);

            int temp = newArray[oneIndex];
            newArray[oneIndex] = newArray[anotherIndex];
            newArray[anotherIndex] = temp;
        }

        return array;
    }

    public static String print(int[] array) {
        String res = "";

        for (int i = 0; i < array.length; i++) {
            if(i!=array.length-1) {
                res += array[i] + " ";
            }
            else
            {
                res+= array[i];
            }
        }
        return res;
    }
}