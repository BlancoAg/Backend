package com.portfolio.agusblan.Services;

import com.portfolio.agusblan.Models.Proyectos;
import com.portfolio.agusblan.Repository.ProyectosRepo;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@Transactional
public class ProyectosServ {
    @Autowired
    private final ProyectosRepo proyectosRepo;

    public ProyectosServ(ProyectosRepo proyectosRepo){
        this.proyectosRepo = proyectosRepo;
    }
    public Proyectos addProyectos(Proyectos proyectos){
        return proyectosRepo.save(proyectos);
    }

    public List<Proyectos> buscarProyectoss(){
        return proyectosRepo.findAll();
    }

    public Proyectos editarProyectos(Proyectos proyectos){
        return proyectosRepo.save(proyectos);
    }
    public void borrarProyectos(Long id){
        proyectosRepo.deleteById(id);
    }
}
