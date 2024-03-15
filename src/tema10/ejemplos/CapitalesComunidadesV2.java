
package tema10.ejemplos;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author alumno
 */
public class CapitalesComunidadesV2 {
    static Map rellenar(Map capitales){ 
        capitales.put("Andalucía", "Sevilla");
        capitales.put("Aragón", "Zaragoza");
        capitales.put("Asturias", "Oviedo");
        capitales.put("Baleares", "Palma de Mallorca");
        capitales.put("Canarias", "Tenerife");
        capitales.put("Cantabria", "Santander");
        capitales.put("Castilla-La Mancha", "Toledo");
        capitales.put("Castilla y León", "Valladolid");
        capitales.put("Cataluña", "Barcelona");
        capitales.put("Ceuta", "Ceuta");
        capitales.put("Comunidad Valenciana", "Valencia");
        capitales.put("Extremadura", "Mérida");
        capitales.put("Galicia", "Santiago de Compostela");
        capitales.put("Madrid", "Madrid");
        capitales.put("Melilla", "Melilla");
        capitales.put("Murcia", "Murcia");
        capitales.put("Navarra", "Pamplona");
        capitales.put("País Vasco", "Vitoria-Gasteiz");
        capitales.put("La Rioja", "Logroño");
        return capitales;
    }
    
    public static void main(String[] args) {
         // Orden natural
        Map<String, String> capitalesOrdenado = new TreeMap<>();
        rellenar(capitalesOrdenado);
        System.out.println("Orden natural:");
        capitalesOrdenado.forEach((comunidad, capital) -> System.out.println(comunidad + ": " + capital));
        
        // Orden inverso
        Map<String, String> capitalesInvertido = new TreeMap<>(Comparator.reverseOrder()); // Al ser un par uso Comparator
        rellenar(capitalesInvertido);
        System.out.println("\nOrden inverso:");
        capitalesInvertido.forEach((comunidad, capital) -> System.out.println(comunidad + ": " + capital));
    }
    
}
