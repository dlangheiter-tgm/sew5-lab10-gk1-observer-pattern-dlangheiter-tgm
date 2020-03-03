package observerPull;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class SprechstundenListeTest {

    private SprechstundenListe sprechstundenListe;

    @Before
    public void setUp() throws Exception {
        sprechstundenListe = new SprechstundenListe();
    }

    @Test
    public void addSprechstunde() {
        Sprechstunde dummy = new Sprechstunde("", "", 0, "", "");
        assertEquals(0, sprechstundenListe.getState().size());
        sprechstundenListe.addSprechstunde(dummy);
        assertEquals(1, sprechstundenListe.getState().size());
        assertEquals(dummy, sprechstundenListe.getState().get(0));
    }

    @Test
    public void removeSprechstunde() {
        Sprechstunde dummy = new Sprechstunde("", "", 0, "", "");
        sprechstundenListe.addSprechstunde(dummy);
        assertEquals(1, sprechstundenListe.getState().size());
        sprechstundenListe.removeSprechstunde(dummy);
        assertEquals(0, sprechstundenListe.getState().size());
    }

    @Test
    public void attach() {
        Observer observer = mock(Observer.class);

        sprechstundenListe.attach(observer);
        sprechstundenListe.sendUpdate();

        verify(observer).update();
    }

    @Test
    public void remove() {
        Observer observer = mock(Observer.class);

        sprechstundenListe.attach(observer);
        sprechstundenListe.remove(observer);
        sprechstundenListe.sendUpdate();

        verify(observer, never()).update();
    }

    @Test
    public void sendUpdate() {
        Observer observer1 = mock(Observer.class);
        Observer observer2 = mock(Observer.class);

        sprechstundenListe.attach(observer1);
        sprechstundenListe.attach(observer2);
        sprechstundenListe.sendUpdate();

        verify(observer1).update();
        verify(observer2).update();
    }
}