package gasualty.revelation.service;

import gasualty.revelation.models.chuto;
import gasualty.revelation.repository.chutoRepo;

import java.util.ArrayList;
import java.util.List;

public class chutoService implements chutoRepo {

    private static List<chuto> DB = new ArrayList<>();
    @Override
    public int insertChuto(chuto chuto) {
        DB.add(new chuto(chuto.getCondicion(),chuto.getPlaca()));
        return 1;
    }
}
