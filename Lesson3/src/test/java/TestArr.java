import org.junit.*;
import org.junit.rules.ExpectedException;

public class TestArr {
    private Array array;

    @Before
    public void start(){
        array = new Array();
    }

    @Test(expected = RuntimeException.class)
    public void testArr1(){
        int [] checkingArr = {3,2,3,0,5,2,3};
        int [] rezultArr = {3,2,3,0,5,2};
        Assert.assertArrayEquals(rezultArr,array.checkFourInArray(checkingArr));
    }

    @Test(expected = AssertionError.class)
    public void testArr5(){
        int [] checkingArr = {3,2,3,0,5,2,3};
        int [] rezultArr = {3,2,3,0,5,2};
        Assert.assertArrayEquals(rezultArr,array.checkFourInArray(checkingArr));
    }
    @Test()
    public void testArr2(){
        int [] checkingArr = {3,4,3,0,5,2,3};
        int [] rezultArr = {3,0,5,2,3};
        Assert.assertArrayEquals(rezultArr,array.checkFourInArray(checkingArr));
    }
    @Test()
    public void testArr3(){
        int [] checkingArr = {3,4,3,4,5,2,3};
        int [] rezultArr = {3,0,5,2,3};
        Assert.assertArrayEquals(rezultArr,array.checkFourInArray(checkingArr));
    }
    @Test()
    public void testArr4(){
        int [] checkingArr = {3,4,3,0,5,2,4,2,1,1,1,3};
        int [] rezultArr = {2,1,1,1,3};
        Assert.assertArrayEquals(rezultArr,array.checkFourInArray(checkingArr));
    }
}
