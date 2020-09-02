package gasualty.revelation.repository;
import gasualty.revelation.models.chofer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository("postgres")
public class choferServiceDB implements choferRepo {
    private final JdbcTemplate jdbcTemplate;
    @Autowired
    public choferServiceDB(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public int insertChofer(chofer chofer) {
        return 0;
    }
    @Override
    public List<chofer> selectAllChofer() {
        final String sql = "SELECT cedula,nombre,condicion,password FROM chofer";
        return jdbcTemplate.query(sql,(resultSet,i)->{
            String cedula = resultSet.getString("cedula");
            String nombre = resultSet.getString("nombre");
            String condicion = resultSet.getString("condicion");
            String password = resultSet.getString("password");
            return new chofer(cedula, nombre, condicion, password);
        });
    }
    @Override
    public Optional<chofer> selectChoferByCedula(String cedula) {
        final String sql = "SELECT cedula FROM chofer WHERE cedula = cedula";
        chofer chofer = jdbcTemplate.queryForObject(
                sql,
                new Object[]{cedula},
                (resultSet, i) -> {
                    String cedula1 = resultSet.getString("cedula");
                    String nombre = resultSet.getString("nombre");
                    String condicion = resultSet.getString("condicion");
                    String password = resultSet.getString("password");
                    return new chofer(cedula1, nombre, condicion, password);
                });
        return Optional.ofNullable(chofer);

    }


    @Override
    public int deleteChoferByCedula(String cedula) {
        return 0;
    }
    @Override
    public int updateChoferByCondicion(String cedula) {
        return 0;
    }
    @Override
//faltan cambios a esta funcion para que revise las condicioones activas e inactivas. Dependiendo del valor que mande el admin.
    public Optional<chofer> selectChoferByCondicion(String condicion) {
        return Optional.empty();
    }
}

