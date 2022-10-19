import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TestesProblemasIFPR {

    @Test
    public void testarPrimeiroProblemaCaminho1() {
        assertEquals("0", Problemas.primeiroProblema(0));
    }

    @Test
    public void testarPrimeiroProblemaCaminho2() {
        assertEquals("0 1", Problemas.primeiroProblema(2));
    }

    @Test
    public void testarPrimeiroProblemaCaminho3() {
        assertEquals("0 1 1 2", Problemas.primeiroProblema(4));
    }

    @Test
    public void testarSegundoProblemaCaminho1() {
        assertEquals(0, Problemas.segundoProblema(0, 0, new int[]{0, 0}));
    }

    @Test
    public void testarSegundoProblemaCaminho2() {
        assertEquals(0, Problemas.segundoProblema(0, 1, new int[]{0, 0}));
    }

    @Test
    public void testarSegundoProblemaCaminho3() {
        assertEquals(0, Problemas.segundoProblema(1, 1, new int[]{1, 3}));
    }

    @Test
    public void testarSegundoProblemaCaminho4() {
        assertEquals(1, Problemas.segundoProblema(1, 1, new int[]{0, 0}));
    }

}
