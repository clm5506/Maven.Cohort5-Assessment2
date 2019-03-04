package rocks.zipcode.assessment2.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author leon on 28/11/2018.
 */
public class StringArrayUtils {
    /**
     * @param arrayToBeSpliced - array to be evaluated
     * @param startingIndex - starting index of array to be spliced
     * @param endingIndex - ending index of array
     * @return an array with all elements between `startingIndex` and `endingIndex`
     */
    public static String[] getSubArray(String[] arrayToBeSpliced, int startingIndex, int endingIndex) {

        List<String> ar = new ArrayList<String>(Arrays.asList(arrayToBeSpliced));

        if(startingIndex < 0){
            throw new IllegalArgumentException();
        }
        ar = ar.subList(startingIndex, endingIndex);

        String[] ans = ar.toArray(new String[ar.size()]);
        return ans;
    }


    /**
     * @param arrayToBeSpliced - array to be evaluated
     * @param startingIndex - starting index of array to be spliced
     * @return an array all elements between after `startingIndex`
     */
    public static String[] getEndingArray(String[] arrayToBeSpliced, int startingIndex) {
        List<String> ar = new ArrayList<String>(Arrays.asList(arrayToBeSpliced));
        ar = ar.subList(startingIndex, arrayToBeSpliced.length);
        String[] ans = ar.toArray(new String[ar.size()]);
        return ans;
    }
}
