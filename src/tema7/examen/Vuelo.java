
package tema7.examen;

/**
 *
 * @author Ruper
 */
public class Vuelo {
    private String codigoVuelo;
    private String destino;
    private int capacidad;
    private int asientosReservados;

    public Vuelo(String codigoVuelo, String destino, int capacidad) {
        this.codigoVuelo = codigoVuelo;
        this.destino = destino;
        this.capacidad = capacidad;
        this.asientosReservados = 0;
    }

    // Métodos getter y setter
    public String getCodigoVuelo() {
        return codigoVuelo;
    }

    public String getDestino() {
        return destino;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public int getAsientosReservados() {
        return asientosReservados;
    }

    public void reservarAsiento() {
        if (asientosReservados < capacidad) {
            asientosReservados++;
        } else {
            System.out.println("No hay asientos disponibles para este vuelo.");
        }
    }

    public void cancelarReserva() {
        if (asientosReservados > 0) {
            asientosReservados--;
        } else {
            System.out.println("No hay reservas para cancelar en este vuelo.");
        }
    }

    @Override
    public String toString() {
        return "Información vuelo: " +
                "codigo='" + codigoVuelo + '\'' +
                ", destino='" + destino + '\'' +
                ", capacidad=" + capacidad +
                ", asientosReservados=" + asientosReservados;
    }
}
