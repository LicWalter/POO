package com.mycompany.ejercicioherencia;
    
    public class carro extends vehiculo {
    private int kilometraje;
    private String Estado;
    private int AñoF;  

    public carro(int kilometraje, String Estado, int AñoF, String Marca, String Modelo, String Pais_de_produccion, String Motor, String Color, int Precio) {
        super(Marca, Modelo, Pais_de_produccion, Motor, Color, Precio);
        this.kilometraje = kilometraje;
        this.Estado = Estado;
        this.AñoF = AñoF;
    }

    public int getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(int kilometraje) {
        this.kilometraje = kilometraje;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public int getAñoF() {
        return AñoF;
    }

    public void setAñoF(int AñoF) {
        this.AñoF = AñoF;
    }
   
    
    
}