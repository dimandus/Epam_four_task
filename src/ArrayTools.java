import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Collections.*;


public class ArrayTools {

    public static int[] changeLength(int[] array, int newLength) {
        if (array == null) {
            return null;
        }
        int[] newArray = Arrays.copyOf(array, newLength);

        return newArray;
    }

    public static boolean compare(int[] first, int[] second) {

        if (first == null || second == null) {
            return false;
        }
        if (first.length != second.length) {
            return false;
        }
        ArrayList<Integer> items = new ArrayList<Integer>();
        for (int i = 0; i < second.length; i++) {
            items.add(second[i]);
        }

        for (int i = 0; i < first.length; i++) {
            if (items.contains(first[i])) {
                items.remove((Object) first[i]);
            } else {
                return false;
            }

        }

        return true;
    }

    public static int[] filter(int[]source, Predicat predicate){
        int count=0;
        int[] res = new int[source.length];

        for (int aSource : source) {
            if(predicate.verify(aSource)) {
                res[count++] = aSource;
            }
        }

        return ArrayTools.changeLength(res,count);
    }

    public static int[] shuffle(int[] array) {
        Random rnd = new Random();
        int[] newArray = Arrays.copyOf(array, array.length);

        for (int i = 0; i < newArray.length; i++) {
            int oneIndex = rnd.nextInt(newArray.length);
            int anotherIndex = rnd.nextInt(newArray.length);

            int temp = newArray[oneIndex];
            newArray[oneIndex] = newArray[anotherIndex];
            newArray[anotherIndex] = temp;
        }

        return array;
    }

    public static String print(int[] source) {
        String res = "";

        for (int i = 0; i < source.length; i++) {
            if (i != source.length - 1) {
                res += source[i] + " ";
            } else {
                res += source[i];
            }
        }
        return res;
    }


}