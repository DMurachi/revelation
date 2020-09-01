package gasualty.revelation.models;
import com.fasterxml.jackson.annotation.JsonProperty;
public class chofer {
    private final String cedula;
    private final String Nombre;
    private int condicion;
    // private final cisterna cisterna;
    private final String password;
    public chofer(@JsonProperty("cedula") String cedula,
                  @JsonProperty("Nombre") String Nombre,
                  @JsonProperty("condicion") int condicion,
                  //  @JsonProperty("cisterna") cisterna cisterna,
                  @JsonProperty("password") String password) {
        this.cedula = cedula;
        this.Nombre = Nombre;
        this.condicion = condicion;
        //  this.cisterna = cisterna;
        this.password = password;
    }
    public String getCedula() {
        return cedula;
    }
    public String getNombre() {
        return Nombre;
    }
    public int getCondicion() {
        return condicion;
    }
    public void setCondicion(int condicion) {
        this.condicion = condicion;
    }
    public String getPassword() {
        return password;
    }
}
