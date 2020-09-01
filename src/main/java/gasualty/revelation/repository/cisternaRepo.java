package gasualty.revelation.repository;

import gasualty.revelation.models.cisterna;

import java.util.List;
import java.util.Optional;

public interface cisternaRepo {
    int insertCisterna(cisterna cisterna);
    default int addCisterna(cisterna cisterna){
        return insertCisterna(cisterna);
    }
    List<cisterna> selectAllCisterna();
    Optional<cisterna> selectCisternaByPlaca(String placa);
    int deleteCisternaByPlaca(String placa);
    int updateCisternaCondicion();
    int updateKilometraje(int viajeKilometros);
}
