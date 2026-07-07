package collections.map.treemap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.*;

public class findFrequencyOfGivenStringArray {

    public static void main(String[] args) {
        String fruits="apple banana apple orange banana";
        //expected output  {apple =2, bannana=2}
        /***
         * Convert string into String Array and then create a map and then add the every value
         * in the map where key is String and value is Integer
         *
         */

        //apprach1(fruits);

        /****
         *
         * Using HashMap and merge function (remapping function)
         */
        apprach2(fruits);
    }

    private static void apprach2(String fruits) {
        Map<String,Integer> result = new HashMap<>();

        for(String word: fruits.split("\\s")){
            result.merge(word,1,Integer::sum);
        }
        System.out.println(result);
    }

    private static void apprach1(String fruits) {
        String fruitList[]=fruits.split("\\s");
        System.out.println(Arrays.toString(fruitList));

        Map<String,Integer> result = new TreeMap<>();

        for(String value: fruitList){
            // At first time if value is not found , instead of throwing error we are adding 0
            // thats why getOrDefault method is used
            result.put(value,result.getOrDefault(value,0)+1);
        }
        System.out.println(result);
    }
}
