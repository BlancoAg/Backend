
package com.portfolio.agusblan.Repository;

import com.portfolio.agusblan.Models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UsuarioRepo extends JpaRepository<Usuario,Long>{

    public void deleteById(Long id);
    
}
