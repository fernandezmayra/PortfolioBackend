package com.portfolio.mcfs.Dto;

import javax.validation.constraints.NotBlank;


public class dtoExperiencia {
    @NotBlank
    private String nombreE;
    @NotBlank
    private String descripcionE;
    @NotBlank
    private int inicio;
    @NotBlank
    private int fin;

    public dtoExperiencia() {
    }

    public dtoExperiencia(String nombreE, String descripcionE, int inicio, int fin) {
        this.nombreE = nombreE;
        this.descripcionE = descripcionE;
        this.inicio = inicio;
        this.fin = fin;
    }

    public String getNombreE() {
        return nombreE;
    }

    public void setNombreE(String nombreE) {
        this.nombreE = nombreE;
    }

    public String getDescripcionE() {
        return descripcionE;
    }

    public void setDescripcionE(String descripcionE) {
        this.descripcionE = descripcionE;
    }

    public int getInicio() {
        return inicio;
    }

    public void setInicio(int inicio) {
        this.inicio = inicio;
    }

    public int getFin() {
        return fin;
    }

    public void setFin(int fin) {
        this.fin = fin;
    }
    
}
