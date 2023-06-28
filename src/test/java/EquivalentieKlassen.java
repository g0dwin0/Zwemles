import org.junit.Test;

import static org.example.Zwemles.isOudGenoegZwemles;
import static org.junit.Assert.assertEquals;

public class EquivalentieKlassen {
    @Test
    public void checkMagGratisZwemles0() {
        boolean resultaat = isOudGenoegZwemles(0);
        assertEquals(resultaat, false);
    }
    @Test
    public void checkMagGratisZwemles1() {
        boolean resultaat = isOudGenoegZwemles(7);
        assertEquals(resultaat, true);
    }

    @Test
    public void checkMagGratisZwemles2() {
        boolean resultaat = isOudGenoegZwemles(18);
        assertEquals(resultaat, true);
    }

    @Test
    public void checkMagGratisZwemles3() {
        boolean resultaat = isOudGenoegZwemles(20);
        assertEquals(resultaat, false);
    }
}
