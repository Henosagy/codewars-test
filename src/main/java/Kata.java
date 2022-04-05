import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Kata {
    public static int[] DataReverse(int[] data) {
        String dataString = Arrays.stream(data).mapToObj(String::valueOf).collect(Collectors.joining());

        List<String> dataList = new ArrayList<>();

        for(int i=0; i < dataString.length(); i+= 8) {
            dataList.add(dataString.substring(i, i+8));
        }

        Collections.reverse(dataList);

        String listToString = new StringBuilder(String.join("", dataList)).toString();

        return Arrays.stream(listToString.split("")).mapToInt(Integer::parseInt).toArray();
    }


    public static int[] arrayDiff(int[] a, int[] b) {
        List<Integer> firstList = new ArrayList<>();

        if (b.length == 0){
            return a;
        }
       if(a.length == 0){
            return new int[0];
        }

       for(int s : b){
           for (int r : a){
               if(s != r){
                   firstList.add(r);
               }
           }
       }

        return firstList.stream().mapToInt(Integer::intValue).toArray();
    }
}
