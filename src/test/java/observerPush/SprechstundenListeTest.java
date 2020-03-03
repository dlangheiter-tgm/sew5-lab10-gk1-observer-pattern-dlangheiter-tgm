package observerPush;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SprechstundenListeTest {

    private SprechstundenListe sprechstundenListe;
    private Sprechstunde dummy;

    @Before
    public void setUp() throws Exception {
        sprechstundenListe = new SprechstundenListe();
        dummy = new Sprechstunde("", "", 0, "", "");
    }

    @Test
    public void addSprechstunde() {
        assertEquals(0, sprechstundenListe.getList().size());
        sprechstundenListe.addSprechstunde(dummy);
        assertEquals(1, sprechstundenListe.getList().size());
        assertEquals(dummy, sprechstundenListe.getList().get(0));
    }

    @Test
    public void removeSprechstunde() {
        sprechstundenListe.addSprechstunde(dummy);
        assertEquals(1, sprechstundenListe.getList().size());
        sprechstundenListe.removeSprechstunde(dummy);
        assertEquals(0, sprechstundenListe.getList().size());
    }

    @Test
    public void attach() {
    }

    @Test
    public void remove() {
    }

    @Test
    public void sendUpdate() {
    }

    @Test
    public void getList() {
    }
}