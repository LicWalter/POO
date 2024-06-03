package com.mycompany.ejercicioherencia;

public class vehiculo {
    String Marca;
    String Modelo;
    String Pais_de_produccion;
    String Motor;
    String Color;
    int Precio;

    
    public vehiculo(String Marca, String Modelo, String Pais_de_produccion, String Motor, String Color, int Precio) {
        this.Marca = Marca;
        this.Modelo = Modelo;
        this.Pais_de_produccion = Pais_de_produccion;
        this.Motor = Motor;
        this.Color = Color;
        this.Precio = Precio;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public String getPais_de_produccion() {
        return Pais_de_produccion;
    }

    public void setPais_de_produccion(String Pais_de_produccion) {
        this.Pais_de_produccion = Pais_de_produccion;
    }

    public String getMotor() {
        return Motor;
    }

    public void setMotor(String Motor) {
        this.Motor = Motor;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public int getPrecio() {
        return Precio;
    }

    public void setPrecio(int Precio) {
        this.Precio = Precio;
    }

    
}