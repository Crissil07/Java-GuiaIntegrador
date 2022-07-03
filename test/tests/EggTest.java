//CRISTIAN SILVESTRO

package tests;

import integrador.Practica;
import java.util.ArrayList;
import java.util.Arrays;
import org.junit.Test;
import static org.junit.Assert.*;

public class EggTest {

    private Practica pr;

    public EggTest() {
        this.pr = new Practica();
    }

    @Test
    public void prisioneroDulceTest() {
        assertEquals(3, pr.prisioneroDulce(0, 10, 6));
        assertEquals(2, pr.prisioneroDulce(7, 4, 8));
        assertEquals(1, pr.prisioneroDulce(1, 5, 2));
        assertEquals(0, pr.prisioneroDulce(0, 10, 1));
        assertEquals(39, pr.prisioneroDulce(455, 1585, 500));
    }

    @Test
    public void mediasAmigasTest() {

        ArrayList<String> medias = new ArrayList(Arrays.asList(new String[]{"A", "B", "C", "D", "A", "C", "D", "A"}));
        ArrayList<String> expected = new ArrayList(Arrays.asList(new String[]{"A", "C", "D"}));
        assertEquals(expected, pr.mediasAmigas(medias));
        medias = new ArrayList(Arrays.asList(new String[]{"R", "R", "A", "A", "S", "S", "G", "H"}));
        expected = new ArrayList(Arrays.asList(new String[]{"A", "R", "S"}));
        assertEquals(expected, pr.mediasAmigas(medias));
        medias = new ArrayList(Arrays.asList(new String[]{"R", "E", "T", "A", "P", "S", "G", "H"}));
        expected = new ArrayList();
        assertEquals(expected, pr.mediasAmigas(medias));
    }

    @Test
    public void numeroPalindromoTest() {
        assertEquals(true, pr.numeroPalindromo(123454321L));
        assertEquals(true, pr.numeroPalindromo(-123454321L));
        assertEquals(true, pr.numeroPalindromo(2L));
        assertEquals(true, pr.numeroPalindromo(0L));
        assertEquals(false, pr.numeroPalindromo(null));
        assertEquals(false, pr.numeroPalindromo(231L));
        assertEquals(false, pr.numeroPalindromo(123L));
        assertEquals(false, pr.numeroPalindromo(Long.MAX_VALUE));
    }
}
