package gasualty.revelation.repository;

import gasualty.revelation.models.chofer;

import java.util.List;
import java.util.Optional;

public interface choferRepo {
    int insertChofer(chofer chofer);
    default int addChofer(chofer chofer){

        return insertChofer(chofer);
    }
    List<chofer> selectAllChofer();
    Optional<chofer> selectChoferByCedula(String cedula);
    int deleteChoferByCedula(String cedula);
    int updateChoferByCondicion(String cedula);
    Optional<chofer> selectChoferByCondicion(String condicion);
}
