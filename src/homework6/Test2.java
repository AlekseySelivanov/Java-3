package homework6;//
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class Test2 {
    private Main hw;
    private boolean result;
    private int[] array;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {new int[]{1, 4, 1, 4}, true},
                {new int[]{1, 1, 1}, false},
                {new int[]{4, 4}, false},
                {new int[]{1, 4, 5}, false}
        });
    }
    public Test2(int[] array, boolean result){
        this.array = array;
        this.result = result;
    }

    @Before
    public void init() {
        hw = new Main();
    }

    @Test
    public void test(){
        Assert.assertEquals(result, hw.validateArrayByOneAndFour(array));
    }
}
