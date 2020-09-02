package gasualty.revelation.controller;
import gasualty.revelation.models.chofer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import gasualty.revelation.repository.choferRepo;

import java.util.List;
import java.util.Optional;
@Service
public class choferController {
    private final choferRepo choferRepo;
    @Autowired
    public choferController(@Qualifier("postgres") choferRepo choferRepo) {
        this.choferRepo = choferRepo;
    }
    public int addChofer(chofer chofer){
        return choferRepo.insertChofer(chofer);
    }
    public List<chofer> getAllChofer(){
        return choferRepo.selectAllChofer();
    }
    public Optional<chofer> getChoferByCedula(String cedula){
        return choferRepo.selectChoferByCedula(cedula);
    }
    public Optional<chofer> getChoferByCondicion(String condicion){
        return choferRepo.selectChoferByCondicion(condicion);
    }
    public int updateChoferCondicion(String cedula){
        return choferRepo.updateChoferByCondicion(cedula);
    }
    public int deleteChofer(String cedula){
        return choferRepo.deleteChoferByCedula(cedula);
    }
}
