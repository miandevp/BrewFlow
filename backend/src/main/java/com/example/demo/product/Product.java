package com.example.demo.product;


public class Product{

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