package com.portfolio.mcfs.Dto;

import javax.validation.constraints.NotBlank;

public class dtoProyecto {
    @NotBlank
    private String nombreProy;
    @NotBlank
    private String descProy;
    @NotBlank
    private String imgProy;

    public dtoProyecto() {
    }

    public dtoProyecto(String nombreProy, String descProy, String imgProy) {
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
    
}
