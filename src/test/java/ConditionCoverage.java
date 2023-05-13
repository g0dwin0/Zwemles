import org.junit.Test;

import static org.example.Zwemles.magGratisZwemlesVolgen;
import static org.junit.Assert.assertEquals;

public class ConditionCoverage {
    @Test
    public void checkMagGratisZwemles1() {
        boolean resultaat = magGratisZwemlesVolgen(10, false, false);
        assertEquals(resultaat, false);
    }

    @Test
    public void checkMagGratisZwemles2() {
        boolean resultaat = magGratisZwemlesVolgen(3, true, false);
        assertEquals(resultaat, false);
    }

    @Test
    public void checkMagGratisZwemles3() {
        boolean resultaat = magGratisZwemlesVolgen(5, false, true);
        assertEquals(resultaat, false);
    }

}
