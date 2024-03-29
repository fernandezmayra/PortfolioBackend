package com.portfolio.mcfs.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @NotNull
    @Size(min = 1, max = 50, message = "no cumple con la longitud")
    private String nombre;
    
    @NotNull
    @Size(min = 1, max = 50, message = "no cumple con la longitud")
    private String apellido;
    
    @NotNull
    private String descripcion;
    
    @NotNull
    private String titulo;
    
    @NotNull
    private String email;
            
    private String img;
    
    private String imgBackground;
    
    private String twitter;
    
    private String facebook;
    
    private String instagram;
    
    public Persona() {
    }

    public Persona(String nombre, String apellido, String descripcion, String img, String titulo, String email, String imgBackground, String twitter, String facebook, String instagram) {
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
