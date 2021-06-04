import static org.junit.Assert.*;

public class CompareArraysTest {

    @org.junit.Test
    public void assertArraysEquals() {
        //Arrange
        CompareArrays obj = new CompareArrays();
        boolean expected = true;

        //Actual
        int []arr = {1,2,3,4};
        int []arr2 = {4,2,3,1};
        boolean actual = obj.assertArraysEquals(arr,arr2);
        //Assert
        assertEquals(expected,actual);
    }
}