package com.portfolio.mcfs.Dto;

import javax.validation.constraints.NotBlank;

public class dtoPersona {
    @NotBlank
    private String nombre;
    @NotBlank
    private String apellido;
    @NotBlank
    private String descripcion;
    @NotBlank
    private String img;
    @NotBlank
    private String titulo;
    @NotBlank
    private String email;
    @NotBlank
    private String imgBackground;
    private String twitter;
    private String facebook;
    private String instagram;

    public dtoPersona() {
    }

    public dtoPersona(String nombre, String apellido, String descripcion, String img, String titulo, String email, String imgBackground, String twitter, String facebook, String instagram) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.descripcion = descripcion;
        this.img = img;
        this.titulo = titulo;
        this.email = email;
        this.imgBackground = imgBackground;
        this.twitter = twitter;
        this.facebook = facebook;
        this.instagram = instagram;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getImgBackground() {
        return imgBackground;
    }

    public void setImgBackground(String imgBackground) {
        this.imgBackground = imgBackground;
    }

    public String getTwitter() {
        return twitter;
    }

    public void setTwitter(String twitter) {
        this.twitter = twitter;
    }

    public String getFacebook() {
        return facebook;
    }

    public void setFacebook(String facebook) {
        this.facebook = facebook;
    }

    public String getInstagram() {
        return instagram;
    }

    public void setInstagram(String instagram) {
        this.instagram = instagram;
    }
    
}
