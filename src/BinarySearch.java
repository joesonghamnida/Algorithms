import java.util.ArrayList;

public class BinarySearch {

    public static void binarySearch(int target, ArrayList numbers){
        int min = 0;
        int max = numbers.size() - 1;
        int guess = (int) Math.floor((max + min) / 2);
        int count = 0;

        while(guess != target){

            if(guess < target){
                min =(int) guess + 1;
            }
            else if(guess > target){
                max = (int) guess - 1;
            }
            guess = (int) Math.floor((max + min) / 2);
            System.out.printf("Max: %d, Min: %d, Guess: %d, count: %d\n", max,min,guess,count);
            count ++;
        }

        System.out.printf("It took %d loops to find %d\n", count, target);
    }

}
