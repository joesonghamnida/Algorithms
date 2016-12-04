import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

/**
 * Created by joe on 12/2/16.
 */
public class GenerateNumbersTests {

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
        ArrayList<Integer> listOfNumbers = GenerateNumbers.integersFullSet(0,5);
        Assert.assertTrue(listOfNumbers.size()==5);

        ArrayList<Integer> listOfNumbersStepping = GenerateNumbers.integersStepping(0,5, 2);
        Assert.assertTrue(listOfNumbersStepping.size()==3);
    }
}
