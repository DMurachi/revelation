package gasualty.revelation.repository;

import gasualty.revelation.models.chuto;

public interface chutoRepo {
    int insertChuto(chuto chuto);
    default int addChuto(chuto chuto){
        return insertChuto(chuto);
    }
}
