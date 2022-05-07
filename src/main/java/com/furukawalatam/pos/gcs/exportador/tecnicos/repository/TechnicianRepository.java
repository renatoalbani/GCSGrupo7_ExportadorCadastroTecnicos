package com.furukawalatam.pos.gcs.exportador.tecnicos.repository;

import com.furukawalatam.pos.gcs.exportador.tecnicos.model.Technician;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public final class TechnicianRepository {

    private static final TechnicianRepository instance = new TechnicianRepository();

    private List<Technician> technicians = new ArrayList<>();

    public static TechnicianRepository getInstance() {
        return instance;
    }

    public void save(Technician technician){
        this.technicians.add(technician);
    }

    public boolean update(Technician technician){
        if(remove(technician.getName())) {
            this.save(technician);
            return true;
        }
        return false;
    }

    public boolean remove(String name){
        return this.technicians.remove(findByName(name));
    }

    public List<Technician> listAll(){
        return this.technicians;
    }

    private Technician findByName(String name){
        Optional<Technician> first = this.technicians
                .stream()
                .filter(t -> t.getName().equals(name)).findFirst();
        return first.orElse(null);
    }

}
