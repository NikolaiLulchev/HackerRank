import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

class Result {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
        // Write your code here
        double positive = 0;
        double negative = 0;
        double zero = 0;
        for (Integer integer : arr) {
            if (integer > 0) {
                positive++;
            } else if (integer < 0) {
                negative++;
            } else {
                zero++;
            }
        }
        BigDecimal positiveRatio = BigDecimal.valueOf(positive / arr.size()).setScale(6, RoundingMode.HALF_UP);
        BigDecimal negativeRatio = BigDecimal.valueOf(negative / arr.size()).setScale(6, RoundingMode.HALF_UP);
        BigDecimal zeroRatio = BigDecimal.valueOf(zero / arr.size()).setScale(6, RoundingMode.HALF_UP);

        System.out.println(positiveRatio);
        System.out.println(negativeRatio);
        System.out.println(zeroRatio);

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrTemp[i]);
            arr.add(arrItem);
        }

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}
