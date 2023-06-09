import org.junit.Test;

import static org.example.Zwemles.magGratisZwemlesVolgen;
import static org.junit.Assert.assertEquals;

public class ModifiedDecisionCoverage {
    @Test
    public void checkMagGratisZwemles1() {
        boolean resultaat = magGratisZwemlesVolgen(15, false, false);
        assertEquals(resultaat, false);
    }

    @Test
    public void checkMagGratisZwemles2() {
        boolean resultaat = magGratisZwemlesVolgen(15, true, false);
        assertEquals(resultaat, true);
    }

    @Test
    public void checkMagGratisZwemles3() {
        boolean resultaat = magGratisZwemlesVolgen(15, false, true);
        assertEquals(resultaat, true);
    }


}
