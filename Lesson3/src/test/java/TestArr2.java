import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestArr2 {
    private Array array;
        @Before
        public void start() {
            array = new Array();
        }
        @Test
        public void testArr1() {
            int [] arr = {1,2,3};
            Assert.assertEquals(false, array.checkForOneAndFour(arr));
        }
    @Test
    public void testArr2() {
        int [] arr = {1,2,3,44,4,4,-1};
        Assert.assertEquals(true, array.checkForOneAndFour(arr));
    }

    @Test
    public void testArr3() {
        int [] arr = {1,2,3,1,2,3,5,3};
        Assert.assertEquals(true, array.checkForOneAndFour(arr));
    }

    @Test
    public void testArr4() {
        int [] arr = {1,2,3,1,3,4,5,6};
        Assert.assertEquals(true, array.checkForOneAndFour(arr));
    }



    }




