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
}
