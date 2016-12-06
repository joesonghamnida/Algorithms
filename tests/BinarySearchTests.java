import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class BinarySearchTests {

    @Test
    public void DoesBinarySearchFindItsTarget(){
        ArrayList<Integer> numbers = GenerateNumbers.integersFullSet(0,100);
        Assert.assertTrue((numbers.size() == 100));
        Assert.assertTrue(BinarySearch.binarySearchTestableBoolean(24, numbers));
        Assert.assertTrue(BinarySearch.binarySearchTestableBoolean(59, numbers));
        Assert.assertTrue(BinarySearch.binarySearchTestableBoolean(0, numbers));
    }
}
