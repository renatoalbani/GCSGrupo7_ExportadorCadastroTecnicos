package com.furukawalatam.pos.gcs.exportador.tecnicos;

import com.furukawalatam.pos.gcs.exportador.tecnicos.model.Technician;
import com.furukawalatam.pos.gcs.exportador.tecnicos.repository.TechnicianRepository;

public class Exportador {
    public static void main(String[] args) {
       System.out.println("Hello World!");

        TechnicianRepository repo = TechnicianRepository.getInstance();
        Technician tech = new Technician("Renato", "410000000", "Curitiba" );
        repo.save(tech);
    }
}
