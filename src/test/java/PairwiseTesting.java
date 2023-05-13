import org.junit.Test;

import static org.example.Zwemles.isOudGenoegZwemles;
import static org.example.Zwemles.magGratisZwemlesVolgen;
import static org.junit.Assert.assertEquals;

public class PairwiseTesting {
    @Test
    public void checkMagGratisZwemles1() {
        boolean resultaat = magGratisZwemlesVolgen(0, true, true);
        assertEquals(resultaat, false);
    }

    @Test
    public void checkMagGratisZwemles2() {
        boolean resultaat = magGratisZwemlesVolgen(15, false, false);
        assertEquals(resultaat, false);
    }

    @Test
    public void checkMagGratisZwemles3() {
        boolean resultaat = magGratisZwemlesVolgen(20, true, false);
        assertEquals(resultaat, false);
    }

    @Test
    public void checkMagGratisZwemles4() {
        boolean resultaat = magGratisZwemlesVolgen(15, true, true);
        assertEquals(resultaat, true);
    }
    @Test
    public void checkMagGratisZwemles5() {
        boolean resultaat = magGratisZwemlesVolgen(20, false, true);
        assertEquals(resultaat, false);
    }

    @Test
    public void checkMagGratisZwemles6() {
        boolean resultaat = magGratisZwemlesVolgen(3, false, false);
        assertEquals(resultaat, false);
    }
    @Test
    public void checkMagGratisZwemles8() {
        boolean resultaat = magGratisZwemlesVolgen(10, true, false);
        assertEquals(resultaat, true);
    }
    @Test
    public void checkMagGratisZwemles13() {
        boolean resultaat = magGratisZwemlesVolgen(20, false, false);
        assertEquals(resultaat, false);
    }

    @Test
    public void checkMagGratisZwemles9() {
        boolean resultaat = magGratisZwemlesVolgen(3, true, false);
        assertEquals(resultaat, false);
    }
    @Test
    public void checkMagGratisZwemles10() {
        boolean resultaat = magGratisZwemlesVolgen(15, false, true);
        assertEquals(resultaat, true);
    }
    @Test
    public void checkMagGratisZwemles11() {
        boolean resultaat = magGratisZwemlesVolgen(20, true, true);
        assertEquals(resultaat, false);
    }
    @Test
    public void checkMagGratisZwemles12() {
        boolean resultaat = magGratisZwemlesVolgen(3, false, true);
        assertEquals(resultaat, false);
    }

}
