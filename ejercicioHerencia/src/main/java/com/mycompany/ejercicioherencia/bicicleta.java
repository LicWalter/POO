package com.mycompany.ejercicioherencia;

public class bicicleta extends vehiculo {
    private String tipo;
    private String materialMarco;
    private int pesoMaximo;

    public bicicleta(String tipo, String materialMarco, int pesoMaximo, String Marca, String Modelo, String Pais_de_produccion, String Motor, String Color, int Precio) {
        super(Marca, Modelo, Pais_de_produccion, Motor, Color, Precio);
        this.tipo = tipo;
        this.materialMarco = materialMarco;
        this.pesoMaximo = pesoMaximo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMaterialMarco() {
        return materialMarco;
    }

    public void setMaterialMarco(String materialMarco) {
        this.materialMarco = materialMarco;
    }

    public int getPesoMaximo() {
        return pesoMaximo;
    }

    public void setPesoMaximo(int pesoMaximo) {
        this.pesoMaximo = pesoMaximo;
    }

    
    
}
