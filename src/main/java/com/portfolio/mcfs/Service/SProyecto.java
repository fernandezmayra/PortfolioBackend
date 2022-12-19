package com.portfolio.mcfs.Service;

import com.portfolio.mcfs.Entity.Proyecto;
import com.portfolio.mcfs.Repository.RProyecto;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SProyecto {
     @Autowired
    RProyecto rProyecto;
    
    public List<Proyecto> list(){
        return rProyecto.findAll();
    }
    
    public Optional<Proyecto> getOne(String id){
        return rProyecto.findById(id);
    }
    
    public Optional<Proyecto> getByNombreProy(String nombreProy){
        return rProyecto.findByNombreProy(nombreProy);
    }
    
    public void save(Proyecto proyecto){
        rProyecto.save(proyecto);
    }
    
    public void delete(String id){
        rProyecto.deleteById(id);
    }
    
    public boolean existsById(String id){
        return rProyecto.existsById(id);
    }
    
    public boolean existsByNombreProy(String nombreProy){
        return rProyecto.existsByNombreProy(nombreProy);
    }
}
