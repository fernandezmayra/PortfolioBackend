package com.portfolio.mcfs.Dto;

import javax.validation.constraints.NotBlank;

public class dtoProyecto {
    @NotBlank
    private String id;
    @NotBlank
    private String nombreProy;
    @NotBlank
    private String descProy;
    @NotBlank
    private String imgProy;

    public dtoProyecto() {
    }

    public dtoProyecto(String id, String nombreProy, String descProy, String imgProy) {
        this.id = id;
        this.nombreProy = nombreProy;
        this.descProy = descProy;
        this.imgProy = imgProy;
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
}
