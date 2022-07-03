//CRISTIAN SILVESTRO

package integrador;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Practica {

    /**
     * El programa debera tomar un numero x y determinar si es palindromo o no **Contemplar que el num que llega puede ser null,en caso de que sea null,
     * retornar false, en caso que sea palindromo retornar true.
     *
     * @param num
     * @return esPalindromo
     */
    public Boolean numeroPalindromo(Long num) {
        //Aca escribir la logica necesaria
        String numero = String.valueOf(num);
        if (numero.charAt(0) != '-') {
            for (int i = 0, j = numero.length() - 1; i <= j; i++, j--) {
                if (numero.charAt(i) != numero.charAt(j)) {
                    return false;
                }
            }
        } else {
            for (int i = 1, j = numero.length() - 1; i <= j; i++, j--) {
                if (numero.charAt(i) != numero.charAt(j)) {
                    return false;
                }
            }
        }
        return true;
    }
    /**
     * Estamos en caramelolandia, donde estan los peores ladrones de dulces. Una vez al mes, se sienta una n cantidad de presos en ronda, contemplando al primer
     * preso que se sienta, como el preso 0. A los presos se le repartira una m cantidad de caramelos contemplando que se comenzaran a repartir los caramelos
     * desde el primer preso (inicio). El ultimo caramelo en repartirse estara podrido, determinar a que preso, segun su posicion en la ronda le tocara.
     *
     * @param inicio
     * @param cantidadCaramelos
     * @param cantidadPresos
     * @return presoQueLeTocoElCarameloPodrido
     */
    public int prisioneroDulce(int inicio, int cantidadCaramelos, int cantidadPresos) {
        //Aca escribir la logica necesaria
        
        for (int i = 1; i < cantidadCaramelos; i++) {

            if (inicio == cantidadPresos - 1) {
                inicio = 0;
            } else {
                inicio = inicio + 1;
            }
        }
        int presoQueLeTocoElCarameloPodrido = inicio;
        
        return presoQueLeTocoElCarameloPodrido;
    }
    /**
     * En un universo paralelo, donde los habitantes son medias, existe un crucero de medias donde se sube una lista de medias. Esta lista de tripulantes del
     * crucero es una Collection de letras, lo que se debera hacer, es filtrar la lista de medias que se suben al crucero y retornar una lista que contenga los
     * grupos de medias que si tenian amigas. Esta lista final de medias amigas se mostraran ordenadas de menor a mayor. A continuacion un ejemplo:
     *
     * List de medias que llegan : A,B,A,B,C,A,F,Z,C,H **F,Z,H no tienen amigas :( List que se deberia retornar : A,B,C
     *
     *
     * @param pasajeros
     * @return mediasAmigas
     */
    public List<String> mediasAmigas(List<String> pasajeros) {
        //Aca escribir la logica necesaria        
        ArrayList<String> mediasAmigas = new ArrayList();
        Set<String> elgrupo = new HashSet<String>(pasajeros);
        Collections.sort(pasajeros);

        for (int i = 0; i < pasajeros.size(); i++) {
            if (elgrupo.contains(pasajeros.get(i))) {
                elgrupo.add(pasajeros.get(i));
            }
        }
        for (String cadena : elgrupo) {
            if (!(Collections.frequency(pasajeros, cadena) == 1)) {
                mediasAmigas.add(cadena);
            }
        }
        if (mediasAmigas.isEmpty()) {         
            System.out.print("No hay amigas por agregar a la lista ");
        }
        return mediasAmigas;
    }
}
