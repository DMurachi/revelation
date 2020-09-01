package gasualty.revelation.models;

public class cisterna {
    private final int capacidad;
    private final int condicion;
    private final String placa;
    private final int kilometraje;

    public cisterna(int capacidad, int condicion, String placa, int kilometraje) {
        this.capacidad = capacidad;
        this.condicion = condicion;
        this.placa = placa;
        this.kilometraje = kilometraje;
    }

    public String getPlaca() {
        return placa;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public int getCondicion() {
        return condicion;
    }

    public int getKilometraje() {
        return kilometraje;
    }
}
