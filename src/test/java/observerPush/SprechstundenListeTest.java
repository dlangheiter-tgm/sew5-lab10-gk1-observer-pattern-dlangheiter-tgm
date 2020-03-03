package observerPush;

import org.junit.Before;
import org.junit.Test;
import static org.mockito.Mockito.*;

import static org.junit.Assert.*;

public class SprechstundenListeTest {

    private SprechstundenListe sprechstundenListe;

    @Before
    public void setUp() throws Exception {
        sprechstundenListe = new SprechstundenListe();
    }

    @Test
    public void addSprechstunde() {
        Sprechstunde dummy = new Sprechstunde("", "", 0, "", "");
        assertEquals(0, sprechstundenListe.getList().size());
        sprechstundenListe.addSprechstunde(dummy);
        assertEquals(1, sprechstundenListe.getList().size());
        assertEquals(dummy, sprechstundenListe.getList().get(0));
    }

    @Test
    public void removeSprechstunde() {
        Sprechstunde dummy = new Sprechstunde("", "", 0, "", "");
        sprechstundenListe.addSprechstunde(dummy);
        assertEquals(1, sprechstundenListe.getList().size());
        sprechstundenListe.removeSprechstunde(dummy);
        assertEquals(0, sprechstundenListe.getList().size());
    }

    @Test
    public void attach() {
        Observer observer = mock(Observer.class);

        sprechstundenListe.attach(observer);
        sprechstundenListe.sendUpdate();

        verify(observer).update(sprechstundenListe);
    }

    @Test
    public void remove() {
        Observer observer = mock(Observer.class);

        sprechstundenListe.attach(observer);
        sprechstundenListe.remove(observer);
        sprechstundenListe.sendUpdate();

        verify(observer, never()).update(any());
    }

    @Test
    public void sendUpdate() {
        Observer observer1 = mock(Observer.class);
        Observer observer2 = mock(Observer.class);

        sprechstundenListe.attach(observer1);
        sprechstundenListe.attach(observer2);
        sprechstundenListe.sendUpdate();

        verify(observer1).update(sprechstundenListe);
        verify(observer2).update(sprechstundenListe);
    }
}