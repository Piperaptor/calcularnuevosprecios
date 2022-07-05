package com.metodos.calcularnuevosprecios.models;

import javax.persistence.*;

@Entity
@Table(name = "calculo")
public class CalculoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id",unique = true,nullable = false)
    private int id;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "precio")
    private int precio;

    @Column(name = "preciodolar")
    private float preciodolar;

    @Column(name = "precioeuro")
    private float precioeuro;

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

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public float getPrecioDolar() {
        return preciodolar;
    }

    public void setPrecioDolar(float preciodolar) {
        this.preciodolar = preciodolar;
    }

    public float getPrecioEuro() {
        return precioeuro;
    }

    public void setPrecioEuro(float precioeuro) {
        this.precioeuro = precioeuro;
    }
}
