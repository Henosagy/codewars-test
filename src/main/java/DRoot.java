import java.util.Arrays;

public class DRoot {
    public static int digital_root(int n) {
        String number = String.valueOf(n);
        int value = 0;
        do{
            value = Arrays.stream(number.split(""))
                    .map(Integer::parseInt).reduce(0, Integer::sum);
            number = String.valueOf(value);
        }
        while (number.length() > 1);
        return value;
    }

    public static void main(String[] args) {
        System.out.println(digital_root(493193));
    }

}
