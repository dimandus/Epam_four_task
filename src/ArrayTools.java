import java.util.Arrays;

/**
 * Created by Dimandus on 07.11.2015.
 */
public class ArrayTools {

    public static int[] changeLength(int[] array, int newLength){

        int[] newArray = new int[newLength];

        for(int i=0;i<newLength;i++){
            newArray[i]=array[i];
        }

        return  newArray;
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
}
