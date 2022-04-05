import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {
    public static String whoLikesIt(String... names) {
        if (names.length == 0)
            return "no one likes this";
        else if(names.length == 1)
            return names[0] + " likes this";
        else if(names.length == 2)
            return names[0] + " and " + names[1] +" like this";
        else if(names.length == 3)
            return names[0] + ", " + names[1] + " and " + names[2] +" like this";
        else
            return names[0] + ", " + names[1] + " and " + (names.length - 2) +" others like this";
    }

    static String toCamelCase(String s){
        StringBuilder string = new StringBuilder();
        String delimiter = getDelimiter(s);

        if(delimiter != null){
            List<String > words = Arrays.stream(s.split(delimiter)).collect(Collectors.toList());
            string.append(words.get(0));

            for(int i=1; i < words.size(); i++){
                string.append(Character.toUpperCase(words.get(i).charAt(0))).append(words.get(i).substring(1));
            }
            return string.toString();
        }
        return  s;
    }

    static String getDelimiter(String s){
        return s.contains("-") ? "-" : s.contains("_") ? "_" : null;
    }

    public static int solveSuperMarketQueue(int[] customers, int n) {
        return customers.length != 0 ? Arrays.stream(customers).sum() / n  : 0;
    }

}
