package com.portfolio.agusblan.Services;

import com.portfolio.agusblan.Models.Experiencia;
import com.portfolio.agusblan.Repository.ExperienciaRepo;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@Transactional
public class ExperienciaServ {
    @Autowired
    private final ExperienciaRepo experienciaRepo;

    public ExperienciaServ(ExperienciaRepo experienciaRepo){
        this.experienciaRepo = experienciaRepo;
    }
    public Experiencia addExperiencia(Experiencia experiencia){
        return experienciaRepo.save(experiencia);
    }

    public List<Experiencia> buscarExperiencias(){
        return experienciaRepo.findAll();
    }

    public Experiencia editarExperiencia(Experiencia experiencia){
        return experienciaRepo.save(experiencia);
    }
    public void borrarExperiencia(Long id){
        experienciaRepo.deleteById(id);
    }
}