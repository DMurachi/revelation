package gasualty.revelation.service;

import gasualty.revelation.models.cisterna;
import gasualty.revelation.repository.cisternaRepo;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class cisternaService implements cisternaRepo {
    private static List<cisterna> DB = new ArrayList<>();
    @Override
    public int insertCisterna(cisterna cisterna){
        DB.add(new cisterna(cisterna.getCapacidad(), cisterna.getCondicion(), cisterna.getPlaca(), cisterna.getKilometraje()));
        return 1;
    }

    @Override
    public List<cisterna> selectAllCisterna() {
        return DB;
    }

    @Override
    public Optional<cisterna> selectCisternaByPlaca(String placa) {
        return DB.stream().filter(cisterna -> cisterna.getPlaca().equals(placa)).findFirst();
    }

    @Override
    public int deleteCisternaByPlaca(String placa) {
        Optional<cisterna> cisternaPrueba = selectCisternaByPlaca(placa);
        if(cisternaPrueba.isEmpty()){ return 0;}
        DB.remove(cisternaPrueba.get());
        return 1;
    }

    @Override
    public int updateCisternaCondicion() {
        return 0;
    }

    @Override
    public int updateKilometraje(int viajeKilometraje) {

        return 0;
    }
}
