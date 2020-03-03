package observerPull;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class EmailTest {

    @Test
    public void update() {
        SprechstundenListe sl = mock(SprechstundenListe.class);

        Email email = new Email(sl);
        email.update();

        verify(sl).getState();
    }
}