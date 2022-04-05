import java.util.*;

public class StockList {
    public static String stockSummary(String[] lstOfArt, String[] lstOf1stLetter) {
        List<String> firstLetterList = new ArrayList<>();
        List<Integer> firstLetterValueList = new ArrayList<>();
        List<String> artNamesFirstLetterList = new ArrayList<>();
        List<Integer> artNamesFirstLetterValueList = new ArrayList<>();

        Arrays.stream(lstOfArt).forEach( i-> {
            String[] art = i.split(" ");
            artNamesFirstLetterList.add(Character.toString(art[0].charAt(0)));
            artNamesFirstLetterValueList.add(Integer.parseInt(art[1]));
        });

        Arrays.stream(lstOf1stLetter).forEach(i -> {
            firstLetterList.add(i);
            firstLetterValueList.add(0);
        });


        for(int i = 0; i < artNamesFirstLetterList.size(); i++){
            for(int j = 0; j < firstLetterList.size(); j++){
                if(artNamesFirstLetterList.get(i).equals(firstLetterList.get(j))){
                    int newValue = firstLetterValueList.get(j) + artNamesFirstLetterValueList.get(i);
                    firstLetterValueList.set(j, newValue);
                }
            }
        }

        List<String> result  = new ArrayList<>();
        for(int i = 0; i < firstLetterList.size(); i++){
            result.add("(" + firstLetterList.get(i) + " : " + firstLetterValueList.get(i) + ")");
        }

        return (firstLetterValueList.stream().mapToInt(i -> i).sum() == 0) ? "" : String.join(" - ", result);
    }

}
