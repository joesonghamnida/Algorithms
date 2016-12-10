import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

/**
 * Created by joe on 12/2/16.
 */
public class GenerateNumbersTests {

    public static final int MIN = 0;
    public static final int MAX_ONE = 5;
    public static final int MAX_TWO = 500;

    @Test
    public void checkEvenNumbers(){
        Assert.assertTrue(GenerateNumbers.checkEven(0));
        Assert.assertFalse(GenerateNumbers.checkEven(1));
        Assert.assertTrue(GenerateNumbers.checkEven(2));
        Assert.assertFalse(GenerateNumbers.checkEven(3));
        Assert.assertTrue(GenerateNumbers.checkEven(4));
        Assert.assertFalse(GenerateNumbers.checkEven(5));
        Assert.assertTrue(GenerateNumbers.checkEven(6));
        Assert.assertFalse(GenerateNumbers.checkEven(7));
        Assert.assertTrue(GenerateNumbers.checkEven(8));
        Assert.assertFalse(GenerateNumbers.checkEven(9));
    }

    @Test
    public void checkOddNumbers(){
        Assert.assertTrue(GenerateNumbers.checkOdd(0));
        Assert.assertFalse(GenerateNumbers.checkOdd(1));
        Assert.assertFalse(GenerateNumbers.checkOdd(2));
        Assert.assertTrue(GenerateNumbers.checkOdd(3));
        Assert.assertFalse(GenerateNumbers.checkOdd(4));
        Assert.assertFalse(GenerateNumbers.checkOdd(5));
        Assert.assertTrue(GenerateNumbers.checkOdd(6));
        Assert.assertFalse(GenerateNumbers.checkOdd(7));
        Assert.assertFalse(GenerateNumbers.checkOdd(8));
        Assert.assertTrue(GenerateNumbers.checkOdd(9));
        Assert.assertFalse(GenerateNumbers.checkOdd(10));
    }

    @Test
    public void GenerateAListOfNumbers(){
        ArrayList<Integer> listOfNumbers = GenerateNumbers.integersFullSet(MIN,MAX_ONE);
        Assert.assertTrue(listOfNumbers.size()==5);

        ArrayList<Integer> listOfNumbers2 = GenerateNumbers.integersFullSet(MIN,MAX_TWO);
        Assert.assertTrue(listOfNumbers2.size()==MAX_TWO);
        System.out.println(listOfNumbers2.get(499));
        Assert.assertTrue(listOfNumbers2.get(499)==499);

        ArrayList<Integer> listOfNumbersStepping = GenerateNumbers.integersStepping(MIN,MAX_ONE, 2);
        Assert.assertTrue(listOfNumbersStepping.size()==3);
        System.out.println(listOfNumbersStepping);
        Assert.assertTrue(listOfNumbersStepping.get(2)==4);
    }

    @Test
    public void GenerateListOfRandomNumbers(){
        ArrayList<Integer> listOfNumbers = GenerateNumbers.integersRandomSet(MIN, MAX_ONE, 5);
        Assert.assertTrue(listOfNumbers.size() == 5);
        System.out.println(listOfNumbers);
    }

    @Test public void GenerateNumberArrays(){
        ArrayList<Integer> listOfNumbers = GenerateNumbers.integersFullSet(MIN,MAX_ONE);
        Assert.assertTrue(listOfNumbers.size()==MAX_ONE);
        Integer[] arrayToTest = GenerateNumbers.integersFullArray(MIN, MAX_ONE);
        Assert.assertTrue((arrayToTest.length == MAX_ONE));

        ArrayList<Integer> listOfNumbers2 = GenerateNumbers.integersFullSet(MIN,MAX_TWO);
        Assert.assertTrue(listOfNumbers2.size()==MAX_TWO);
        Integer[] arrayToTest2 = GenerateNumbers.integersFullArray(MIN, MAX_TWO);
        Assert.assertTrue((arrayToTest2.length == MAX_TWO));
    }
}
