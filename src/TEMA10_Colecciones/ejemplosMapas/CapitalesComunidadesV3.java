
package TEMA10_Colecciones.ejemplosMapas;

import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author Ruper
 */
public class CapitalesComunidadesV3 {
    public static void main(String[] args){
        Map<String,String> capitales = new TreeMap<>(Map.of( // Con Map.of() limite de 10 pares
                "Andalucía", "Sevilla",
                "Aragón", "Zaragoza",
                "Asturias", "Oviedo",
                "Baleares", "Palma de Mallorca",
                "Canarias", "Tenerife",
                "Cantabria", "Santander",
                "Castilla-La Mancha", "Toledo",
                "Castilla y León", "Valladolid",
                "Cataluña", "Barcelona",
                "Ceuta", "Ceuta"
                ));
        
        System.out.println("MOSTRAR CON Map.of():\n");
        capitales.forEach((clave, valor) -> System.out.println((clave + ":" + valor)));
        
        Map<String, String> capitales2 = new TreeMap<>(Map.ofEntries(
                Map.entry("Andalucía", "Sevilla"),
                Map.entry("Aragón", "Zaragoza"),
                Map.entry("Asturias", "Oviedo"),
                Map.entry("Baleares", "Palma de Mallorca"),
                Map.entry("Canarias", "Tenerife"),
                Map.entry("Cantabria", "Santander"),
                Map.entry("Castilla-La Mancha", "Toledo"),
                Map.entry("Castilla y León", "Valladolid"),
                Map.entry("Cataluña", "Barcelona"),
                Map.entry("Ceuta", "Ceuta"),
                // Añadir más entradas aquí
                Map.entry("Comunidad Valenciana", "Valencia"),
                Map.entry("Extremadura", "Mérida"),
                Map.entry("Galicia", "Santiago de Compostela"),
                Map.entry("Madrid", "Madrid"),
                Map.entry("Melilla", "Melilla"),
                Map.entry("Murcia", "Murcia"),
                Map.entry("Navarra", "Pamplona"),
                Map.entry("País Vasco", "Vitoria-Gasteiz"),
                Map.entry("La Rioja", "Logroño")
        ));
        
        System.out.println("\nMOSTRAR CON Map.ofEntries():\n");
        capitales2.forEach((clave, valor) -> System.out.println(clave + ":" + valor));
    }   
}
/*
"Andalucía", "Sevilla",
                "Aragón", "Zaragoza",
                "Asturias", "Oviedo",
                "Baleares", "Palma de Mallorca",
                "Canarias", "Tenerife",
                "Cantabria", "Santander",
                "Castilla-La Mancha", "Toledo",
                "Castilla y León", "Valladolid",
                "Cataluña", "Barcelona",
                "Ceuta", "Ceuta",
                "Comunidad Valenciana", "Valencia",
                "Extremadura", "Mérida",
                "Galicia", "Santiago de Compostela",
                "Madrid", "Madrid",
                "Melilla", "Melilla",
                "Murcia", "Murcia",
                "Navarra", "Pamplona",
                "País Vasco", "Vitoria-Gasteiz",
                "La Rioja", "Logroño"
*/