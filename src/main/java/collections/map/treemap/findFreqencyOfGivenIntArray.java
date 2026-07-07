package collections.map.treemap;

import java.util.Map;
import java.util.TreeMap;

public class findFreqencyOfGivenIntArray {

    public static void main(String[] args) {
        int arr[] = {1, 1, 1, 2, 2, 2, 3, 3, 4, 5, 5, 5, 6, 6, 6, 6, 6, 7, 8, 8, 9, 9,};
        //Expected output[] = [1=3,2=3,3=2,4=1,5=3,6=5,8=1,8=2,9=2]
        Map<Integer, Integer> result = new TreeMap<>();

        for (int num : arr) {
            //  if(result.containsKey(arr[i])){
            result.put(num, result.getOrDefault(num, 0) + 1);
            //   }

        }
        System.out.println(result);
    }
}
