package com.mycompany.ejercicioherencia;

    public class moto extends vehiculo {
    private String Estado;
    private String Cilindraje;
    private int AñoF;

    public moto(String Estado, String Cilindraje, int AñoF, String Marca, String Modelo, String Pais_de_produccion, String Motor, String Color, int Precio) {
        super(Marca, Modelo, Pais_de_produccion, Motor, Color, Precio);
        this.Estado = Estado;
        this.Cilindraje = Cilindraje;
        this.AñoF = AñoF;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public String getCilindraje() {
        return Cilindraje;
    }

    public void setCilindraje(String Cilindraje) {
        this.Cilindraje = Cilindraje;
    }

    public int getAñoF() {
        return AñoF;
    }

    public void setAñoF(int AñoF) {
        this.AñoF = AñoF;
    }

    
    
}
