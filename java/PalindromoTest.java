import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromoTest {
    private String [] palabrasIngresadas;
    private boolean [] resultadosEsperados;

    @BeforeEach
    public void init() {
        palabrasIngresadas = new String[] {"aca", "acas", "h", "Asa"};
        resultadosEsperados = new boolean[] {true, false, true, false};
    }

    @Test
    public void esPalindromoTest() {
        for (int i = 0; i < palabrasIngresadas.length; i++) {
            boolean resultadoObtenido = Palindromo.esPalindromo(palabrasIngresadas[i]);
            assertEquals(resultadoObtenido, resultadosEsperados[i]);
        }
    }


}
