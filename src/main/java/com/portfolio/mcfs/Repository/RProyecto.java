package com.portfolio.mcfs.Repository;

import com.portfolio.mcfs.Entity.Proyecto;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RProyecto extends JpaRepository<Proyecto, String>{
    public Optional<Proyecto> findByNombreProy(String nombreProy);
    public boolean existsByNombreProy(String nombreProy);
}
