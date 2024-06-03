package com.mycompany.ejercicioherencia;

public class microbus extends vehiculo {
    private int nAsientos;
    private int nPisos;
    private int Año;

    public microbus(int nAsientos, int nPisos, int Año, String Marca, String Modelo, String Pais_de_produccion, String Motor, String Color, int Precio) {
        //ATRIBUTOS DE LA CLASE PADRE, SE UTILIZA UN SUPER
        super(Marca, Modelo, Pais_de_produccion, Motor, Color, Precio);
        this.nAsientos = nAsientos;
        this.nPisos = nPisos;
        this.Año = Año;
    }

    public int getnAsientos() {
        return nAsientos;
    }

    public void setnAsientos(int nAsientos) {
        this.nAsientos = nAsientos;
    }

    public int getnPisos() {
        return nPisos;
    }

    public void setnPisos(int nPisos) {
        this.nPisos = nPisos;
    }

    public int getAño() {
        return Año;
    }

    public void setAño(int Año) {
        this.Año = Año;
    }
    
}