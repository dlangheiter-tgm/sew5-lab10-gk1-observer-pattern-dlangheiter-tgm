package observerPull;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class WebServiceTest {

    @Test
    public void update() {
        SprechstundenListe sl = mock(SprechstundenListe.class);

        WebService webService = new WebService(sl);
        webService.update();

        verify(sl).getState();
    }
}