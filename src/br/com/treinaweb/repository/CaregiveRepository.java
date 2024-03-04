package repository;

import java.util.ArrayList;
import java.util.List;

import models.Caregiver;

//  all classes here follow a pattern, (contract by interfaces).
public class CaregiveRepository implements IRepository<Caregiver, Long> {
    private List<Caregiver> caregivers;
    private Long IDCurrent;
    public CaregiveRepository() {
        caregivers = new ArrayList<>();
        IDCurrent = 1l;
    }
    @Override
    public boolean excludesById(Long id) {
        var caregiverFinded = searchById(id);
        if(caregivers != null) {
            caregivers.remove(caregiverFinded);
            return true;
        }
        return false;
    }

    @Override
    public Caregiver register(Caregiver model) {
        model.setId(IDCurrent);
        caregivers.add(model);
        IDCurrent++;
        return model;
    }

    @Override
    public List<Caregiver> searchAll() {
        return caregivers;
    }

    @Override
    public Caregiver searchById(Long id) {
        for (Caregiver caregiver : caregivers) {
            if(caregiver.getId().equals(id)) {
                return caregiver;
            }
        }
        
        return null;
    }
     
}
