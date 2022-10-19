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

}
