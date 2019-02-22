import org.junit.Assert;

import java.util.HashMap;

import static org.junit.Assert.*;

public class BinsTest {

    @org.junit.Test
    public void initializeBinTest() {
        //Given
        HashMap<Integer, Integer> expectedSumOfBins = new HashMap<Integer, Integer>();
        for(int i =2 ; i<=12; i++){
            expectedSumOfBins.put(i,0);
        }
        Bins bins = new Bins(2,12);
        //When
        bins.InitializeBin();

        //Then
        Assert.assertEquals(expectedSumOfBins, bins.sumOfBins);
    }

    @org.junit.Test
    public void getBinTest() {
        //Given
        HashMap<Integer, Integer> expectedSumOfBins1 = new HashMap<Integer, Integer>();
        for(int i =2 ; i<=12; i++){
            expectedSumOfBins1.put(i,0);
        }
        Bins bins1 = new Bins(2,12);
        bins1.InitializeBin();
        bins1.incrementBin(10);

        //When
        int actualValue = bins1.getBin(10);

        //Then
        Assert.assertEquals(1, actualValue);
    }

    @org.junit.Test
    public void incrementBin() {
       //Already covered in the getBin test
    }
}