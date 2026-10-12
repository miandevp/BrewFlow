package com.example.demo.product;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity 
public class Product{

    @Id 
    @GeneratedValue 
    private Long id;

    private String Nombre;
    private String Descripcion;

    public Product(String Nombre, String Descripcion){
        this.Nombre = Nombre;
        this.Descripcion = Descripcion;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getDescripcion() {
        return Descripcion;
    }

}