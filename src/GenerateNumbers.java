import java.util.ArrayList;

/**
 * Created by joe on 12/2/16.
 */
public class GenerateNumbers {

    public static ArrayList integersFullSet(int starting, int ending) {

        ArrayList<Integer> numbers = new ArrayList();

        for (int i = starting; i < ending; i++) {
            numbers.add(i);
        }
        return numbers;
    }

    public static ArrayList integersStepping(int starting, int ending, int steps) {

        ArrayList<Integer> numbers = new ArrayList();

        for (int i = starting; i <= ending; i = i + steps) {
            numbers.add(i);
        }
        return numbers;
    }

    public static Boolean checkEven(int i) {
        Boolean check = true;
        if (!(i % 2 == 0)) {
            check = false;
        }
        return check;
    }

    public static Boolean checkOdd(int i) {
        Boolean check = true;
        if (i == 3) {
            return check;
        } else if (!(i % 3 == 0)) {
            check = false;
        }
        return check;
    }
}
