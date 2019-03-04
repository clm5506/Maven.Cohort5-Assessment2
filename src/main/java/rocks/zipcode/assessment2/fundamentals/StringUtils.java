package rocks.zipcode.assessment2.fundamentals;

import java.util.Collections;

/**
 * @author leon on 28/11/2018.
 */
public class StringUtils {
    /**
     * @param stringToBePadded - string value to be flushed right
     * @param amountOfPadding - amount of padding to be flushed left
     * @return `stringToBePadded` flushed right by left-padding
     */
    public static String padLeft(String stringToBePadded, int amountOfPadding) {
        return String.format("%" + amountOfPadding + "s", stringToBePadded);
    }

    /**
     * @param stringToBePadded - string value to be flushed left
     * @param amountOfPadding - amount of padding to be flushed right
     * @return `stringToBePadded` flushed right by right-padding
     */
    public static String padRight(String stringToBePadded, int amountOfPadding) {
        return String.format("%-" + amountOfPadding + "s", stringToBePadded);
    }

    /**
     * @param stringToBeRepeated - string value to be repeated
     * @param numberOfTimeToRepeat - number of times to repeat `stringToBeRepeated`
     * @return the string repeated and concatenated `n` times
     */
    public static String repeatString(String stringToBeRepeated, int numberOfTimeToRepeat) {

        return String.join("", Collections.nCopies(numberOfTimeToRepeat, stringToBeRepeated));
    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains alpha characters
     */
    public static Boolean isAlphaString(String string) {
        Boolean answer = true;
        String spacesRemoved =string.replaceAll(" ","");
        char[] chArr = spacesRemoved.toCharArray();
        for(int i = 0; i < chArr.length; i++){
            if(!Character.isAlphabetic(chArr[i])){
                answer = false;
                break;
            }
        }
        return answer;
    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains numeric characters
     */
    public static Boolean isNumericString(String string) {

        Boolean answer = true;// = false;
        String spacesRemoved =string.replaceAll(" ","");
        char[] chArr = spacesRemoved.toCharArray();
        for(int i = 0; i < chArr.length; i++){
            if(!Character.isDigit(chArr[i])){
                answer = false;
                break;
            }
        }
        return answer;
    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains special characters
     */
    public static Boolean isSpecialCharacterString(String string) {

        Boolean answer = true;// = false;

        char[] chArr = string.toCharArray();
        for(int i = 0; i < chArr.length; i++){
            if(Character.isDigit(chArr[i]) || Character.isAlphabetic(chArr[i])){
                answer = false;
                break;
            }
        }
        return answer;

    }
}
