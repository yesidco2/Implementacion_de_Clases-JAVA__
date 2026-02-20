package com.example;

public class Product {

    private int id;
    private String nombre;
    private String descripcion;
    private double precio;

    public Product() {
        this.id = 0;
        this.nombre = "";
        this.descripcion = "";
        this.precio = 0.0;
    }

    public Product(int id, String nombre, String descripcion, double precio) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setId(int id) {
        if (id >= 0) {
            this.id = id;
        } else {
            throw new IllegalArgumentException("El ID no puede ser negativo.");
        }
    }
}