package gasualty.revelation.models;

public class chuto {
    private final int condicion;
    private final String placa;

    public chuto(int condicion, String placa) {
        this.condicion = condicion;
        this.placa = placa;
    }

    public int getCondicion() {
        return condicion;
    }

    public String getPlaca() {
        return placa;
    }
}
