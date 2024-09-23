
package TEMA10_Colecciones.ejemplosMapas;

import java.util.Map;
import java.util.TreeMap;

/**
 * Un programa de Colecion de Datos para 
 * las Comunidades y sus Capitales
 * @author Ruper
 */


public class CapitalesComunidadesV4 {
         
         //Mapas
         static Map rellenar (Map comunidades){
                  
                  //Para añadir en Map con .put
                  comunidades.put("Madrid", "Madrid");
                  comunidades.put("Andalucía", "Sevilla");
                  comunidades.put("Asturias", "Oviedo");
                  comunidades.put("Ceuta", "Ceuta");
                  comunidades.put("Cantabria", "Santander");
                  comunidades.put("La Rioja", "Logroño");
                  comunidades.put("Castilla y León", "Valladolid");
                  comunidades.put("Cataluña", "Barcelona");
                  comunidades.put("Extremadura", "Mérida");
                  comunidades.put("Galicia", "Santiago de Compostela");
                  comunidades.put("Islas Baleares", "Palma de Mallorca");
                  comunidades.put("Castilla-La Mancha", "Toledo");
                  comunidades.put("Islas Canarias", "Las Palmas de Gran Canaria");
                  comunidades.put("Murcia", "Murcia");
                  comunidades.put("Navarra", "Pamplona");
                  comunidades.put("País Vasco", "Vitoria-Gasteiz");
                  comunidades.put("Melilla", "Melilla");
                  comunidades.put("Aragón", "Zaragoza");
                  comunidades.put("Castilla-La Mancha", "Toledo");

              
                  //imprimir el tamaño de Map
                  System.out.println("Total comunidades: " + comunidades.size());
                  
                  return comunidades;
         }//Fin Map
         
          public static void main(String[] args) {
                    // Crear un mapa TreeMap para ordenar automáticamente
                    Map<String, String> comunidadesCapitales = new TreeMap<>();

                    // Llenar el mapa
                    rellenar(comunidadesCapitales);

                    // Imprimir el contenido del mapa
                    System.out.println("\n----- Comunidades Autónomas y sus Capitales -----\n");
                    for (Map.Entry<String, String> entry : comunidadesCapitales.entrySet()) {
                              System.out.println(entry.getKey() + ": " + entry.getValue());
                    }//Fin for
                    System.out.println("\nImprimir con forEach: ");
                    comunidadesCapitales.forEach((clave,valor) ->System.out.println((clave+":"+valor)));

          }//Fin main
         
}//Fin class
