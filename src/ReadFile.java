import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Arrays;

public class ReadFile {
    String[] numbersArrStr;

    public ReadFile(String fileName){
        File file = new File("src/" + fileName);
        try {
            /* This Files.readString() gets all content from text file at once and convert them
             into an array of union commands instead of line by line reading and do union operation */
            this.numbersArrStr = Files.readString(file.toPath()).split("\\n", -1);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public int[] getNumbersArr(){
        int[] numbersArr = new int[numbersArrStr.length - 1];
        for (int i = 0; i < numbersArrStr.length - 1; i++){
            numbersArr[i] = Integer.parseInt(numbersArrStr[i]);
        }
        return numbersArr;
    }
}
