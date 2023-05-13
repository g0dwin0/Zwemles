import org.junit.Test;

import static org.example.Zwemles.magGratisZwemlesVolgen;
import static org.junit.Assert.assertEquals;

public class DecisionCoverage {
    @Test
    public void checkMagGratisZwemles1() {
        boolean resultaat = magGratisZwemlesVolgen(2, false, false);
        assertEquals(resultaat, false);
    }

    @Test
    public void checkMagGratisZwemles2() {
        boolean resultaat = magGratisZwemlesVolgen(15, true, false);
        assertEquals(resultaat, true);
    }
}
