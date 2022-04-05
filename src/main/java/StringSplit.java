import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringSplit {
    public static String[] solution(String s) {
        String newString = s.length() % 2 == 0 ? s: s + "_";

        int chunkSize =(int) Math.ceil((double)newString.length() / 2);

        String[] splitStrings = new String[chunkSize];

        List<String> stringList = new ArrayList<>();

        for(int i = 0; i < newString.length(); i += 2) {
            stringList.add(newString.substring( i, i + 2));
        }

        return stringList.toArray(splitStrings);

    }
}
