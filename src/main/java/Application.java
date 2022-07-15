import java.util.ArrayList;
import java.util.Collections;

public class Application {

    public static void main(String[] args) {
        ConvertThis cvt = new ConvertThis();

        System.out.println("--------Program-Start--------");
        if(!AccessToData.inputFileExists()){
            AccessToData.createInputFile();
        }
        ArrayList<String> readIn = new ArrayList<>(AccessToData.readInputFile());

        ArrayList<Integer> numList = new ArrayList<>();
        for (String s:readIn) {
            Object temp = cvt.wordToNumber(s);
            if(temp != null){
                numList.add((Integer)temp);
            }
        }
        Collections.sort(numList);
        ArrayList<String> backToString = new ArrayList<>();
        for(int n:numList){
            backToString.add(cvt.numberToWord(n));
        }

        ArrayList<String> oneToSeven = new ArrayList<>(backToString.subList(0,7));
        ArrayList<String[]> inputOne = new ArrayList<>(Columns.printColumns(oneToSeven));
        ArrayList<String> oneToTwentyFive = new ArrayList<>(backToString.subList(0,25));
        ArrayList<String[]> inputTwo = new ArrayList<>(Columns.printColumns(oneToTwentyFive));
        ArrayList<String[]> completeList = new ArrayList<>(Columns.printColumns(backToString));

        System.out.println("---------------Input-One---------------");
        DisplayTheData.displayData(inputOne);
        System.out.println("---------------Input-Two---------------");
        DisplayTheData.displayData(inputTwo);
        System.out.println("---------------Input-Three---------------");
        DisplayTheData.displayData(completeList);
        System.out.println("--------Program-End--------");
    }
}
