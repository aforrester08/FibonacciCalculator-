import java.util.ArrayList;

public class Fibonacci {

    public long valueOfNthNumber(int nthValue) {
        double goldenOne = (1 + Math.sqrt(5))/2;
        double goldenTwo = (1 - Math.sqrt(5))/2;
        double denom  = Math.sqrt(5);
        if (nthValue > -1 && nthValue < 100) {
            double result = (Math.pow(goldenOne, nthValue) - Math.pow(goldenTwo, nthValue)) / denom;
            return ((long) Math.round(result));
        }
        else {
            return -1;
        }
    }

}
