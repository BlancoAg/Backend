package com.portfolio.agusblan.Repository;

import com.portfolio.agusblan.Models.Proyectos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProyectosRepo extends JpaRepository<Proyectos,Long> {
    public void deleteById(Long id);

}
