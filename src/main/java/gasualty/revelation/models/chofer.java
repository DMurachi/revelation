package gasualty.revelation.models;
import com.fasterxml.jackson.annotation.JsonProperty;
public class chofer {
    private final String cedula;
    private final String Nombre;
    private final String condicion;
    private final String password;
    public chofer(@JsonProperty("cedula") String cedula,
                  @JsonProperty("Nombre") String Nombre,
                  @JsonProperty("condicion") String condicion,
                  @JsonProperty("password") String password) {
        this.cedula = cedula;
        this.Nombre = Nombre;
        this.condicion = condicion;
        this.password = password;
    }
    public String getCedula() {
        return cedula;
    }
    public String getNombre() {
        return Nombre;
    }
    public String getCondicion() {
        return condicion;
    }
    public String getPassword() {
        return password;
    }
}
