import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Immutable {
    public static void main(String[] args) {
        final String[] arrayString = new String[]{"Ghana", "is", "65"};

        String sentence = String.join(" ", arrayString);

        List<String> newString = Arrays.stream(sentence.split(" ")).collect(Collectors.toList());

        System.out.println(sentence);
        System.out.println(newString);


    }
}
