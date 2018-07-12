import be.vdab.fraction.Breuk;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BreukTest {
    private Breuk a;
    private Breuk b;
    private Breuk c;

    @Before
    public void setUp () {
        a = new Breuk (2,4);
        b = new Breuk(3,5);
        c = new Breuk(0,0);
    }


    @Test
    public void breukenOptellenCheck() {
        c = a.plus(b);
        Assert.assertEquals(22,c.getTeller());
        Assert.assertEquals(20,c.getNoemer());
    }

    @Test
    public void breukenAftrekkenCheck() {
        c = a.min(b);
        Assert.assertEquals(-2,c.getTeller());
        Assert.assertEquals(20,c.getNoemer());
    }

    @Test
    public void breukenVermenigvuldigenCheck() {
        c = a.maal(b);
        Assert.assertEquals(6,c.getTeller());
        Assert.assertEquals(20,c.getNoemer());
    }

    @Test
    public void breukenDelenCheck() {
        c = a.deel(b);
        Assert.assertEquals(10,c.getTeller());
        Assert.assertEquals(12,c.getNoemer());
    }

    @After
    public void tearDown() {
        System.out.println(c);
    }










}
