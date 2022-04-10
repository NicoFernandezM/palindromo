import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PalindromoTest {
    private String [] palabrasIngresadas;
    private boolean [] resultadosEsperados;

    @BeforeEach
    public void init() {
        palabrasIngresadas = new String[] {"200", "", "aaabccbaaa", "ahabccbaaa", "La tele letal"};
        resultadosEsperados = new boolean[] {false, true, true, false, true};
    }

    @Test
    public void esPalindromoTest() {
        for (int i = 0; i < palabrasIngresadas.length; i++) {
            boolean resultadoObtenido = Palindromo.esPalindromo(palabrasIngresadas[i]);
            assertEquals(resultadoObtenido, resultadosEsperados[i]);
        }
    }
}
