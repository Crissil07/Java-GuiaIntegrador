//CRISTIAN SILVESTRO

package integrador;

import java.util.ArrayList;
import java.util.Arrays;

public class Integrador {

    public static void main(String[] args) {
        
        Practica practica = new Practica();
        
        //Generar las variables necesarias para probar
        ArrayList<String> medias = new ArrayList(Arrays.asList(new String[]{"A", "B", "C"}));

        System.out.println(practica.mediasAmigas(medias));
        System.out.println(practica.numeroPalindromo(123454321L));
        System.out.println(practica.prisioneroDulce(455, 1585, 500));
    }
}
