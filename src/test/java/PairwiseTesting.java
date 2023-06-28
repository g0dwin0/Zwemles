import org.junit.Test;

import static org.example.Zwemles.isOudGenoegZwemles;
import static org.example.Zwemles.magGratisZwemlesVolgen;
import static org.junit.Assert.assertEquals;

public class PairwiseTesting {
    @Test
    public void checkMagGratisZwemles1() {
        boolean resultaat = magGratisZwemlesVolgen(5, true, true);
        assertEquals(resultaat, false);
    }

    @Test
    public void checkMagGratisZwemles2() {
        boolean resultaat = magGratisZwemlesVolgen(5, false, false);
        assertEquals(resultaat, false);
    }

    @Test
    public void checkMagGratisZwemles3() {
        boolean resultaat = magGratisZwemlesVolgen(12, false, false);
        assertEquals(resultaat, false);
    }

    @Test
    public void checkMagGratisZwemles4() {
        boolean resultaat = magGratisZwemlesVolgen(12, true, true);
        assertEquals(resultaat, true);
    }
    @Test
    public void checkMagGratisZwemles5() {
        boolean resultaat = magGratisZwemlesVolgen(19, false, false);
        assertEquals(resultaat, false);
    }

    @Test
    public void checkMagGratisZwemles6() {
        boolean resultaat = magGratisZwemlesVolgen(19, true, true);
        assertEquals(resultaat, false);
    }

}
