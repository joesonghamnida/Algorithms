import java.util.ArrayList;
import java.util.Random;

/**
 * Created by joe on 12/2/16.
 */
public class Main {

    public static void main(String[] args) {
        Random random = new Random();

        ArrayList <Integer> numbers = GenerateNumbers.integersFullSet(0,100);
        ArrayList <Integer> numbersStepping = GenerateNumbers.integersStepping(0,100, 2);

        BinarySearch.binarySearch(24, numbers);
        BinarySearch.binarySearch(24, numbersStepping);

        int randStart = random.nextInt(1000);
        int randEnd = random.nextInt(randStart + 100000);
        ArrayList<Integer> numbersRandom = GenerateNumbers.integersFullSet(randStart, randEnd);
        int target = random.nextInt(randStart + random.nextInt(1000));
        BinarySearch.binarySearch(target, numbersRandom);
    }
}
