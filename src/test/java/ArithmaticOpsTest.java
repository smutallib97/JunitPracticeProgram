import org.junit.Assert;
import org.junit.jupiter.api.Test;

class ArithmaticOpsTest {
    @Test
    public void Addition (){
        int expectedOutput = 30;
        ArithmaticOps Aops1 = new ArithmaticOps();
        int actual = ArithmaticOps.addNum(10, 20);
        Assert.assertEquals(expectedOutput, actual);
    }

    @Test
    public void Subtraction(){
        int expectedOutput = 5;
        ArithmaticOps Aops2 = new ArithmaticOps();
        int actual = ArithmaticOps.subsNum(10, 5);
        Assert.assertEquals(expectedOutput, actual);
    }
    @Test
    public void Multiplication (){
        int expectedOutput = 30;
        ArithmaticOps Aops3 = new ArithmaticOps();
        int actual = ArithmaticOps.mulNum(10, 3);
        Assert.assertEquals(expectedOutput, actual);
    }
    @Test
    public void Division (){
        int expectedOutput = 3;
        ArithmaticOps Aops4 = new ArithmaticOps();
        int actual = ArithmaticOps.divNum(30, 10);
        Assert.assertEquals(expectedOutput, actual);
    }

}