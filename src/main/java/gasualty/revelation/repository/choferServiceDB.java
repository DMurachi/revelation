package gasualty.revelation.repository;
import gasualty.revelation.models.chofer;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository("postgres")
public class choferServiceDB implements choferRepo {
    @Override
    public int insertChofer(chofer chofer) {
        return 0;
    }
    @Override
    public List<chofer> selectAllChofer() {
        return List.of(new chofer("24197756", "Murachi", 1, "password"));
    }
    @Override
    public Optional<chofer> selectChoferByCedula(String cedula) {
        return Optional.empty();
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
    public Optional<chofer> selectChoferByCondicion(int condicion) {
        return Optional.empty();
    }
}

