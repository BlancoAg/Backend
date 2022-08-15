
package com.portfolio.agusblan.Repository;

import com.portfolio.agusblan.Models.Educacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EducacionRepo extends JpaRepository<Educacion,Long>{

    public void deleteById(Long id);
    
}
