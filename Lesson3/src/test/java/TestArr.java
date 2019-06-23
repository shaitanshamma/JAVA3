import org.junit.*;

public class TestArr {


    @Test(expected = AssertionError.class)
        public void testArr1(){
        Array array = new Array();
        int [] arr = {1,2,3,0,5,2,3};
        Assert.assertArrayEquals(new int[]{},array.checkFourInArray(arr));
    }


}
