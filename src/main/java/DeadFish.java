import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class DeadFish {
        public static int[] parse(String data) {
            List<Integer> output = new ArrayList<>();
            int number = 0;
            List<String> operations = Arrays.stream(data.split("")).filter(i -> !Pattern.matches("idso", i)).collect(Collectors.toList());
            for(String num : operations){
                if(num.equals("i")) number ++;
                if(num.equals("d")) number --;
                if(num.equals("s")) number *= number;
                if(num.equals("o")) output.add(number);
            }
            return output.stream().mapToInt(Integer::intValue).toArray();
        }


}
