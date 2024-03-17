
package tema10.ejemplosMapas;

import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author alumno
 */
public class CapitalesComunidadesV1 {
    public static void main(String[] args){
        Map<String,String> capitales = new TreeMap<String,String>();
        
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
        
        capitales.forEach((clave, valor) -> System.out.println((clave + ":" + valor)));
    }   
}
