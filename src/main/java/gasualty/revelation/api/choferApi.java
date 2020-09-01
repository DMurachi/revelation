package gasualty.revelation.api;

import gasualty.revelation.controller.choferController;
import gasualty.revelation.models.chofer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("api/v1/chofer")
@RestController
public class choferApi{
    private final choferController choferController;
    @Autowired
    public choferApi(choferController choferController) {
        this.choferController = choferController;
    }
    @PostMapping
    public void addChofer(chofer chofer){
        choferController.addChofer(chofer);
    }
    @GetMapping
    public List<chofer> getAllChofer(){
        return choferController.getAllChofer();
    }
    @GetMapping(path = "{cedula}")
    public chofer getChoferByCedula(@PathVariable("cedula") String cedula){
        return choferController.getChoferByCedula(cedula)
                .orElse(null);
    }
    @GetMapping(path = "{condicion}")
    public chofer getChoferByCondicion(int condicion){
        return choferController.getChoferByCondicion(condicion)
                .orElse(null);
    }
    @DeleteMapping(path = "{cedula}")
    public void deleteChoferByCedula(@PathVariable("cedula") String cedula){
        choferController.deleteChofer(cedula);
    }
    @PutMapping(path="{cedula}")
    public void updateChoferbyCondicion(@PathVariable("cedula")  @NonNull @RequestBody String cedula){
        choferController.updateChoferCondicion(cedula);
    }
}
