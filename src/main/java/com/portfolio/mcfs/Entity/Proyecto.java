package com.portfolio.mcfs.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Proyecto {
    @Id
    private String id;
    private String nombreProy;
    private String descProy;
    private String imgProy;

    public Proyecto() {
    }

    public Proyecto(String id, String nombreProy, String descProy, String imgProy) {
        this.id = id;
        this.nombreProy = nombreProy;
        this.descProy = descProy;
        this.imgProy = imgProy;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombreProy() {
        return nombreProy;
    }

    public void setNombreProy(String nombreProy) {
        this.nombreProy = nombreProy;
    }

    public String getDescProy() {
        return descProy;
    }

    public void setDescProy(String descProy) {
        this.descProy = descProy;
    }

    public String getImgProy() {
        return imgProy;
    }

    public void setImgProy(String imgProy) {
        this.imgProy = imgProy;
    }
    
}
