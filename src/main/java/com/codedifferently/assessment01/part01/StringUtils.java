package com.codedifferently.assessment01.part01;

public class StringUtils {
    /**
     * Get all the words in the sentence and return it in a string array
     * @param sentence
     * @return
     */
    public static String[] getWords(String sentence){

        return sentence.split("\\s");
    }

    /**
     * Get the first word in the string
     * @param sentence
     * @return
     */
    public static String getFirstWord(String sentence){

        return getWords(sentence)[0];
    }

    /**
     * Grab the first word and reverse it
     * @param sentence
     * @return
     */
    public static String reverseFirstWord(String sentence){

        return new StringBuilder(getFirstWord(sentence))
                .reverse()
                .toString();
    }

    /**
     * Grab the first word then camel case it
     * @param sentence
     * @return
     */
    public static String reverseFirstWordThenCamelCase(String sentence){
        String word = reverseFirstWord(sentence).toLowerCase();
        return word.substring(0,1).toUpperCase() + word.substring(1);
    }

    /**
     * Remove Character at index
     * @param str
     * @param index
     * @return
     */
    public static String removeCharacterAtIndex(String str, int index){
        return new StringBuilder(str)
                .replace(index, index+1, "")
                .toString();
    }
}
