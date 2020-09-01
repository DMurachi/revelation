package gasualty.revelation.service;

import gasualty.revelation.models.chofer;
import gasualty.revelation.repository.choferRepo;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class choferService implements choferRepo {
    private static List<chofer> DB = new ArrayList<>();
    @Override
    public int insertChofer(chofer chofer) {
        DB.add(new chofer(chofer.getCedula(), chofer.getNombre(), chofer.getCondicion()/*, chofer.getCisterna()*/, chofer.getPassword()));
        return 1;//to make sure it works
    }

    @Override
    public List<chofer> selectAllChofer() {
        return DB;
    }

    @Override
    public Optional<chofer> selectChoferByCedula(String cedula) {
        return DB.stream()
                .filter(chofer -> chofer.getCedula().equals(cedula))
                .findFirst();
    }

    @Override
    public int deleteChoferByCedula(String cedula) {
        Optional<chofer> choferMaybe = selectChoferByCedula(cedula);
        if(choferMaybe.isEmpty()){
            return 0;
        }
        DB.remove(choferMaybe.get());
        return 1;
    }

    @Override
    public int updateChoferByCondicion(String cedula) {
        Optional<chofer> choferPrueba = selectChoferByCedula(cedula);
        if(choferPrueba.isEmpty()){
            return 0;
        }
        if(choferPrueba.get().getCondicion()==1){
            choferPrueba.get().setCondicion(0);
            return 2;
        }
        if(choferPrueba.get().getCondicion()==0){
            choferPrueba.get().setCondicion(1);
            return 1;
        }
        else return 3;
    }

    @Override//faltan cambios a esta funcion para que revise las condicioones activas e inactivas. Dependiendo del valor que mande el admin.
    public Optional<chofer> selectChoferByCondicion(int condicion) {
        return DB.stream()
                .filter(chofer -> chofer.getCondicion()==condicion)
                .findFirst();
    }


}
