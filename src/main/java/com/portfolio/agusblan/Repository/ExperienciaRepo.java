
package com.portfolio.agusblan.Repository;

import com.portfolio.agusblan.Models.Experiencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExperienciaRepo extends JpaRepository<Experiencia,Long>{
    public void deleteById(Long id);
    
}
