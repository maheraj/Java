
import java.util.*;

public class InsertionSort {
    public static void main(String[] args) {
        LetterCount("Hello apple pie");
    }


    public static String LetterCount(String str) {
        str = str.toLowerCase().replaceAll("[^\\w\\s]", "");
        String[] arr = str.split(" ");

        int max = 0;
        String result = "-1";

        for (int i = 0; i < arr.length; i++) {
            String word = arr[i];

            HashMap<Character, Integer> map = new HashMap<>();
            for (int j = 0; j < word.length(); j++) {
                if (map.get(word.charAt(j)) == null) {
                    map.put(word.charAt(j), 1);
                } else {
                    map.put(word.charAt(j), map.get(word.charAt(j) + 1));
                }
            }

            int count = 0;
            for (Character ch : map.keySet()) {
                if (map.get(ch) > 0) {
                    count++;
                }
            }

            if (max < count) {
                max = count;
                result = word;
            }
        }

        return result;

    }


}

